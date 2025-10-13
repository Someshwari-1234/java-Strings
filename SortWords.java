import java.util.Arrays;
import java.util.Scanner;

public class SortWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        String[] words = str.split(" ");
        Arrays.sort(words);

        System.out.println("Sorted words:");
        for (String w : words) {
            System.out.print(w + " ");
        }
    }
}
