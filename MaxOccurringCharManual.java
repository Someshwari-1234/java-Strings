public class MaxOccurringCharManual {
    public static void main(String[] args) {
        String s = "programming";
        int maxCount = 0;
        char maxChar = ' ';

        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    count++;
            }
            if (count > maxCount) {
                maxCount = count;
                maxChar = s.charAt(i);
            }
        }
        System.out.println("Max occurring: " + maxChar + " (" + maxCount + ")");
    }
}
