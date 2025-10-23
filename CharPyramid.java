public class CharPyramid {
    public static void main(String[] args) {
        String s = "ABCDEF";
        int index = 0;

        for (int i = 1; index < s.length(); i++) {
            for (int j = 1; j <= i && index < s.length(); j++) {
                System.out.print(s.charAt(index++) + " ");
            }
            System.out.println();
        }
    }
}
