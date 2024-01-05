import java.util.*;
public class helperObject {
    public int firstBadVersion(int n) {
        long min = 1;
        long max = n;
        long mid = (1 + n)/2;
        while(min < max){
            boolean isBad = isBadVersion((int)mid);
            if(isBad && isBadVersion((int)mid - 1) == false){
                return (int)mid;
            }
            else if(!isBad){
                min = mid + 1;
                mid = (max + min) / 2;
            }
            else{
                max = mid - 1;
                mid = (max + min) / 2;
            }
        }
        return (int)min;
    }
}

