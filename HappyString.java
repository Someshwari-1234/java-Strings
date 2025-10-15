import java.util.Scanner;

public class HappyString {
    public static boolean isHappyString(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                return false; // consecutive characters are same
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isHappyString(input))
            System.out.println(input + " is a Happy String 😊");
        else
            System.out.println(input + " is Not a Happy String 😢");

        sc.close();
    }
}
