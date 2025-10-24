public class DiagonalString {
    public static void main(String[] args) {
        String s = "HELLO";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < i; j++)
                System.out.print(" ");
            System.out.println(s.charAt(i));
        }
    }
}
