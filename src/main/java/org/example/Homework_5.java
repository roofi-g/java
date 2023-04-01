package org.example;
import java.util.*;
//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
//Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
//Отсортировать по убыванию популярности имён.
public class Homework_5 {
    static ArrayList<List<String>> data = new ArrayList<>();
    public static void main(String[] args) {
        HashMap<Integer, List<String>> hashMap = new HashMap<>();

        addUser("Иван", "Иванов");
        addUser("Светлана", "Петрова");
        addUser("Кристина", "Белова");
        addUser("Анна", "Мусина");
        addUser("Анна", "Крутова");
        addUser("Иван", "Юрин");
        addUser("Петр", "Лыков");
        addUser("Павел", "Чернов");
        addUser("Петр", "Чернышов");
        addUser("Мария", "Федорова");
        addUser("Марина", "Светлова");
        addUser("Мария", "Савина");
        addUser("Мария", "Рыкова");
        addUser("Марина", "Лугова");
        addUser("Анна", "Владимирова");
        addUser("Иван", "Мечников");
        addUser("Петр", "Петин");
        addUser("Иван", "Ежов");

        for (int i = 0; i < data.size(); i++) {
            hashMap.put(i, data.get(i));
        }

        HashMap<String, Integer> hashMap2 = new HashMap<>();

        for(Map.Entry<Integer, List<String>> item : hashMap.entrySet()){
            String name = item.getValue().get(0);
            if (hashMap2.containsKey(name)) {
                hashMap2.replace(name, hashMap2.get(name) + 1);
            } else hashMap2.put(name, 1);
        }

        for(Map.Entry<String, Integer> item : hashMap2.entrySet()){
            System.out.printf("Name: %s  Count: %s \n", item.getKey(), item.getValue());
        }

        ArrayList<String> list = new ArrayList<>(hashMap2.keySet());
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return hashMap2.get(o2) - hashMap2.get(o1);
            }
        });
        System.out.println(list);

    }
    public static void addUser(String name,String lastName){
        ArrayList<String> user = new ArrayList<>();

        user.add(name);
        user.add(lastName);
        List<Long> num = getPhoneNumber();
        user.add(num.toString());

        data.add(user);
    }
    public static List<Long> getPhoneNumber(){
        List<Long> telNumber = new ArrayList<>();
        for (int j = 0; j < new Random().nextInt(1,3); j++) {
            StringBuilder num = new StringBuilder();
            for (int i = 0; i < 7; i++) {
                int number = new Random().nextInt(9);
                num.append(number);
            }
            long n = Long.parseLong("8951" + num);
            telNumber.add(n);
            num.delete(0,num.length());
        }
        return telNumber;
    }
}
