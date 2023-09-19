public class IsSymmetric {
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


    class Solution {
        public boolean isSymmetric(TreeNode root) {
            if (root == null) {
                return true;
            }
            TreeNode p = root.left;
            TreeNode q = root.right;

            return isSymmetricHelper(p, q);

        }
        public boolean isSymmetricHelper(TreeNode p, TreeNode q) {
            if (p == null && q == null) {
                return true;

            }
            // if one side == null but the other side does not equal null
            else if (p == null ||  q == null) {
                return false;
            }

            // returns false if the values do not match
            else if (p.val != q.val) {
                return false;
            }


            return isSymmetricHelper(p.left, q.right) && isSymmetricHelper(p.right, q.left);

        }
    }

}
