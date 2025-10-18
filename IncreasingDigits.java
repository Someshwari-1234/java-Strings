public class IncreasingDigits {
    public static void main(String[] args) {
        String str = "123456";
        boolean increasing = true;

        for (int i = 0; i < str.length() - 1; i++) {
            if (Character.isDigit(str.charAt(i)) && Character.isDigit(str.charAt(i + 1))) {
                if (str.charAt(i) >= str.charAt(i + 1)) {
                    increasing = false;
                    break;
                }
            }
        }

        System.out.println(increasing ? "Digits are in increasing order" : "Digits are not in increasing order");
    }
}
