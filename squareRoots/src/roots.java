public class roots {
    public static void main(String args[]) {
        System.out.println(roots(2147395599, 0, 2147395599));

    }

// version of binary search
    public static long roots(long nums, long left, long right) {
        if (left > right) {
            // base case hit. Not found
            return left;
        }
        long middle = left + (right - left) / 2;

        if (middle * middle == nums) {
            return middle; // foudn square root. Return
        }

        else if (middle * middle < nums) {
            // check if there is a smaller perfect square above middle
            if ((middle + 1) * (middle + 1) == nums) {
                return middle + 1;
            }
            else if ((middle + 1) * (middle + 1) < nums) {
                return roots(nums, middle + 1, right);
            }
            else {
                return middle;
            }
        }
        // if middle * middle is larger than nums
        else {
            return roots(nums, left, middle - 1);
        }
    }

}
