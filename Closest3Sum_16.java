import java.util.*;
public class Closest3Sum_16 {

    public static int closestSum(int nums[], int target){
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[2];
        int difference = Math.abs(sum - target);
        
        for(int i=0; i<nums.length-2; i++){
            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){
                int sum3 = nums[i] + nums[left] + nums[right];

                int closest = Math.abs(sum3 - target);

                if(closest < difference){
                    difference = closest;
                    sum = sum3;
                }

                if(sum3 < target){
                    left++;
                }else if(sum3 > target){
                    right--;
                }else{
                    return sum3;
                }
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int nums[] = {-1,2,1,-4};
        int target = 1;

        int sum = closestSum(nums, target);

        System.out.println("Closest sum : " + sum);
    }
}
