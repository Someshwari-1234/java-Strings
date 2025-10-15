public class SumOfDigits {
    public static void main(String[] args) {
        String str = "a1b2c3";
        int sum = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch))
                sum += ch - '0';
        }
        System.out.println("Sum of digits = " + sum);
    }
}
