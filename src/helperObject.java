import java.util.*;
public class helperObject {
    public List<Integer> postorderTraversal(TreeNode root) {
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
            recursiveHelper(root.right, myArray);
            myArray.add(root.val);
        }
        else if(root.right == null){
            recursiveHelper(root.left, myArray);
            myArray.add(root.val);
        }
        else{
            recursiveHelper(root.left, myArray);
            recursiveHelper(root.right, myArray);
            myArray.add(root.val);
        }
    }

}

