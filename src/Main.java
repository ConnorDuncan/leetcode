import java.util.*;
public class Main {
    public static void main(String[] args) {
        java.lang.String romanNumerals = "LVIII";
        int sum = 0;
        System.out.println("Hello world!");
        HashMap<Character, Integer> myMap = new HashMap<Character, Integer>();
        myMap.put('M', 1000);
        myMap.put('D', 500);
        myMap.put('C', 100);
        myMap.put('L', 50);
        myMap.put('X', 10);
        myMap.put('V', 5);
        myMap.put('I', 1);
        int i = 0;
        for(i = 0; i < romanNumerals.length() - 1; i++){
            if(myMap.get(romanNumerals.charAt(i)) < myMap.get(romanNumerals.charAt(i+1))){
                sum += myMap.get(romanNumerals.charAt(i+1)) - myMap.get(romanNumerals.charAt(i));
                i++;
            }
            else{
                sum += myMap.get(romanNumerals.charAt(i));
            }
        }
        if(i < romanNumerals.length()){
            sum += myMap.get(romanNumerals.charAt(romanNumerals.length() - 1));
        }
        System.out.println(sum);

    }
}