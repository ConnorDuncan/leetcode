import java.util.*;
public class helperObject {
    public TreeNode invertTree(TreeNode root) {
        return recursiveHelper(root);
    }
    public TreeNode recursiveHelper(TreeNode root){
        if(root == null){
            return null;
        }
        else if(root.left == null && root.right == null){
            return root;
        }
        else if(root.left == null){
            return new TreeNode(root.val, recursiveHelper(root.right), null);
        }
        else if(root.right == null){
            return new TreeNode(root.val, null, recursiveHelper(root.left));
        }
        else{
            TreeNode newLeft = recursiveHelper(root.right);
            TreeNode newRight = recursiveHelper(root.left);
            return new TreeNode(root.val, newLeft, newRight);
        }

    }
}

