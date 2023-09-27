public class BalancedTree {
    public static void main(String[] arg) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode();
        root.right.left = null;
        root.right.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = null;
        root.left.right.left = null;
        root.left.right.right = new TreeNode(4);

        isBalanced(root);




    }


     public static class TreeNode {
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



    public static boolean isBalanced(TreeNode root) {
        // edge case no root
        if (root == null) {
            return true;
        }
        // right and left side depths
        int left = isBalancedHelper(root.left, 0);
        int right = isBalancedHelper(root.right, 0);

        // If the left side is more than 1 depth higher than the right side, it is not balanced
        if (Math.abs(right - left) > 1) {
            return false;
        }
        // Check if both left and right subtrees are also balanced
        return isBalanced(root.left) && isBalanced(root.right);


    }
    public static int  isBalancedHelper(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }
        depth++;
        int left = isBalancedHelper(node.left, depth);
        int right = isBalancedHelper(node.right, depth);

        if (left >= right) {
            return left;
        }
        return right;

    }


}
