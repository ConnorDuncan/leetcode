import java.lang.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        helperObject myObj = new helperObject();
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(myObj.rotateString(s, goal));
    }

}