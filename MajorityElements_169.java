import java.util.*;
public class MajorityElements_169 {
    public static int majorityElement(int[] nums){
        int point = 1;
        int i = 0;
        int candidate = nums[i];

        for(i=1; i<nums.length; i++){
            if(candidate==nums[i]){
                point++;
            }else{
                point--;
                if(point<0){
                    candidate = nums[i];
                    point++;
                }
            }
        }
        return candidate;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size :");
        int size = sc.nextInt();

        int nums[] = new int[size];
        System.out.println("Enter The Elements : ");
        for(int i=0; i<size; i++){
            nums[i] = sc.nextInt();

            int k = majorityElement(nums);
            System.out.println(k);
        }
    }
}
