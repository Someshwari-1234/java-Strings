public class SumEvenOdd {
    public static void main(String[] args) {
        String str = "a1b2c3d4";
        int sum = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch))
                sum += ch - '0';
        }
        System.out.println("Sum = " + sum);
        System.out.println((sum % 2 == 0) ? "Even Sum" : "Odd Sum");
    }
}
