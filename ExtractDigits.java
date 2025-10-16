public class ExtractDigits {
    public static void main(String[] args) {
        String str = "abc123xyz";
        String num = "";
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch))
                num += ch;
        }
        System.out.println("Number formed: " + num);
    }
}
