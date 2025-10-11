public class RemoveVowels {
    public static void main(String[] args) {
        String str = "developer";
        String result = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println("After removing vowels: " + result);
    }
}
