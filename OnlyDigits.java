public class OnlyDigits {
    public static void main(String[] args) {
        String str = "12345";
        boolean isDigit = str.matches("\\d+");
        System.out.println(isDigit ? "Only digits" : "Contains non-digit characters");
    }
}
