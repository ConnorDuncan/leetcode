import java.util.*;
public class helperObject {
    public int[][] transpose(int[][] matrix) {
        int r = matrix[0].length;
        int c = matrix.length;
        int[][] transpose = new int[r][c];
        for(int i = 0; i < c; i++){
            for(int j = 0; j < r; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

}

