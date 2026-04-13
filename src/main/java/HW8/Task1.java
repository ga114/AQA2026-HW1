package HW8;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1 {
    //    Задача 1: Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3, 4, 4, 5".
//    Избавиться от повторяющихся элементов в строке. Вывести результат на экран. При решении использовать коллекции.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите числа через запятую:");
        String input = sc.nextLine();

        sc.close();

        // Разбиваем строку на числа
        String[] parts = input.split(",\\s*");

        // Используем LinkedHashSet для сохранения порядка и уникальности
        Set<String> unique = new LinkedHashSet<>();

        for (String part : parts) {
            unique.add(part.trim());
        }

        // Вывод результата
        System.out.println(String.join(", ", unique));
    }
}
