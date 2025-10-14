import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DescendingSortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        // Convert to Character array (not char[])
        Character[] ch = new Character[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }

        // Sort in descending order
        Arrays.sort(ch, Collections.reverseOrder());

        // Join characters into a string (no StringBuilder)
        String sorted = "";
        for (char c : ch) {
            sorted += c; // concatenate
        }

        System.out.println("String in descending order: " + sorted);
    }
}
