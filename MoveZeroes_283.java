import java.util.*;
public class MoveZeroes_283 {
    public static void movezeroes(int []nums){
        int j = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();

        int []nums = new int [n];
        System.out.println("Enter the Elements : ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
    }
}
