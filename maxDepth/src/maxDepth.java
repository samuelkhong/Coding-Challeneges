public class maxDepth {


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
        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            return maxDepthHelper(root, 0);


        }

        public int maxDepthHelper(TreeNode root, int size) {
            //if the size
            if (root == null) {
                return size;
            }
            size += 1;

            int left = maxDepthHelper(root.left, size);
            int right = maxDepthHelper(root.right, size);

            if (left >= right) {
                return left;
            }
            return right;

        }
    }

}
