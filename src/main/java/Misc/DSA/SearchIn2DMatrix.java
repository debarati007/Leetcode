package Misc.DSA;

public class SearchIn2DMatrix {
    //edge test cases : [[1,3]] 3

    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int i=0,j=n-1;

        while(i<m && j>=0){
            if(matrix[i][j]==target)
                return true;
            if(matrix[i][j]>target)
                j--;
            else
                i++;
        }
        return false;
    }
}
