package lesson5;
// https://leetcode.com/problems/contains-duplicate-ii/
// использовать мапу, либо подумать как обойтись сетом
// 219. Contains Duplicate II

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    static public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && (i - map.get(nums[i]) <= k)) { //исключил лишнюю переменную
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
