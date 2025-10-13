import java.util.Arrays;
import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        // Convert string to char array
        char[] ch = str.toCharArray();

        // Sort the array
        Arrays.sort(ch);

        // Convert back to string
        String sorted = new String(ch);
        System.out.println("Sorted string: " + sorted);
    }
}
