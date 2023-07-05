package Misc.DP;

public class HouseRobber {

    /*
    Input: nums = [2,7,9,3,1]
    Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
Total amount you can rob = 2 + 9 + 1 = 12./
     */
    public int rob(int[] nums) {
        //nums[i] =  money in ith index
        //i= house number
        //dp[i]=max amount of money robbing possinble from house numbbr 0 to i iff you try to pick i.
        int[] dp= new int[nums.length];
        dp[0]=nums[0];
        if(nums.length==1){return nums[0];}
        dp[1]= Math.max(dp[0],nums[1]);
        //to rob house from 0 to 2, we either rob house 2 and max amount robbed from house 0 to 0 or
        //rob 2nd house which is nums[1] whichever is max between them.
        // dp[2]= Math.max(nums[2]+dp[0],dp[1])
        for(int i=2;i<nums.length;i++){
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[nums.length-1];
    }
}
