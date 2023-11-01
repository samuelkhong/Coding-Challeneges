class Solution {
    public int singleNumber(int[] nums) {
        //@param
        // null? 
        // empty values? 
        // negatives -1, -2

        // true false. print value 
        // system.out.println(singleNumber([2, 2, 1]) ,"1")


        /*
            int singleNumbers(int[] nums) {

                sort the array
                iterate through array using  front and back ptr. 
                check if front ptr == back ptr move infront of front ptr and 

            }

        */

         int numsLength = nums.length;
        if (numsLength == 1) {
            return nums[0];
        }

        Arrays.sort(nums);
       
       int ptr = 0;
       while (ptr < numsLength - 1) {
           if (nums[ptr] == nums[ptr + 1]) {
               ptr = ptr + 2;
           }
           else {
               return nums[ptr];
           }
       }


       return nums[numsLength - 1];



        



        
    }
}
