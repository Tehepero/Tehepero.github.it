package collection;

import java.util.Map;
import java.util.HashMap;

public class Col6 {
    public static void main(String[] args) {
        // Map : key - value pair ?? 뭔뜻이지 중요하다는대
        // 키라는 값으로 유니크하게 보장이 되야함!? key = 중복 X
        // Map -> HashMap, TreeMap으로 응용!

        Map<String, Integer> intMap = new HashMap<>();

        // 키 값
        intMap.put("일", 11);
        intMap.put("이", 12);
        intMap.put("삼", 13);
        intMap.put("삼", 14);
        intMap.put("삼", 16); // 3개가 겹치네 출력해보자

        // key 값 전체 출력 (향상된 for문)
        for (String key : intMap.keySet()) {
            System.out.println(key);
        }

        // value 값 전체 출력 (향상된 for문)
        for (Integer value : intMap.values()) {
            System.out.println(value); // 삼 세개중에서 마지막에 쓰읜 삼 15로 덮어씌어짐

            System.out.println(intMap.get("삼"));
        }
    }
}
