public class CountNumbersInString {
    public static void main(String[] args) {
        String str = "abc12def45gh678";
        int count = 0;
        boolean inNumber = false;

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                if (!inNumber) {
                    count++;
                    inNumber = true;
                }
            } else {
                inNumber = false;
            }
        }

        System.out.println("Total numbers found = " + count);
    }
}
