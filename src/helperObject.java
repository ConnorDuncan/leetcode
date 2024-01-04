import java.util.*;
public class helperObject {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        recursiveHelper(root, myArray);
        return myArray;
    }
    public void recursiveHelper(TreeNode root, ArrayList<Integer> myArray){
        if(root == null){
            return;
        }
        else if(root.left == null && root.right == null){
            myArray.add(root.val);
        }
        else if(root.left == null){
            myArray.add(root.val);
            recursiveHelper(root.right, myArray);
        }
        else if(root.right == null){
            recursiveHelper(root.left, myArray);
            myArray.add(root.val);
        }
        else{
            recursiveHelper(root.left, myArray);
            myArray.add(root.val);
            recursiveHelper(root.right, myArray);
        }
    }

}

