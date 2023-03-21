package org.example;
//    Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
//    Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
//    *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
//    Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
//    Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
//    Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
//    *Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.
public class Homework_2 {
    public static void main(String[] args) {

        // Задание 1
        String str = "Hello World!";
        String str2 = str;
        System.out.println(str2.contains(str));

        // Задание 2
        StringBuilder strBuilder = new StringBuilder(str);
        String str3 = String.valueOf(strBuilder.reverse());

        String str4 = "!dlroW olleH";
        System.out.println(str4.equals(str3));

        // Задание 4
        StringBuilder builder = new StringBuilder();

        int num = 3;
        int num2 = 56;

        builder.append(num);
        builder.append("+");
        builder.append(num2);
        builder.append("=");
        builder.append(num + num2);

        builder.append("\n" + num + "-" + num2 + "=" + (num - num2));
        builder.append("\n" + num + "*" + num2 + "=" + (num * num2));

        System.out.println(builder);

        // Задание 5
        while (builder.indexOf("=") != -1) {
            int index = builder.indexOf("=");
            builder.deleteCharAt(index);
            builder.insert(index, "равно");
        };

        System.out.println(builder);

        // Задание 6
        while (builder.indexOf("=") != -1) {
            int index = builder.indexOf("=");
            builder.replace(index, index + 1, "равно");
        };

        System.out.println(builder);
    }
}
