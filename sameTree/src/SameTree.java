public class SameTree {

    public static void main(String[] args) {}

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
        public boolean isSameTree(TreeNode p, TreeNode q) {

            if (p == null && q == null) {
                return true;

            }
            else if (p == null && q != null) {
                return false;
            }

            else if (p != null && q == null) {
                return false;
            }

            else if (p.val != q.val) {
                return false;
            }
            if (isSameTree(p.left, q.left) == false) {
                return false;
            }
            if (isSameTree(p.right, q.right) == false) {
                return false;
            }

            return true;



        }
    }



}
