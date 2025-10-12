public class PangramCheck {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(str) ? "Pangram" : "Not Pangram");
    }

    static boolean isPangram(String str) {
        str = str.toLowerCase();
        boolean[] alphabet = new boolean[26];
        for(char ch : str.toCharArray()) {
            if(ch >= 'a' && ch <= 'z')
                alphabet[ch - 'a'] = true;
        }
        for(boolean present : alphabet)
            if(!present) return false;
        return true;
    }
}
