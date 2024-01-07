import java.util.*;
public class helperObject {
    public String intToRoman(int num) {
        StringBuilder builder = new StringBuilder();
        while(num / 1000 > 0){
            builder.append("M");
            num -= 1000;
        }
        while(num / 900 > 0){
            builder.append("CM");
            num -= 900;
        }
        while(num / 500 > 0){
            builder.append("D");
            num -= 500;
        }
        while(num / 400 > 0){
            builder.append("CD");
            num -= 400;
        }
        while(num / 100 > 0){
            builder.append("C");
            num -= 100;
        }
        while(num / 90 > 0){
            builder.append("XC");
            num -= 90;
        }
        while(num / 50 > 0){
            builder.append("L");
            num -= 50;
        }
        while(num / 40 > 0){
            builder.append("XL");
            num -= 40;
        }
        while(num / 10 > 0){
            builder.append("X");
            num -= 10;
        }
        while(num / 9 > 0){
            builder.append("IX");
            num -= 9;
        }
        while(num / 5 > 0){
            builder.append("V");
            num -= 5;
        }
        while(num / 4 > 0){
            builder.append("IV");
            num -= 4;
        }
        while(num / 1 > 0){
            builder.append("I");
            num -= 1;
        }
        return builder.toString();
    }
}

