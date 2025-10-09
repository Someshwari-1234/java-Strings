public class CapitalizeWords {
    public static void main(String[] args) {
        String str = "java is powerful";
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            sb.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1)).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
