public class NumericPalindrome {
    public static void main(String[] args) {
        String str = "12321";
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(rev) ? "Palindrome" : "Not Palindrome");
    }
}
