public class PrimeDigits {
    public static void main(String[] args) {
        String str = "2357";
        boolean allPrime = true;

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                int d = ch - '0';
                if (d < 2 || (d % 2 == 0 && d != 2) || (d % 3 == 0 && d != 3) || (d % 5 == 0 && d != 5)) {
                    allPrime = false;
                    break;
                }
            }
        }

        System.out.println(allPrime ? "All digits are prime" : "Not all digits are prime");
    }
}
