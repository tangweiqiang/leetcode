package javasolution;

/**
 * Created by 汤伟强 on 2015/6/11.
 */
public class Solution073 {
    public void setZeroes(int[][] matrix) {
        if (matrix==null || matrix[0]==null)return;
        boolean firstRow = false;
        boolean firstCul = false;
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0 )
                firstRow = true;
        }
        for (int i = 0; i < n; i++) {
            if (matrix[0][i] == 0)
                firstCul = true;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                if (matrix[i][0]==0 || matrix[0][j]==0)
                    matrix[i][j]=0;

        if (firstRow == true)
            for (int i = 0; i < m; i++)
                matrix[i][0]=0;

        if (firstCul == true)
            for (int i = 0; i < n; i++)
                matrix[0][i]=0;
    }

    public static void main(String[] args) {
        int matrix[][] = {{0,0,0,5},{4,3,1,4},{0,1,1,4},{1,2,1,3},{0,0,1,1}};
        new Solution073().setZeroes(matrix);
    }
}
