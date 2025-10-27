public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        String s = "aaabbccdee";
        String result = "";
        result = result + s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1))
                result = result + s.charAt(i);
        }
        System.out.println(result);
    }
}
