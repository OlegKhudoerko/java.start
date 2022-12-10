package lesson5;
// https://leetcode.com/problems/intersection-of-two-arrays-ii/
// используем ровно одну мапу, в мапе храним меньший из массивов
// 350. Intersection of Two Arrays II

import java.util.*;

public class Task3 {

    public static void main(String[] args) {
        int[] nums1 = new int[]{4, 9, 5 };
        int[] nums2 = new int[]{9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    static public int[] intersect(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums1)
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }

        List<Integer> intersection = new ArrayList<>();
        for (int i : nums2) {
            if (map.containsKey(i) && map.get(i) > 0) {
                intersection.add(i);
                map.put(i, map.get(i) - 1);
            }
        }

        int[] outArr = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            outArr[i] = intersection.get(i);
        }
        return outArr;
    }
}
