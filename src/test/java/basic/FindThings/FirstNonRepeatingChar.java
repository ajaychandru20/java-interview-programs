package basic.FindThings;

import java.util.LinkedHashMap;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "aabbjgghh";
        LinkedHashMap<Character,Integer> hashMap = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hashMap.put(ch, hashMap.getOrDefault(ch,0) +1);
        }
        for (char c:hashMap.keySet()){
            if (hashMap.get(c) == 1){
                System.out.println(c);
                break;
            }
        }
    }
}
