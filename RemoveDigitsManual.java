public class RemoveDigitsManual {
    public static void main(String[] args) {
        String s = "Ja1va2C0o3de";
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!(c >= '0' && c <= '9'))
                result = result + c;
        }
        System.out.println(result);
    }
}
