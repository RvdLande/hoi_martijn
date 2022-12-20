import java.util.Stack;

public class test123 {
    public static boolean checkBrackets(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char openBracket = stack.pop();
                if ((openBracket == '(' && ch != ')') ||
                        (openBracket == '[' && ch != ']') ||
                        (openBracket == '{' && ch != '}')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String test1 = "{sdaasda}(dsadasd)ljhbsdfljsbd";
        System.out.println(checkBrackets(test1));

    }
}
