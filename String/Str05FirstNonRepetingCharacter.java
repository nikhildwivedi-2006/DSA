package String;

import java.util.HashMap;

public class Str05FirstNonRepetingCharacter {

    public static void main(String[] args) {

        String str = "swiss";

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        System.out.print(map);
        System.out.println();

        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                System.out.println(ch);
                break;
            }
        }
    }
}
