package code;

import java.util.HashMap;
import java.util.Map;

public class CountTheCharacter {
    public static void main(String[] args) {
        String str = "automattionnn";

        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
    }
}
