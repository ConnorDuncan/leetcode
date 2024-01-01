import java.util.*;
public class helperObject {
    public int titleToNumber(String columnTitle) {
        HashMap<Character, Integer> characterMap = new HashMap<Character, Integer>();
        characterMap.put('A', 1);
        characterMap.put('B', 2);
        characterMap.put('C', 3);
        characterMap.put('D', 4);
        characterMap.put('E', 5);
        characterMap.put('F', 6);
        characterMap.put('G', 7);
        characterMap.put('H', 8);
        characterMap.put('I', 9);
        characterMap.put('J', 10);
        characterMap.put('K', 11);
        characterMap.put('L', 12);
        characterMap.put('M', 13);
        characterMap.put('N', 14);
        characterMap.put('O', 15);
        characterMap.put('P', 16);
        characterMap.put('Q', 17);
        characterMap.put('R', 18);
        characterMap.put('S', 19);
        characterMap.put('T', 20);
        characterMap.put('U', 21);
        characterMap.put('V', 22);
        characterMap.put('W', 23);
        characterMap.put('X', 24);
        characterMap.put('Y', 25);
        characterMap.put('Z', 26);
        int sum = 0;
        int j = 0;
        for(int i = columnTitle.length() - 1; i > -1; i--){
            sum += characterMap.get(columnTitle.charAt(i)) * Math.pow(26, j);
            j++;
        }
        return sum;
    }
}

