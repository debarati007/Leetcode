package Misc.DSA;

import java.util.Arrays;

public class GridUniquePaths {
    //recursive solution
    //base case : when reached at end i.e i=n-1 and j=m-1,return 1.
    //result from right subtree+left recursive subtree gives the result.
    //always we have 2 states. from (0,0)->(0,1) or (1,0).From (0,1)->(1,1) or (0,2) and so on..
    //tc: exponential , sc: exponential
    public int uniquePaths(int m, int n) {
        return countPath(0, 0, m, n);
    }

    int countPath(int i, int j, int n, int m) {
        if (i == (n - 1) && j == (m - 1)) {
            return 1;
        }
        if (i >= n || j >= m)
            return 0;
        else return countPath(i + 1, j, n, m) + countPath(i, j + 1, n, m);
    }

    //Dynamic programming approach
    //there are 2 states (i and j) and their max value could be (n,m)
    //hence total number of states could be n*m
    //I am creating a hashtable of m*n
    //initialize everything as -1.
    //in left subtree where ever we get 1,we store in table,next time when we come across same recursive call,
    //we use the value stored in dp table instead of computing again
    //tc:O(n*m) and sc : O(n*m)
    int dp[][];

    public int uniquePathsOptimized(int m, int n) {
        dp = new int[m][n];
        //fill all rows in dp table with -1 initially.
        for (int[] rows : dp) Arrays.fill(rows, -1);
        return countPath(0, 0, m, n, dp);
    }

    int countPath(int i, int j, int n, int m, int[][] dp) {
        if (i == (n - 1) && j == (m - 1)) {
            return 1;
        }
        if (i >= n || j >= m)
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];
        else return dp[i][j] = countPath(i + 1, j, n, m, dp) + countPath(i, j + 1, n, m, dp);
    }

}
