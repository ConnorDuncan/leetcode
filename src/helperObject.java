import java.util.*;
public class helperObject {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        return helperMethod(root, targetSum, 0);
    }
    public boolean helperMethod(TreeNode root, int targetSum, int curSum){
        if(curSum + root.val == targetSum && root.right == null && root.left == null){
            return true;
        }
        else if(root.left != null && root.right != null){
            return (helperMethod(root.left, targetSum, curSum + root.val) || helperMethod(root.right, targetSum, curSum + root.val));
        }
        else if(root.left != null){
            return helperMethod(root.left, targetSum, curSum + root.val);
        }
        else if(root.right != null){
            return helperMethod(root.right, targetSum, curSum + root.val);
        }
        return false;

    }
}

