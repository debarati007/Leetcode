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
    public int maxSubArray2(int[] nums) {
        //prints the range 
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int start = 0;
        int end = 0;

        for(int i=0;i<nums.length;i++){

            if(currentSum+nums[i]<nums[i]){
                currentSum = 0;
                start = i;
            }
            currentSum = currentSum + nums[i];
            if(currentSum > maxSum ){
                maxSum = Math.max(maxSum,currentSum);
                end = i;
            }

        }
        for(int i=start;i<=end;i++){
            System.out.print(nums[i]+" ");

        }
        return maxSum;
    }
}