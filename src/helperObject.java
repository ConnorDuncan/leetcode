import java.util.*;
public class helperObject {
    public int calPoints(String[] operations) {
        Stack<Integer> myStack = new Stack<Integer>();
        for(int i = 0; i < operations.length; i++){
            char c = operations[i].charAt(0);
            if((c > 47 && c < 58) || c == 45){
                int record = Integer.parseInt(operations[i]);
                myStack.push(record);
            }
            else if(c == 43){
                int record = 0;
                int temp1 = myStack.pop();
                int temp2 = myStack.pop();
                record = temp1+temp2;
                myStack.push(temp2);
                myStack.push(temp1);
                myStack.push(record);
            }
            else if(c == 68){
                int score = myStack.pop();
                myStack.push(score);
                myStack.push(score*2);
            }
            else if(c == 67){
                myStack.pop();
            }
        }
        int sum = 0;
        while(!myStack.empty()){
            sum += myStack.pop();
        }
        return sum;
    }
}

