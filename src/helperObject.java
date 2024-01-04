import java.util.*;
public class helperObject {
    public String destCity(List<List<String>> paths) {
        HashSet<String> mySet = new HashSet<String>();
        int r = paths.size();
        for(int i = 0; i < r; i++){
            mySet.add(paths.get(i).get(0));
        }
        for(int i = 0; i < r; i++){
            if(!mySet.contains(paths.get(i).get(1))){
                return paths.get(i).get(1);
            }
        }
        return "error";
    }

}

