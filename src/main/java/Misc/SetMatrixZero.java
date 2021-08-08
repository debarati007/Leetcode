package Misc;

public class SetMatrixZero {
//brute force approach
    //traverse the matrix and for each 0 encountered,make that row and col -1
    //but do not change the 0 value cell
    //else all other cells will be impacted
    //after traversing is complete,make all -1s zero.
    //will only work if inputs are >0 or -1 will not come as input

    public void setZeroes(int[][] matrix) {
        //setting -1 for that row and column
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    changeRowColumn(matrix, matrix.length, matrix[0].length, i, j);
                }
            }
        }
        //converting -1 to zero
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void changeRowColumn(int[][] mat, int M, int N, int x, int y) {
        for (int j = 0; j < N; j++) {
            if (mat[x][j] != 0) {
                mat[x][j] = -1;
            }
        }
        for (int i = 0; i < M; i++) {
            if (mat[i][y] != 0) {
                mat[i][y] = -1;
            }
        }
    }

//optimized solution
//Rather than using additional variables to keep track of rows and columns to be reset, we use the matrix itself as the indicators
//we use the first cell of every row and column as a flag. This flag would determine whether a row or column has been set to zero. This means for every cell instead of going to M+NM+N cells and setting it to zero we just set the flag in two cells.
/*If the first cell of a row is set to zero this means the row should be marked zero. If the first cell of a column is set to zero this means the column should be marked zero.
Algorithm
We iterate over the matrix and we mark the first cell of a row i and first cell of a column j, if the condition in the pseudo code above is satisfied. i.e. if cell[i][j] == 0.
The first cell of row and column for the first row and first column is the same i.e. cell[0][0]. Hence, we use an additional variable to tell us if the first column had been marked or not and the cell[0][0] would be used to tell the same for the first row.
Now, we iterate over the original matrix starting from second row and second column i.e. matrix[1][1] onwards. For every cell we check if the row r or column c had been marked earlier by checking the respective first row cell or first column cell. If any of them was marked, we set the value in the cell to 0. Note the first row and first column serve as the row_set and column_set that we used in the first approach.
We then check if cell[0][0] == 0, if this is the case, we mark the first row as zero.
And finally, we check if the first column was marked, we make all entries in it as zeros.
*/
public void setZeroesOptimized(int[][] m) {
    int row=m.length;
    int col=m[0].length;
    boolean isCol=false;
    for(int i=0;i<row;i++){
        if(m[i][0]==0)
            isCol=true;
        for(int j=1;j<col;j++){
            if(m[i][j]==0){
                m[i][0]=0;
                m[0][j]=0;
            }
        }
    }
    for(int i=1;i<row;i++){
        for(int j=1;j<col;j++){
            if(m[i][0]==0 || m[0][j]==0){
                m[i][j]=0;
            }
        }

    }
    if(m[0][0]==0){
        for(int j=0;j<col;j++){
            m[0][j]=0;
        }
    }
    if(isCol){
        for(int i=0;i<row;i++){
            m[i][0]=0;
        }
    }


}

}
