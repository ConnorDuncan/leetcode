import java.util.*;
public class helperObject {
    public boolean isUgly(int n) {
        if(n <= 0){
            return false;
        }
        else if(n == 1){
            return true;
        }
        while(n % 2 == 0 || n % 3 == 0 || n % 5 == 0){
            if(n%5 == 0){
                n /= 5;
            }
            else if(n%3 == 0){
                n /= 3;
            }
            else{
                n /= 2;
            }
        }
        if(n == 1){
            return true;
        }
        return false;
    }

}

