package HW7;

import java.util.Scanner;

public class Task2 {
    //Задача 2: Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания значений их длины.
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Ввод строк
        System.out.print("Строка 1: ");
        String str1 = reader.nextLine();

        System.out.print("Строка 2: ");
        String str2 = reader.nextLine();

        System.out.print("Строка 3: ");
        String str3 = reader.nextLine();

        reader.close();

        // Сортировка пузырьком по длине (по возрастанию)
        String temp;

        // Сравниваем и меняем местами если нужно
        if (str1.length() > str2.length()) {
            temp = str1;
            str1 = str2;
            str2 = temp;
        }

        if (str2.length() > str3.length()) {
            temp = str2;
            str2 = str3;
            str3 = temp;
        }

        // Повторная проверка первых двух после возможного изменения
        if (str1.length() > str2.length()) {
            temp = str1;
            str1 = str2;
            str2 = temp;
        }

        // Вывод результата
        System.out.println("\n=== Строки по возрастанию длины ===");
        System.out.println("1. \"" + str1 + "\" (" + str1.length() + " симв.)");
        System.out.println("2. \"" + str2 + "\" (" + str2.length() + " симв.)");
        System.out.println("3. \"" + str3 + "\" (" + str3.length() + " симв.)");
    }
}

