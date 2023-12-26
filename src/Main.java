import java.util.*;
public class Main {
    public static void main(String[] args) {
        String[] strings = {"ab", "a"};
        System.out.println(longestCommonPrefix(strings));

    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        boolean running = true;
        String prefix = "";
        boolean isPrefix = true;
        int i = 0;
        char curChar = 'T';
        int smallestIndex = 0;
        for(int j = 1; j < strs.length; j++){
            if (strs[smallestIndex].length() > strs[j].length()){
                    smallestIndex = j;
            }
        }
        while(running){
            if(strs[smallestIndex].length() == 0 || i > strs[smallestIndex].length() - 1){
                running = false;
                isPrefix = false;
            }
            else {
                curChar = strs[0].charAt(i);
            }
            for(int j = 1; j < strs.length; j++){
                if(i < strs[j].length() && strs[j].charAt(i) != curChar){
                    isPrefix = false;
                    running = false;
                }
            }
            if(isPrefix){
                prefix += curChar;
            }
            i++;
        }
        return prefix;
    }
}