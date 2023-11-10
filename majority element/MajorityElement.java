class Solution {
    public int majorityElement(int[] nums) {
        // null?
        // negative?
        

        // int?
        // null?
        // no there are no ties

        // int nums
        // system.out.print(majorityElement(nums));
    //system.out.print(3);

    // {3, 3}

    // majorityElemetn() {
        // sort the array int
        //[2,3,3]

        // iterate through array
        // int count = 0;
        // count the total instances of a number
        // if count > n/2 return 


        Arrays.sort(nums);

        int count = 0;
        int current = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (current == nums[i]) {
                count += 1;
                if (count > nums.length / 2) {
                    return nums[i];
                }
            }
            else{
                count = 1;
                current = nums[i];
            }
            

        }
        return nums[nums.length - 1];
    }

    

        
    
