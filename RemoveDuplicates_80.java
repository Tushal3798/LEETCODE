import java.util.*;
public class RemoveDuplicates_80 {
    public static int RemoveDuplicate(int []nums){
        if(nums.length <= 2){
            return nums.length;
        }
        int i = 2;
        for(int j=2; j<nums.length; j++){
            if(nums[j] != nums[i-2]){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size : ");
        int n = sc.nextInt();

        int nums[] = new int[n];
        System.out.println("Enter Sorted Elements : ");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
    }
}
