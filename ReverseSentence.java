public class ReverseSentence {
    public static void main(String[] args) {
        String s = "Java is fun";
        s = s + " ";
        String word = "", result = "";
        String[] words = new String[10]; // manual storage
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ')
                word = word + c;
            else {
                words[count++] = word;
                word = "";
            }
        }

        for (int i = count - 1; i >= 0; i--)
            result = result + words[i] + " ";

        System.out.println(result.trim());
    }
}
