import java.util.*;
public class helperObject {
    public int[][] flipAndInvertImage(int[][] image) {
        int l1 = image.length;
        int l2 = image[0].length;
        int[][] result = new int[l1][l2];
        for(int i = 0; i < l1; i++){
            for(int j = 0; j < l2; j++){
                if(image[i][j] == 0){
                    result[i][l2 - 1 - j] = 1;
                }
                else{
                    result[i][l2 - 1 - j] = 0;
                }
            }
        }
        return result;
    }
}

