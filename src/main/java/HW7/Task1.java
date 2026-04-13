package HW7;

import java.util.Scanner;

public class Task1 {
    //Домашнее задание
//Задача 1: Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ввод трёх строк
        System.out.print("Первая строка: ");
        String first = input.nextLine();

        System.out.print("Вторая строка: ");
        String second = input.nextLine();

        System.out.print("Третья строка: ");
        String third = input.nextLine();

        input.close();

        // Определение самой короткой и длинной строки
        String shortest = findMinLength(first, second, third);
        String longest = findMaxLength(first, second, third);

        // Вывод результатов
        System.out.println("\n--- РЕЗУЛЬТАТ ---");
        System.out.println("Самая короткая: \"" + shortest + "\" (длина: " + shortest.length() + ")");
        System.out.println("Самая длинная:  \"" + longest + "\" (длина: " + longest.length() + ")");
    }

    // Метод для поиска строки с минимальной длиной
    private static String findMinLength(String a, String b, String c) {
        String min = a;
        if (b.length() < min.length()) {
            min = b;
        }
        if (c.length() < min.length()) {
            min = c;
        }
        return min;
    }

    // Метод для поиска строки с максимальной длиной
    private static String findMaxLength(String a, String b, String c) {
        String max = a;
        if (b.length() > max.length()) {
            max = b;
        }
        if (c.length() > max.length()) {
            max = c;
        }
        return max;
    }
}


