package lesson3;
//2 - Дан массив целых чисел (List<Integer) удалить из него целые числа.
// Посмотрите на метод removeAll (можно сохранить все четные значения в другой
// список и передать его в removeAll или используйте итератор

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class TaskTwo {
    final static Random random = new Random();
    final static int size = 10;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> listResult = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(1000));
        }
        System.out.println(list);
        for (int i : list) {
            if (i % 2 == 0) {
                listResult.add(i);
            }
        }
        list.removeAll(listResult);
        System.out.println(list);
        System.out.println(listResult);

    }
}
