package Misc.DP;

public class ClimbingStairs {
//    Input: n = 3
//    Output: 3
//    Explanation: There are three ways to climb to the top.
//1. 1 step + 1 step + 1 step
//2. 1 step + 2 steps
//3. 2 steps + 1 step

    public int climbStairs(int n) {
        //n is the number of stairs
        //dp[n] is the distinct ways to go from 0 to nth stair
        int[] dp = new int[n+1];
        dp[0]=1;
        dp[1]=1;
        //dp[2]=dp[0]+dp[1] means
        for(int i=2;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

}
