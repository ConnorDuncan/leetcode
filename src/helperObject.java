import java.util.*;
public class helperObject {
    public boolean checkRecord(String s) {
        int[] myInfo = new int[2]; // 0 = 'A' 1 = 'L'
        int len = s.length();
        for(int i = 0; i < len; i++){
            char c = s.charAt(i);
            if(c == 'A'){
                myInfo[0]++;
                myInfo[1] = 0;
            }
            else if(c == 'L'){
                myInfo[1]++;
                if(myInfo[1] >= 3){
                    return false;
                }
            }
            else{
                myInfo[1] = 0;
            }
        }
        if(myInfo[0] > 1){
            return false;
        }
        return true;
    }
}

