package lesson5;
// https://leetcode.com/problems/count-common-words-with-one-occurrence/
// используем ровно одну мапу, в мапе храним меньший из массивов
// 2085. Count Common Words With One Occurrence

import java.util.*;

public class Task2 {

    static String[] words1 = new String[]{"leetcode","is","amazing","as","is"};
    static String[] words2 = new String[]{"amazing","leetcode","is"};

    public static void main(String[] args) {
        System.out.println(countWords(words1,words2));
    }

    static public int countWords(String[] words1, String[] words2) {
        if (words1.length > words2.length) {
            return countWords(words2, words1);
        }

        Map<String, Integer> map = new HashMap<>();
        for (String s : words1) {
            map.putIfAbsent(s, 0);
            map.put(s, map.get(s) + 1);
        }

        for (String s : words2) {
            if (map.containsKey(s) && map.get(s) < 2) {
                map.put(s, map.get(s) - 1);
            }
        }

        int res = 0;
        for (var val: map.entrySet()) {
            if (val.getValue() == 0) {
                res++;
            }
        }

        return res;
    }
}