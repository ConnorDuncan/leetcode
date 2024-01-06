import java.util.*;
public class helperObject {
    public String toGoatLatin(String sentence) {
        StringBuilder builder = new StringBuilder();
        String[] words = sentence.split(" ");
        for(int i = 0; i < words.length; i++){
            char c = words[i].charAt(0);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                builder.append(words[i] + "ma");

            }
            else{
                words[i] = words[i].substring(1) + c;
                builder.append(words[i] + "ma");
            }
            for(int j = 0; j < i + 1; j++){
                builder.append("a");
            }
            if(i != words.length - 1){
                builder.append(" ");
            }
        }
        return builder.toString();
    }
}

