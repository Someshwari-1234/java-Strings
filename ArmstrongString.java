public class ArmstrongString {
    public static void main(String[] args) {
        String str = "153";
        int num = Integer.parseInt(str);
        int temp = num, sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            sum += d * d * d;
            temp /= 10;
        }
        System.out.println(num == sum ? "Armstrong" : "Not Armstrong");
    }
}
