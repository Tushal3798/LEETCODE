import java.util.*;
public class ThreeSum_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<nums.length-2; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            
            while(left < right){
                int value = nums[i] + nums[left] + nums[right];
                if(value == 0){
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[left]);
                    triplet.add(nums[right]);
                    result.add(triplet);

                    while(left<right && nums[left] == nums[left+1]){
                        left++;
                    }
                    while(left<right && nums[right] == nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }else if(value < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return result;
    }
    public static void main(String args[]){
        int nums[] = {-1, 0, 1, 2, -1, -4};

        ThreeSum_15 solver = new ThreeSum_15();

        List<List<Integer>> result = new ArrayList<>();

        result = solver.threeSum(nums);

        System.out.println(result);
    }
}
