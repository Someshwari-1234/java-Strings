public class ProductOfDigits {
    public static void main(String[] args) {
        String str = "a2b3c4";
        int product = 1;
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch))
                product *= ch - '0';
        }
        System.out.println("Product of digits = " + product);
    }
}
