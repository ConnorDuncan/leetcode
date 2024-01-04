import java.util.*;
public class helperObject {
    public int findContentChildren(int[] g, int[] s) {
        int happyChildren = 0;
        int j = 0;
        int i = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(j < g.length && i < s.length){
            if(g[j] <= s[i]){
                happyChildren++;
                j++;
                i++;
            }
            else{
                i++;
            }
        }
        return happyChildren;
    }
}

