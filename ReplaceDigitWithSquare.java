public class ReplaceDigitWithSquare {
    public static void main(String[] args) {
        String str = "a1b2c3";
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                int d = ch - '0';
                result.append(d * d);
            } else {
                result.append(ch);
            }
        }
        System.out.println("After replacing digits with squares: " + result);
    }
}
