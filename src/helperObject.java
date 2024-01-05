import java.util.*;
public class helperObject {
    public List<Integer> preorderTraversal(TreeNode root) {
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
            myArray.add(root.val);
            recursiveHelper(root.left, myArray);
        }
        else{
            myArray.add(root.val);
            recursiveHelper(root.left, myArray);
            recursiveHelper(root.right, myArray);
        }
    }

}

