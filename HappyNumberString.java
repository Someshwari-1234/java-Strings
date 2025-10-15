import java.util.HashSet;
import java.util.Scanner;

public class HappyNumberString {
    // Function to calculate the sum of squares of digits
    public static int sumOfSquares(String numStr) {
        int sum = 0;
        for (char ch : numStr.toCharArray()) {
            int digit = ch - '0';
            sum += digit * digit;
        }
        return sum;
    }

    // Function to check if the number is happy
    public static boolean isHappyNumber(String numStr) {
        HashSet<Integer> seen = new HashSet<>();
        int num = Integer.parseInt(numStr);

        while (num != 1 && !seen.contains(num)) {
            seen.add(num);
            num = sumOfSquares(String.valueOf(num));
        }
        return num == 1;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = sc.nextLine();

        if (isHappyNumber(number))
            System.out.println(number + " is a Happy Number 😊");
        else
            System.out.println(number + " is Not a Happy Number 😢");

        sc.close();
    }
}
