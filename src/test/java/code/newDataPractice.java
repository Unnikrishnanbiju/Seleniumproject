package code;

import java.util.HashMap;
import java.util.Map;

public class newDataPractice {
    public static void main(String[] args) {
        System.out.println("********************************************");
        System.out.println("COUNT Character Frequency");
        System.out.println("********************************************");


        String s = "automation";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        System.out.println(map);

        System.out.println("********************************************");
        System.out.println("----------------");
        System.out.println("********************************************");

        String s2 = "asdfghjkfjdhsfawrtiaasfg";
        Map<Character, Integer> map1 = new HashMap<>();

        for (char ch : s2.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map1);


    }

}
