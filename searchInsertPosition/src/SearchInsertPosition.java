import java.util.Arrays;

public class SearchInsertPosition {
    public static void main(String[] args) {

    }

    public static int searchInsert(int[] nums, int target) {
// implementation of binary search
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (nums[middle] == target) {
                return middle; // Found the target, return its index
            } else if (nums[middle] < target) {
                left = middle + 1; // Search the right half
            } else {
                right = middle - 1; // Search the left half
            }
        }

        // if number not found, left index will have numbers lower than the target. So it will have the highest low number next to target
        // by inserting at the left position guarentee it is in the correct position
        return left;

    }
}
