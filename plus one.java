import Math;

class Solution {
    public int[] plusOne(int[] digits) {
        boolean hasCarry = false; // set true if digits[i] = 10. The next number digits[i -1] will add 1
        int size = digits.length;

        // add 1 to the last digit
        digit[size - 1] = digit[size - 1] + 1;

        // iterate through digits and add 1 to the end.
        for (int i = size - 1; i >= 0; i--) {
            if (hasCarry == true) {
                digits[i] += 1;
                hasCarry == false;
            }

            if (digits[i] == 10) {
                hasCarry = true;
                digits[i] = 0;
            }


        }
        if (hasCarry == false) {
            return digits;
        }
        else {
            int[] newDigits = new int[size + 1];
            newDigits[0] = 1; 

            for (int i = 0; i < size - 1; i++) {
                newDigits[i + 1] = digits[i];
            }

            return newDigits;
        }




        
        
    }
}