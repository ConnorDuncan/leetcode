import java.util.*;
public class helperObject {
    public boolean isSymmetric(TreeNode root) {
        return recursiveHelper(root.right, root.left);
    }
    public boolean recursiveHelper(TreeNode right, TreeNode left){
        if(right == null && left == null){
            return true;
        }
        else if(right == null || left == null){
            return false;
        }
        else if(right.val == left.val){
            return (recursiveHelper(right.right, left.left) && recursiveHelper(right.left, left.right));
        }
        return false;
    }
}

