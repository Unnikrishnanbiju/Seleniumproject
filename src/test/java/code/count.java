package code;

import java.util.HashMap;
import java.util.Map;



public class count {
    public static void main(String[] args) {
        String str = "automation";
        Map<Character, Integer> map = new HashMap<>();

        for (char s : str.toCharArray()){
            map.put(s, map.getOrDefault(s,0)+1);
        }
        System.out.println(map);
        System.out.println(map);
    }


}
