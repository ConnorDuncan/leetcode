import java.util.*;
public class helperObject {
    public String mergeAlternately(String word1, String word2) {
        boolean onWordOne = true;
        int indexWordOne = 0;
        int indexWordTwo = 0;
        StringBuilder myBuilder = new StringBuilder();
        while(indexWordOne < word1.length() && indexWordTwo < word2.length()){
            if(onWordOne){
                myBuilder.append(word1.charAt(indexWordOne));
                indexWordOne++;
            }
            else{
                myBuilder.append(word2.charAt(indexWordTwo));
                indexWordTwo++;
            }
            onWordOne = !onWordOne;
        }
        if(indexWordOne < word1.length()){
            myBuilder.append(word1.substring(indexWordOne));
        }
        else if(indexWordTwo < word2.length()){
            myBuilder.append(word2.substring(indexWordTwo));
        }
        return myBuilder.toString();
    }
}

