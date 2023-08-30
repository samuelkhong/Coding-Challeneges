import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateRemoval {


    public static  void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println(removeDuplicates(nums));
    }


    public static int removeDuplicates(int[] nums) {
//        // create an empty set to store new numbers
//        Set<Integer>  numbers = new TreeSet<>();
//        for (int num : nums) {
//            numbers.add(num);
//        }
//
//        if (nums.length > 0) {
//            int i = 0;
//            for (int num : numbers) {
//                nums[i] = num;
//                i++;
//            }
//        }
//        return numbers.size();



        int uniqueNums = 1;
        int numsSize = nums.length;

        if (numsSize == 0) {
            return 0;
        }

        // iterate through the list starting at second element
        boolean found = false;
        for (int i = 1; i < numsSize; i++) {
            found = false;
            //go to the beginning of the array
            // loop until all unique numbers have been checked
            // if not found, add unique number to the nums[uniqueNums] pos
            for (int j = 0; j < uniqueNums; j++) {
                // check if the current num nums[j] is tracked
                if (nums[i] == nums[j]) {
                    found = true;
                    break;
                }
            }
            if (found == false) {
                nums[uniqueNums] = nums[i];
                uniqueNums += 1;
                //found = true;
            }
        }

        return uniqueNums;
//


    }
}
