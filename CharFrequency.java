import java.util.*;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "hello";
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);
    }
}
