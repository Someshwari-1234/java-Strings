public class LargestNumberInString {
    public static void main(String[] args) {
        String str = "abc12def45gh678";
        int max = 0, current = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                current = current * 10 + (ch - '0');
            } else {
                max = Math.max(max, current);
                current = 0;
            }
        }
        max = Math.max(max, current);
        System.out.println("Largest number = " + max);
    }
}
