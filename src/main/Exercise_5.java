package main;

import java.util.HashMap;
import java.util.Map;

public class Exercise_5 {
//  მოცემულია მთელ რიცხვა მასივი. იპოვეთ ელემენტების მაქსიმალური რაოდენობა, რომელთა ჯამით
//  მიიღება რიცხვი k. int lenOfLongSubarr(int[] array, int k); მაგ. array=[6,2,2,3,4,1], k = 8, result= 4.

    public static int lenOfLongSubarr(int[] array, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);

        int result = 0;

        for (int num : array) {
            Map<Integer, Integer> newMap = new HashMap<>(map);

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int currentSum = entry.getKey();
                int currentLength = entry.getValue();

                int newSum = currentSum + num;

                if (newSum == k) {
                    result = Math.max(result, currentLength + 1);
                }

                newMap.put(newSum, Math.max(newMap.getOrDefault(newSum, Integer.MIN_VALUE), currentLength + 1));
            }

            map = newMap;
        }

        return result;
    }
}
