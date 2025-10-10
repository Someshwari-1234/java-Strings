public class ToggleCase {
    public static void main(String[] args) {
        String str = "ThAnK";
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c))
                result.append(Character.toLowerCase(c));
            else
                result.append(Character.toUpperCase(c));
        }
        System.out.println("Toggled string: " + result);
    }
}
