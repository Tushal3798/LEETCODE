class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Input array is empty or null");
        }
    
        int maxSum = nums[0];
        int currentSum = nums[0];
    
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
    
        return maxSum;
    }
}