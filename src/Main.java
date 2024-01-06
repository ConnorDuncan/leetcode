import java.lang.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        helperObject myObj = new helperObject();
        String license = "1s3 PSt";
        String[] words = new String[]{"step","steps"};
        String result = myObj.shortestCompletingWord(license, words);
        System.out.println(result);
    }

}