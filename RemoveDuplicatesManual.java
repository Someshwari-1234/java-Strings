public class RemoveDuplicatesManual {
    public static void main(String[] args) {
        String s = "programming";
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == c) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate)
                result = result + c;
        }
        System.out.println(result);
    }
}
