package lesson3;
//3 - Дан массив целых чисел (List<Integer>) найти минимальное, максимальное значения в этом массиве.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class TaskThree {
    final static Random random = new Random();
    final static int size = 10;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(1000));
        }

        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
    }
}
