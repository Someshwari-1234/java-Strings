public class SumEvenOddDigits {
    public static void main(String[] args) {
        String str = "a1b2c3d4";
        int evenSum = 0, oddSum = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                int d = ch - '0';
                if (d % 2 == 0) evenSum += d;
                else oddSum += d;
            }
        }

        System.out.println("Sum of even digits = " + evenSum);
        System.out.println("Sum of odd digits = " + oddSum);
    }
}
