public class ReverseDigits {
    public static void main(String[] args) {
        String str = "a1b2c3d4";
        StringBuilder digits = new StringBuilder();

        for (char ch : str.toCharArray())
            if (Character.isDigit(ch))
                digits.append(ch);

        digits.reverse();
        int index = 0;
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch))
                result.append(digits.charAt(index++));
            else
                result.append(ch);
        }

        System.out.println("After reversing digits: " + result);
    }
}
