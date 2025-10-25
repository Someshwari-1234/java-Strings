public class CountWordsManual {
    public static void main(String[] args) {
        String s = "Java is simple";
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if (!inWord) {
                    inWord = true;
                    count++;
                }
            } else {
                inWord = false;
            }
        }
        System.out.println("Word count: " + count);
    }
}
