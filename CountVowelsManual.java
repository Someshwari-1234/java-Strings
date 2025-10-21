public class CountVowelsManual {
    public static void main(String[] args) {
        String s = "HelloWorld";
        int vowels = 0, consonants = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'A' && c <= 'Z')) c = (char)(c + 32); // convert uppercase
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                vowels++;
            else if (c >= 'a' && c <= 'z')
                consonants++;
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }
}
