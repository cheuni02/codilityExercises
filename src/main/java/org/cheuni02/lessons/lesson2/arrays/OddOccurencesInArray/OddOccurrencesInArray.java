package org.cheuni02.lessons.lesson2.arrays.OddOccurencesInArray;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
        Map<Integer, Integer> occurenceMap = new HashMap<>();
        for (int a : A) {
            if (!occurenceMap.containsKey(a)) {
                occurenceMap.put(a, 1);
                continue;
            }
            occurenceMap.put(a, occurenceMap.get(a) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : occurenceMap.entrySet()) {
            if (entry.getValue() != 1) continue;
            return entry.getKey();
        }
        return -1;
    }

    public static void main(String[] args) {
        OddOccurrencesInArray obj = new OddOccurrencesInArray();
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(obj.solution(A));
    }
}
