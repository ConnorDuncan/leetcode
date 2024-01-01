import java.util.*;
public class helperObject {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return helperMethod(root);
    }
    public int helperMethod(TreeNode root){
        if(root.left == null && root.right == null){
            return 1;
        }
        else if(root.left == null){
            return 1 + helperMethod(root.right);
        }
        else if(root.right == null){
            return 1 + helperMethod(root.left);
        }
        else{
            int left = helperMethod(root.left);
            int right = helperMethod(root.right);
            if(left > right){
                return 1 + right;
            }
            else{
                return 1 + left;
            }
        }
    }
}

