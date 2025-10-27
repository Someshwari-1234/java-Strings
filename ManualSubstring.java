public class ManualSubstring {
    public static void main(String[] args) {
        String s = "Interview";
        int start = 2, end = 6;
        String sub = "";

        for (int i = start; i < end && i < s.length(); i++)
            sub = sub + s.charAt(i);

        System.out.println("Substring: " + sub);
    }
}
