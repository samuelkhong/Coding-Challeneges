public class main {
    public static void main(String[] args) {

    }

      public class TreeNode {     int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;     }
  }

    public int minDepth(TreeNode root, boolean end, int depth) {
        int left = minDepthHelper(root.left, depth);
        int right = minDepthHelper(root.right, depth);



    }

    public int minDepthHelper(TreeNode node, int depth, boolean end) {
        if (node.left == null && node.right == null) {
            return depth;
        }
        depth++;
        // go left
        int left;
        if (!node.left == null) {
            left = minDepthHelper(node.left, depth);
        }
        else {
            left = Integer.MAX_VALUE;
        }


        // go right
        int right;
        if (!node.right == null) {
            right = minDepthHelper(node.right, depth);
        }
        else {
            right = Integer.MAX_VALUE;
        }

        if (left <= right ) {
            return left;
        }
        return right;
}
