package org.example;
import java.util.Random;

import static java.lang.Long.highestOneBit;

//        1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
//
//        Пункты реализовать в методе main
//        *Пункты реализовать в разных методах

public class Homework_1 {
    public static void main(String[] args) {

        int i = new Random().nextInt(0,2000);
        int n = Integer.toBinaryString(i).length();

        short sh = Short.MAX_VALUE;

        System.out.println(i);
        System.out.println(n);

        int[] m1 = new int[sh];
        int[] m2 = new int[sh];

        int i1 = i;
        for (int j = 0; i1 < sh; j++) {
            i1 = i1 + n;
            m1[j] = i1;
            System.out.println(m1[j]);
        }

        int m2_index = 0;
        int i2 = Short.MIN_VALUE;
        for (; i2 < i; i2++) {
            if (i2 % n != 0) {
                m2[m2_index] = i2;
                System.out.println(m2[m2_index]);
                m2_index++;
            }
        }
    }
}
