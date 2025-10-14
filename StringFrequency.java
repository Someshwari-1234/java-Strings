import java.util.Scanner;

public class StringFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        // Convert to lowercase for uniformity
        str = str.toLowerCase();

        int[] freq = new int[256]; // ASCII size

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        System.out.println("Character frequencies:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0 && ((char)i) != ' ') { // ignore spaces
                System.out.println((char)i + " = " + freq[i]);
            }
        }
    }
}
