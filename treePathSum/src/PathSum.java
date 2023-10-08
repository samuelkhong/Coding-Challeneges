public class PathSum {




}
    class Solution {
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


        public boolean hasPathSum(TreeNode root, int targetSum) {
            if (root == null) {
                return false;
            }

            return pathHelper(root, targetSum, 0);




        }
        public boolean pathHelper(TreeNode node, int targetSum, int total) {
            if (node == null) {
                return false;
            }
            total = total + node.val;
            if (node.left == null && node.right == null) {
                // at leaf node check if total == targetsum
                if (total == targetSum) {
                    return true;
                }
                return false;
            }

            boolean left = false;
            if (node.left != null) {
                left = pathHelper(node.left, targetSum, total);
            }

            boolean right = false;
            if (node.right != null) {
                right = pathHelper(node.right, targetSum, total);
            }

            return right == true || left == true;

        }
}
