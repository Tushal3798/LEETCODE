import java.util.*;
public class Triangle_976 {
    public static int triangle(int nums[]){
        Arrays.sort(nums);
        for(int i=nums.length-3; i>=0; i--){
            if(nums[i] + nums[i+1] > nums[i+2]){
                return nums[i] + nums[i+1] + nums[i+2];
            }
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size :  ");
        int n = sc.nextInt();

        int nums[] = new int[n];
        System.out.println("Enter array elements : ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Longest Parameter Triangle : " + triangle(nums));
    }
}
