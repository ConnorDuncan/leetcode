import java.util.*;
public class helperObject {
    public int buyChoco(int[] prices, int money) {
        int min = prices[0];
        int minSecond = prices[1];
        if(minSecond < min){
            int temp = minSecond;
            minSecond = min;
            min = temp;
        }
        for(int i = 2; i < prices.length; i++){
            if(minSecond > prices[i]){
                minSecond = prices[i];
            }
            if(minSecond < min){
                int temp = minSecond;
                minSecond = min;
                min = temp;
            }
        }
        if(min + minSecond > money){
            return money;
        }
        else{
            return money - min - minSecond;
        }
    }
}

