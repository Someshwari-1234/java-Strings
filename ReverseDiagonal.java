public class ReverseDiagonal {
    public static void main(String[] args) {
        String s = "HELLO";
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - i; j > 1; j--)
                System.out.print(" ");
            System.out.println(s.charAt(i));
        }
    }
}
