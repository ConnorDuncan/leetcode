import java.util.*;
public class helperObject {
    public String addBinary(String a, String b) {
        StringBuilder myBuilder = new StringBuilder();
        boolean remainder = false;
        StringBuilder tempA = new StringBuilder(a);
        StringBuilder tempB = new StringBuilder(b);
        while(tempA.length() > tempB.length()){
            tempB.insert(0, '0');
        }
        while(tempA.length() < tempB.length()){
            tempA.insert(0, '0');
        }
        a = tempA.toString();
        b = tempB.toString();
        for(int i = a.length() - 1; i > -1; i--){
            char aChar = a.charAt(i);
            char bChar = b.charAt(i);
            if(aChar == '0' && bChar == '0' && !remainder){
                myBuilder.insert(0, '0');
            }
            else if(aChar == '0' && bChar == '0' && remainder){
                myBuilder.insert(0, '1');
                remainder = false;
            }
            else if((aChar == '0' && bChar == '1' && !remainder) || (aChar == '1' && bChar == '0' && !remainder)){
                myBuilder.insert(0, '1');
            }
            else if((aChar == '0' && bChar == '1' && remainder) || (aChar == '1' && bChar == '0' && remainder)){
                myBuilder.insert(0, '0');
            }
            else if(aChar == '1' && bChar == '1' && !remainder){
                remainder = true;
                myBuilder.insert(0, '0');
            }
            else{
                myBuilder.insert(0, '1');
            }
        }
        if(remainder){
            myBuilder.insert(0, '1');
        }
        return myBuilder.toString();
    }
}

