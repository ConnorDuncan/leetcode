import java.util.*;
public class helperObject {
    /*
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
    */
    public String mergeAlternately(String word1, String word2) {
        int maxIndex = 0;
        int min = 0;
        if(word1.length() < word2.length()){
            min = word1.length();
        }
        else{
            min = word2.length();
        }
        StringBuilder myBuilder = new StringBuilder();
        for(int i = 0; i < min; i++){
            myBuilder.append(word1.charAt(i));
            myBuilder.append(word2.charAt(i));
            maxIndex++;
        }
        if(word1.length() > maxIndex){
            myBuilder.append(word1.substring(maxIndex));
        }
        else if(maxIndex < word2.length()){
            myBuilder.append(word2.substring(maxIndex));
        }
        return myBuilder.toString();
    }
}

