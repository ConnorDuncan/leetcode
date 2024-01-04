import java.util.*;
public class helperObject {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < word1.length; i++){
            builder.append(word1[i]);
        }
        String wordOne = builder.toString();
        builder = new StringBuilder();
        for(int i = 0; i < word2.length; i++){
            builder.append(word2[i]);
        }
        String wordTwo = builder.toString();
        return wordOne.equals(wordTwo);
    }

}

