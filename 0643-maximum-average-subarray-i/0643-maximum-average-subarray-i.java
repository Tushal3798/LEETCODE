class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start_Idx = 0;
        int end_Idx = k-1;
        int sum = 0;
        int max_sum = 0;
        
        for(int i=start_Idx; i<=end_Idx; i++){
            sum += nums[i];
        }
        max_sum = sum;
        
        while(end_Idx < nums.length-1){
            sum = sum + nums[end_Idx+1] - nums[start_Idx];
            end_Idx++;
            start_Idx++;
            max_sum = Math.max(max_sum, sum);
        }
        double max_avg = (double)max_sum/k;
        return max_avg;
    }
}