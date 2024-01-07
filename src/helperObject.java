import java.util.*;
public class helperObject {
    public boolean isValidSudoku(char[][] board) {
        int[] count = new int[9];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                char[] chars = new char[9];
                chars[0] = board[0 + (3*i)][0 + (3*j)];
                chars[1] = board[0 + (3*i)][1 + (3*j)];
                chars[2] = board[0 + (3*i)][2 + (3*j)];
                chars[3] = board[1 + (3*i)][0 + (3*j)];
                chars[4] = board[1 + (3*i)][1 + (3*j)];
                chars[5] = board[1 + (3*i)][2 + (3*j)];
                chars[6] = board[2 + (3*i)][0 + (3*j)];
                chars[7] = board[2 + (3*i)][1 + (3*j)];
                chars[8] = board[2 + (3*i)][2 + (3*j)];
                for(char c : chars){
                    if(c != '.'){
                        if(count[c - 49] == 1){
                            return false;
                        }
                        count[c - 49]++;
                    }
                }

                count = new int[9];
            }
        }
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char c = board[i][j];
                if(c != '.'){
                    if(count[c - 49] > 0){
                        return false;
                    }
                    count[c - 49]++;
                }
            }
            count = new int[9];
        }
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char c = board[j][i];
                if(c != '.'){
                    if(count[c - 49] > 0){
                        return false;
                    }
                    count[c - 49]++;
                }
            }
            count = new int[9];
        }
        return true;
    }
}

