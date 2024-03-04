package com.digi;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(4, 5, 11, 12, 8, 15, 9, 13, 16));

        List<Integer> listIndex = new ArrayList<>();
        int target = 20;
        Map<Integer, Integer> integerHashMap = new HashMap<>();

        for (int num : numbers) {
            int result = target - num;
            if (integerHashMap.containsKey(num)) {
                listIndex.add(numbers.indexOf(integerHashMap.get(num)));
                listIndex.add(numbers.indexOf(num));
            } else {
                integerHashMap.put(result, num);
            }
        }
        System.out.println(listIndex);
    }
}
