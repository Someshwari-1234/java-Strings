import java.util.*;

public class UniqueChars {
    public static void main(String[] args) {
        String str = "success";
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        System.out.print("Unique characters: ");
        for (char c : map.keySet())
            if (map.get(c) == 1)
                System.out.print(c + " ");
    }
}
