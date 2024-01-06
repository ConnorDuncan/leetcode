import java.util.*;
public class helperObject {
    public boolean lemonadeChange(int[] bills) {
        int numFives = 0;
        int numTens = 0;
        int numTwentys = 0;
        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5){
                numFives++;
            }
            else if(bills[i] == 10){
                if(numFives < 1){
                    return false;
                }
                numFives--;
                numTens++;
            }
            else{
                if(numFives < 1){
                    return false;
                }
                else if(numFives == 1 && numTens < 1){
                    return false;
                }
                else if(numFives == 2 && numTens < 1){
                    return false;
                }
                if(numTens >= 1){
                    numTens--;
                    numFives--;
                }
                else{
                    numFives -= 3;
                }
                numTwentys++;
            }
        }
        return true;
    }
}

