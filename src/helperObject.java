import java.util.*;
public class helperObject {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return recursiveHelper(p, q);
    }
    public boolean recursiveHelper(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.val == q.val) {
            return (recursiveHelper(p.right, q.right) && recursiveHelper(p.left, q.left));
        }
        return false;
    }
}

