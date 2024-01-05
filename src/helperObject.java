import java.util.*;
public class helperObject {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right){
            if(height[left] > height[right]){
                int temp = (right-left) * height[right];
                if(temp > max){
                    max = temp;
                }
            }
            else{
                int temp = (right-left) * height[left];
                if(temp > max){
                    max = temp;
                }
            }
            if(height[left]>height[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return max;
    }

}

