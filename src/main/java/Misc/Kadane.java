package Misc;

class Kadane {
/*
Step 0 : Initialize maxSum and currentSum = 0
Step 1 : Iterate over the array
Step 2 : If currentSum + nums[i] < nums[i] then currentSum = 0
Step 3 : Keep calculating currentSum for next elements
Step 4 : If currentSum > maxSum,maxSum = currentSum.

 */
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (currentSum + nums[i] < nums[i]) {
                currentSum = 0;
            }
            currentSum = currentSum + nums[i];
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}