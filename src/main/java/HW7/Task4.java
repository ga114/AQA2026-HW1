package HW7;

import java.util.Scanner;

public class Task4 {
//Задача 4: Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов. Если таких слов несколько,
// найти первое из них.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку 1:");
        String s1 = sc.nextLine();

        System.out.println("Введите строку 2:");
        String s2 = sc.nextLine();

        System.out.println("Введите строку 3:");
        String s3 = sc.nextLine();

        sc.close();

        // Разбиваем строки на слова и ищем первое с уникальными символами.
        String result = findFirstUniqueWord(s1);

        if (result == null) {
            result = findFirstUniqueWord(s2);
        }

        if (result == null) {
            result = findFirstUniqueWord(s3);
        }

        if (result != null) {
            System.out.println("Первое слово с различными символами: " + result);
        } else {
            System.out.println("Слов с различными символами не найдено");
        }
    }

    // Проверка, что все символы в слове различны
    private static boolean hasAllUniqueChars(String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    // Поиск первого слова с уникальными символами в строке
    private static String findFirstUniqueWord(String line) {
        String[] words = line.split(" ");

        for (String word : words) {
            if (!word.isEmpty() && hasAllUniqueChars(word)) {
                return word;
            }
        }

        return null;
    }
}
