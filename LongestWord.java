public class LongestWord {
    public static void main(String[] args) {
        String sentence = "Java is powerful";
        String[] words = sentence.split(" ");
        String longest = "";

        for (String w : words)
            if (w.length() > longest.length())
                longest = w;

        System.out.println("Longest word: " + longest);
    }
}
