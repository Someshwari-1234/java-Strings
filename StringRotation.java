public class StringRotation {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "deabc";
        System.out.println((s1 + s1).contains(s2) ? "Rotation" : "Not Rotation");
    }
}
