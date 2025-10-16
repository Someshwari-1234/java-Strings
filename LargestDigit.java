public class LargestDigit {
    public static void main(String[] args) {
        String str = "a5b9c3";
        int max = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch))
                max = Math.max(max, ch - '0');
        }
        System.out.println("Largest digit: " + max);
    }
}
