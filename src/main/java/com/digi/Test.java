package com.digi;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(4, 5, 11, 12, 8, 15, 9, 13, 16, 25, -5, 10, 10, 10));

        List<Integer> listIndex = new ArrayList<>();
        int target = 20;
        Map<Integer, Integer> integerHashMap = new HashMap<>();

        int index = 0;
        for (int num : numbers) {
            int result = target - num;

            if (integerHashMap.containsKey(num)) {
                listIndex.add(integerHashMap.get(num));
                listIndex.add(index);
            } else {
                integerHashMap.put(result, index);
            }
            index++;
        }
        System.out.println(listIndex);
    }
}
