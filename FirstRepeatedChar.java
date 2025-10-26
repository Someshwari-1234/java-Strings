public class FirstRepeatedChar {
    public static void main(String[] args) {
        String s = "programming";
        boolean found = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {
                if (c == s.charAt(j)) {
                    System.out.println("First repeated: " + c);
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
    }
}
