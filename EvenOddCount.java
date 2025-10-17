public class EvenOddCount {
    public static void main(String[] args) {
        String str = "123456";
        int even = 0, odd = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                int d = ch - '0';
                if (d % 2 == 0) even++;
                else odd++;
            }
        }
        System.out.println("Even: " + even + ", Odd: " + odd);
    }
}
