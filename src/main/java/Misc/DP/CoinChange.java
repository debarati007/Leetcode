package Misc.DP;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        //coins[]-coins of different denominations
        //coins[i]- coin in ith index
        //amount - a total amount of money
        //dp[i]-fewest number of coins to make up amount i
        int[] dp=new int[amount+1];
        //if amount 0 , dp[0]=0

        //initialize all array with max value as we need to get the min value
        for(int i=0;i<dp.length;i++){
            dp[i]=Integer.MAX_VALUE;
        }

        dp[0]=0;
        for(int i=1;i<dp.length;i++){
            for(int j=0;j<coins.length;j++){
                if(coins[j]<=i && i-coins[j] >=0 && dp[i-coins[j]]!=Integer.MAX_VALUE){
                    dp[i]=Math.min(dp[i-coins[j]]+1,dp[i]);
                }
                }
            }
        // System.out.println("============");
        // for(int i:dp){
        //     System.out.print(i+" ");
        // }
        // System.out.println("============");

        return dp[amount]!=Integer.MAX_VALUE?dp[amount]:-1;


    }
}
