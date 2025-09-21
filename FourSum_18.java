import java.util.*;
public class FourSum_18 {

    public static List<List<Integer>> fourSum(int nums[], int target){
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<nums.length-3; i++){

            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }

            for(int j=i+1; j<nums.length-2; j++){
                int left = j + 1;
                int right = nums.length - 1;

                if(j>i+1 && nums[j] == nums[j-1]){
                    continue;
                }


                while(left < right){
                    long sum =(long) nums[i] + nums[j] + nums[left] + nums[right];

                    if(sum == target){
                        List<Integer> Quadrat = new ArrayList<>();
                        Quadrat.add(nums[i]);
                        Quadrat.add(nums[j]);
                        Quadrat.add(nums[left]);
                        Quadrat.add(nums[right]);
                        result.add(Quadrat);

                    while(left<right && nums[left] == nums[left+1]){
                        left++;
                    }
                    while(left<right && nums[right] == nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                    }else if(sum < target){
                        left++;
                    }else{
                        right--;
                    }
                }
            } 
        }
        return result;
    }
    public static void main(String args[]){
        int nums[] = {1,0,-1,0,-2,2};
        int target = 0;

        List<List<Integer>> result = fourSum(nums, target);

        System.out.println(result);
    }
}
