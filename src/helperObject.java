import java.util.*;
public class helperObject {
    /* Original slower solution that finds max occurrence, regardless of that amount of occurrence and if sorted
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < arr.length; i++){
            if(myMap.containsKey(arr[i])){
                myMap.put(arr[i], myMap.get(arr[i]) + 1);
            }
            else{
                myMap.put(arr[i], 1);
            }
        }
        int max = 0;
        int maxVal = 0;
        for(int i : myMap.keySet()){
            int temp = myMap.get(i);
            if(temp > max){
                max = temp;
                maxVal = i;
            }
        }
        return maxVal;
    }
     */

    // New solution that only works for occurrence that is greater than 25% and if array is sorted
    public int findSpecialInteger(int[] arr) {
        for(int i = 0; i < arr.length - (arr.length / 4); i++){
            if(arr[i] == arr[i + (arr.length / 4)]){
                return arr[i];
            }
        }
        return -1;
    }

}

