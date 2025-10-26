public class RemoveCharManual {
    public static void main(String[] args) {
        String s = "interview";
        char target = 'e';
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != target)
                result = result + s.charAt(i);
        }
        System.out.println(result);
    }
}
