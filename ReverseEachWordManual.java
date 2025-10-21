public class ReverseEachWordManual {
    public static void main(String[] args) {
        String s = "Java is fun";
        s = s + " "; // to catch last word
        String word = "", result = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ')
                word = word + c;
            else {
                // reverse word manually
                String rev = "";
                for (int j = word.length() - 1; j >= 0; j--) {
                    rev = rev + word.charAt(j);
                }
                result = result + rev + " ";
                word = "";
            }
        }
        System.out.println(result.trim());
    }
}
