package Misc.DSA;

public class RotateMatrix {
    //transposing the matrix and reversing its each row afterwards rotates the matrix.
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }
    public void transpose(int[][] matrix){
        //converting rows to columns and columns to rows
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[j][i];
                matrix[j][i]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }

    }
    public void reverse(int[][] matrix){
        //reversing each row of transposed matrix gives the result
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;;
            }
        }
    }


}
