public class ArrayToTree {

    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = -10;
        nums[1] = -3;
        nums[2] = 0;
        nums[3] = 5;
        nums[4] = 9;
        sortedHelper(nums, 0, 4, new TreeNode());


    }

    public static TreeNode sortedHelper(int[] nums, int start, int end, TreeNode n) {
        // find the middle add that as the current val of n
        int middle; // middle index
        middle = (start + end) / 2;
        n.val = nums[middle];

        if (start > end) {
            return null;
        }



        n.right =  sortedHelper(nums, middle + 1, end, new TreeNode());
        n.left = sortedHelper(nums, start, middle - 1, new TreeNode());

        return  n;

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



         class Solution {
          // array is sorted
//        public TreeNode sortedArrayToBST(int[] nums) {
//            // find the middle of the array. If even, find the number to the right of the middle
//            int middle; // middle index
//            int size = nums.length;
//            if (size == 0) {
//                return null;
//            }
//            else if (size == 1) {
//                middle == size;
//            }
//            middle = size / 2;
//
//
//        }



        }
    }
}
