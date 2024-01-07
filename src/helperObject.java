import java.util.*;
public class helperObject {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> validEmails = new HashSet<String>();
        for(String s : emails){
            String[] splitArr = s.split("@"); // 1 is domain, 0 is local name
            boolean reading = true;
            StringBuilder builder = new StringBuilder();
            for(int i = 0; i < splitArr[0].length(); i++){
                if(reading){
                    char c = splitArr[0].charAt(i);
                    if(c == '.'){

                    }
                    else if(c == '+'){
                        reading = false;
                    }
                    else{ //alphabet character
                        builder.append(c);
                    }
                }
            }
            validEmails.add(builder.toString() + "@" + splitArr[1]);
        }
        int sum = 0;
        for(String s : validEmails){
            sum++;
        }
        return sum;
    }
}

