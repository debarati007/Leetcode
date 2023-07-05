package Misc.DP;

import java.util.Arrays;

public class LongestIncreasingSubsequence{
    public int lengthOfLIS(int[] nums) {
//dp[i] = represents the length of the longest increasing subsequence that ends with the ith element

//dp[i] = max(dp[j] + 1) for all j where nums[j] < nums[i] and j < i
//dp[3]=max(dp[3],dp[2]+1)

        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);

        for(int i=1;i<dp.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }

        int longest =0;
        for(int i:dp){
            longest=Math.max(i,longest);
        }
        return longest;
    }
}