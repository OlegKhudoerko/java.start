package lesson5;
// https://leetcode.com/problems/roman-to-integer/
// сделать мапу <Символ -> Значение>. Если текущий символ < правого соседа,
// тогда мы его вычитаем, иначе прибавляем.
// 13. Roman to Integer


import java.util.HashMap;

public class Task4 {

    static String roman = "MCMXCIV";

    public static void main(String[] args) {
        System.out.print(roman + " => ");
        System.out.println(romanToInt(roman));
    }

    static public int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        int len = s.length() - 1;

        for (int i = 0; i < len; i++) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
                sum += map.get(s.charAt(i));
            } else {
                sum -= map.get(s.charAt(i));
            }
        }
        return (sum + map.get(s.charAt(len)));
    }
}
