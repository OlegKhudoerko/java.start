package lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskOne {

    public static ArrayList<List<Integer>> ans;
    public static int n = 9;
    public static int comb = 0;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        String value = in.nextLine().replace(" ", "").replace("+", "=");
        char[] list = value.toCharArray();
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < value.length(); i++) {
            if (list[i] == '?') {
                index.add(i);
                comb++;
            }
        }

        TaskOne test = new TaskOne();
        String str = new String(list);
        String[] strList = str.split("=");
        test.combine(str, list, index, strList);
    }

    public List<List<Integer>> combine(String str, char list[], ArrayList<Integer> index, String[] strList) {

        ans = new ArrayList<>();
        helper(new ArrayList<>(), n, comb);
        int count = 0;

        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                list[index.get(j)] = Character.forDigit(ans.get(i).get(j), 10);
            }
            String val = new String(list);
            String[] strListNew = val.split("=");
            int[] num = new int[strList.length];

            for (int p = 0; p < strList.length; p++) {
                num[p] = Integer.parseInt(strListNew[p]);
            }
            int sum = num[0] + num[1];
            if (sum == num[2]) {
                System.out.printf("%d+%d=%d; ", num[0], num[1], num[2]);
                count++;
            }
        }
        System.out.printf("\n Количество верных решений задачи = %d \n", count);
        return ans;
    }

    void helper(List<Integer> comb, int n, int k) {
        if (comb.size() == k) {
            ans.add(new ArrayList<>(comb));
            return;
        }
        for (int i = 0; i <= n; i++) {
            comb.add(i);
            helper(comb, n, k);
            comb.remove(comb.size() - 1);
        }
    }
}
