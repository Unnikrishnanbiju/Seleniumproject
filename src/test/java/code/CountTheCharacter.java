package code;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountTheCharacter {
    public static void main(String[] args) {
        String str = "automattionnn";

        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        Set<Character> set = new HashSet<>();
        for (char p : str.toCharArray()){
            set.add(p);
        }
        System.out.println(map);
        System.out.println(set);
    }
}
