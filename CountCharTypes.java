public class CountCharTypes {
    public static void main(String[] args) {
        String str = "abc@123#";
        int letters = 0, digits = 0, special = 0;

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) letters++;
            else if (Character.isDigit(c)) digits++;
            else special++;
        }
        System.out.println("Letters: " + letters + ", Digits: " + digits + ", Special: " + special);
    }
}
