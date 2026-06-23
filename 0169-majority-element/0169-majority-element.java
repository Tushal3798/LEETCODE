class Solution {
    public int majorityElement(int[] nums) {
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
}