public class AllVowels {
    public static void main(String[] args) {
        String str = "education".toLowerCase();
        boolean allVowels = str.contains("a") && str.contains("e") && str.contains("i") && str.contains("o") && str.contains("u");

        System.out.println(allVowels ? "Contains all vowels" : "Does not contain all vowels");
    }
}
