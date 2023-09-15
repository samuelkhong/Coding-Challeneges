import java.util.ArrayList;
import java.util.List;

public class Inorder {
    public static void main (String args[]) {

    }


     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }


    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        tranversalHelper(root, list);
        return list;


    }

    public static void tranversalHelper(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        tranversalHelper(node.left, list);
        list.add(node.val); // add yourself;
        tranversalHelper(node.right, list);

        return;


    }
}
