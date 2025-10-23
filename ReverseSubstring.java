public class ReverseSubstring {
    public static void main(String[] args) {
        String s = "abcdefg";
        int start = 2, end = 5;  // reverse from index 2 to 5
        String result = "";

        for (int i = 0; i < start; i++)
            result = result + s.charAt(i);

        for (int i = end; i >= start; i--)
            result = result + s.charAt(i);

        for (int i = end + 1; i < s.length(); i++)
            result = result + s.charAt(i);

        System.out.println("Result: " + result);
    }
}
