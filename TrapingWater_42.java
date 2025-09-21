import java.util.*;
public class TrapingWater_42{
    public static int trap(int []height){
        if(height == null || height.length<3){
            return 0;
        }
        int left = 0;
        int right = height.length-1;
        int rightmax = 0;
        int leftmax = 0;
        int sum = 0;

        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>=leftmax){
                    leftmax = height[left];
                }else{
                    sum = sum + leftmax - height[left];
                }
                left++;
            }else{
                if(height[right]>=rightmax){
                    rightmax = height[right];
                }else{
                    sum = sum + rightmax - height[right];
                }
                right--;
            }
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size :");
        int n = sc.nextInt();

        int []height = new int[n];
        System.out.println("Enter Array Elements : ");
        for(int i=0; i<n; i++){
            height[i] = sc.nextInt();
        }
        System.out.println("The Traped Rain Water : " + trap(height));
    }
}