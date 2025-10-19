public class AverageOfDigits {
    public static void main(String[] args) {
        String str = "a1b4c9";
        int sum = 0, count = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                sum += ch - '0';
                count++;
            }
        }
        double avg = (count > 0) ? (double) sum / count : 0;
        System.out.println("Average of digits = " + avg);
    }
}
