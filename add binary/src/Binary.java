public class Binary {
     public static void main(String[] args) {
        System.out.println (addBinary("11", "1"));
    }

    public static  String addBinary(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();



        char[] longer;
        char[] shorter;
        if (lengthA >= lengthB) {
            longer = a.toCharArray();
            shorter = b.toCharArray();
        }
        else {
            longer = b.toCharArray();
            shorter = a.toCharArray();
        }

        int longerIndex = longer.length - 1;
        int shorterIndex = shorter.length - 1;
        boolean carries = false;

        if (lengthA == 1 && lengthB == 1) {
            int currentTotal = (longer[longerIndex] - '0') + (shorter[shorterIndex] - '0');
            if (currentTotal == 0) {
                return a;

            }
            else if (currentTotal == 1) {
                return "1";
            }


        }

        while (longerIndex >= 0 && shorterIndex >= 0) {
            int currentTotal = (longer[longerIndex] - '0') + (shorter[shorterIndex] - '0');
            if (carries == true) {
                currentTotal += 1;
                carries = false;
            }

            // check if the total is over two, subtract by two and set carries to true
            if (currentTotal >= 2) {
                currentTotal -= 2;
                carries = true;
            }
            // set the new value to the sumArray
            longer[longerIndex] = (char) ('0' + currentTotal);
            // change the index
            longerIndex -= 1;
            shorterIndex -= 1;
        }

        // iterate throught the rest of the longer array
        for (int i = longerIndex; i >= 0; i--) {
            int currentTotal = (longer[longerIndex] - '0');
            if (carries == true) {
                currentTotal += 1;
                carries = false;
            }
            // exit since no more carries
            else {
                String numerical = new String(longer);
                return numerical;
            }

            // check if the total is over two, subtract by two and set carries to true
            if (currentTotal >= 2) {
                currentTotal -= 2;
                carries = true;
            }
            // set the new value to the sumArray
            longer[longerIndex] = (char) ('0' + currentTotal);
            // change the index
            longerIndex -= 1;


        }

        char[] finalArray = new char[longer.length + 1];
        finalArray[0] = '1';
        for (int i = 0; i < longer.length; i++) {
            finalArray[i + 1] = longer[i];
        }
        String numerical = new String(finalArray);
        return numerical;

    }
}
