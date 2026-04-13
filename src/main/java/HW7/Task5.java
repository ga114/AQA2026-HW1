package HW7;

import java.util.Scanner;

public class Task5 {
// Задача 5: Вывести на консоль новую строку, которой задублирована каждая буква из начальной строки
// Например, "Hello" -> "HHeelllloo"

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку:");
        String s = sc.nextLine();

        sc.close();

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            result = result + c + c;
        }

        System.out.println(result);
    }
}
