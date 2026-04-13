package HW7;

import java.util.Scanner;

public class Task3 {
    //Задача 3: Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше средней, а также их длину.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку 1:");
        String s1 = sc.nextLine();

        System.out.println("Введите строку 2:");
        String s2 = sc.nextLine();

        System.out.println("Введите строку 3:");
        String s3 = sc.nextLine();

        sc.close();

        // Вычисление средней длины
        double avg = (s1.length() + s2.length() + s3.length()) / 3.0;

        // Вывод строк меньше средней
        if (s1.length() < avg) {
            System.out.println(s1 + " — длина: " + s1.length());
        }

        if (s2.length() < avg) {
            System.out.println(s2 + " — длина: " + s2.length());
        }

        if (s3.length() < avg) {
            System.out.println(s3 + " — длина: " + s3.length());
        }
    }
}
