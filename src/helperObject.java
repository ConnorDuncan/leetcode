import java.util.*;
public class helperObject {
    public int totalMoney(int n) {
        int sum = 1;
        int yesterday = 1;
        int lastMonday = 1;
        int days = 1;
        n--;
        while(n != 0){
            if(days % 7 == 0){ // it's monday
                sum += lastMonday + 1;
                lastMonday++;
                yesterday = lastMonday;
            }
            else{
                sum += yesterday + 1;
                yesterday++;
            }
            n--;
            days++;
        }
        return sum;
    }

}

