import java.util.*;
public class helperObject {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] result = new int[image.length][image[0].length];
        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[0].length; j++){
                if(image[i][j] == 0){
                    result[i][image[0].length - 1 - j] = 1;
                }
                else{
                    result[i][image[0].length - 1 - j] = 0;
                }
            }
        }
        return result;
    }
}

