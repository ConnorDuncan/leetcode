import java.util.*;
public class helperObject {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return recursiveHelper(root);
    }
    public int recursiveHelper(TreeNode root){
        if(root == null){
            return 0;
        }
        else if(root.left == null && root.right == null){
            return 1;
        }
        else if(root.left == null){
            return 1 + recursiveHelper(root.right);
        }
        else if(root.right == null){
            return 1 + recursiveHelper(root.left);
        }
        else{
            int leftVal = recursiveHelper(root.left);
            int rightVal = recursiveHelper(root.right);
            if(leftVal > rightVal){
                return 1 + leftVal;
            }
            else{
                return 1 + rightVal;
            }
        }
    }
}

