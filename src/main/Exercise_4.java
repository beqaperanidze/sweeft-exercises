package main;

import java.util.HashSet;
import java.util.Set;

public class Exercise_4 {
    //მოცემულია მთელი რიცხვების ორი მასივი. nums1 და nums2. იპოვეთ ამ მასივების საერთო ელემენტთა
    //სიმრავლე, რომელიც შეიცავს უნიკალურ მთელ რიცხვებს. int[] findIntersection(int[] nums1, int[] nums2);
    //მაგ. nums1 = [1,2,3,3,4,5], nums2 = [3,4,4,5,6,7], result = [3,4,5].

    public static int[] findIntersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                resultSet.add(num);
            }
        }

        int[] result = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            result[index++] = num;
        }

        return result;
    }
}
