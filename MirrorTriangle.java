public class MirrorTriangle {
    public static void main(String[] args) {
        String s = "ABCDE";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++)
                System.out.print(s.charAt(j));
            for (int j = i - 1; j >= 0; j--)
                System.out.print(s.charAt(j));
            System.out.println();
        }
    }
}
