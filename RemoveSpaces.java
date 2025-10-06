public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "  Java   Programming  ";
        str = str.replaceAll("\\s", "");
        System.out.println("After removing spaces: " + str);
    }
}
