import java.util.HashMap;
import java.util.Stack;

public class ValidParantheses {

    public static  void main(String[] args) {
        System.out.println(isValid(" "));
    }


    public static  boolean isValid(String s) {
        s = "()[]{}";
        Stack<Character> current = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                current.add(c);
            } else {
                if (!current.isEmpty()){
                    char top = current.peek();
                }


                switch (c) {
                    case ')':
                        if (top == '(') {
                            current.pop();
                        } else {
                            return false;
                        }
                        break;

                    case ']':
                        if (top == '[') {
                            current.pop();
                        } else {
                            return false;
                        }
                        break;

                    case '}':
                        if (top == '{') {
                            current.pop();
                        }
                        else {
                            return false;
                        }
                        break;
                }

            }
        }

        if (current.isEmpty()) {
            return true;
        }
        return false;
    }


}
