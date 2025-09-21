import java.util.*;
public class sum3_15 {
    public static void sum(int nums[]){
        int n = nums.length;
        if(n<3){
            System.out.println();
        }

        Arrays.sort(nums);
        int i = 0, j = 1, k = n-1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();

        int []nums = new int[n];
        System.out.println("Enter array elements :");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
    }
}
