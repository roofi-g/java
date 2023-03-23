package org.example;
import java.util.*;

//    1.Реализовать алгоритм сортировки списков компаратором.
//    2.Пусть дан произвольный список целых чисел, удалить из него чётные числа
//    3.Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
//    4.Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
//
//    5.Создать ArrayList<Integer> и добавить нулевым элементом ноль 10000 раз.
//    6.Повторить пятый пункт но с LinkedList.
//    7.Сравнить время работы пятого и шестого пунктов.
public class Homework_3 {
    public static void main(String[] args) {

        Integer[] data = {5,6,7,8,3,5,4,10,11,12};
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(data));

        // Задание 1
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer t0, Integer t1) {
                return t0 - t1;
            }
        });
        System.out.println(list);

        // Задание 2
        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()) {
            int nextElem = iterator.next();
            if (nextElem % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(list);

        // Задание 3
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println(list.get(list.size()/2));

        // Задание 4
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int j = 0; j < 5; j++) {
            list2.add(new Random().nextInt(10));
        }
        System.out.println(list2);
        list2.removeAll(list);
        list.addAll(list2);
        System.out.println(list);

        // Задание 5
        ArrayList<Integer> list3 = new ArrayList<>();

        long begin = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list3.add(0);
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList: " + (end - begin));

        // Задание 6
        LinkedList<Integer> list4 = new LinkedList<>();

        long begin2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list4.add(0);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("LinkedList: " + (end2 - begin2));
    }
}
