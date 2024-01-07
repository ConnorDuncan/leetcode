import java.util.*;
public class helperObject {
    public List<String> letterCombinations(String digits) {
        String[] twos = new String[]{"a", "b", "c"};
        String[] threes = new String[]{"d", "e", "f"};
        String[] fours = new String[]{"g", "h", "i"};
        String[] fives = new String[]{"j", "k", "l"};
        String[] sixes = new String[]{"m", "n", "o"};
        String[] sevens = new String[]{"p", "q", "r", "s"};
        String[] eights = new String[]{"t", "u", "v"};
        String[] nines = new String[]{"w", "x", "y", "z"};
        ArrayList<String> results = new ArrayList<String>();
        int len = digits.length();
        if(len == 0){
            return results;
        }
        char c = digits.charAt(0);
        if(c - 50 == 0){ // twos
            for(String s : twos){
                results.add(s);
            }
        }
        else if(c - 50 == 1){ // threes
            for(String s : threes){
                results.add(s);
            }
        }
        else if(c - 50 == 2){ // fours
            for(String s : fours){
                results.add(s);
            }
        }
        else if(c - 50 == 3){ // fives
            for(String s : fives){
                results.add(s);
            }
        }
        else if(c - 50 == 4){ // sixes
            for(String s : sixes){
                results.add(s);
            }
        }
        else if(c - 50 == 5){ // sevens
            for(String s : sevens){
                results.add(s);
            }
        }
        else if(c - 50 == 6){ // eights
            for(String s : eights){
                results.add(s);
            }
        }
        else{ // nines
            for(String s : nines){
                results.add(s);
            }
        }
        for(int i = 1; i < len; i++){
            ArrayList<String> newResults = new ArrayList<String>();
            c = digits.charAt(i);
            for(String result : results){
                if(c - 50 == 0){ // twos
                    for(String s : twos){
                        newResults.add(result + s);
                    }
                }
                else if(c - 50 == 1){ // threes
                    for(String s : threes){
                        newResults.add(result + s);
                    }
                }
                else if(c - 50 == 2){ // fours
                    for(String s : fours){
                        newResults.add(result + s);
                    }
                }
                else if(c - 50 == 3){ // fives
                    for(String s : fives){
                        newResults.add(result + s);
                    }
                }
                else if(c - 50 == 4){ // sixes
                    for(String s : sixes){
                        newResults.add(result + s);
                    }
                }
                else if(c - 50 == 5){ // sevens
                    for(String s : sevens){
                        newResults.add(result + s);
                    }
                }
                else if(c - 50 == 6){ // eights
                    for(String s : eights){
                        newResults.add(result + s);
                    }
                }
                else{ // nines
                    for(String s : nines){
                        newResults.add(result + s);
                    }
                }
            }
            results = newResults;
        }


        return results;
    }
}

