public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        // get the length of the string
        int size = s.length();

        // convert s to char array
        char[] stringToChars = s.toCharArray();
        int indexOfLastWord = 0;

        // find the start of the first alphabetic char
        int endOfWord = 0;

        for (int i = size - 1; i >= 0; i--) {
            if (Character.isAlphabetic(stringToChars[i])) {
                endOfWord = i;
                break;
            }
        }


        // iterate backwards until a space " " is discovered
        for (int i = endOfWord; i >= 0; i--) {
            if (stringToChars[i] == ' ') {
                indexOfLastWord = i + 1; // after space is found the next char will start the word
                break;
            }
        }
        int lengthOfLastWord = endOfWord - indexOfLastWord;


        return lengthOfLastWord;

    }
}
