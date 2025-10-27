public class BalancedBrackets {
    public static void main(String[] args) {
        String s = "{[()]}";
        int round = 0, square = 0, curly = 0;
        boolean valid = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') round++;
            else if (c == ')') round--;
            else if (c == '[') square++;
            else if (c == ']') square--;
            else if (c == '{') curly++;
            else if (c == '}') curly--;

            if (round < 0 || square < 0 || curly < 0) {
                valid = false;
                break;
            }
        }

        if (round == 0 && square == 0 && curly == 0 && valid)
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}
