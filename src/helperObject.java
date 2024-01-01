import java.util.*;
public class helperObject {
    public int countNodes(TreeNode root) {
        return helperMethod(root);
    }
    public int helperMethod(TreeNode root){
        if(root == null){
            return 0;
        }
        else if(root.left == null && root.right == null){
            return 1;
        }
        else if(root.left == null){
            return 1 + helperMethod(root.right);
        }
        else if(root.right == null){
            return 1 + helperMethod(root.left);
        }
        return 1 + helperMethod(root.left) + helperMethod(root.right);
    }
}

