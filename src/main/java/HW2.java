import java.util.Scanner;

public class HW2 {

    public static void main(String[] args) {
//Практика
//Задача 1: Ввести с консоли любое число от 1 до 12. В зависимости от введённого числа вывести в консоль
//соответствующую пору года по номеру месяца. При решении использовать switch.
        System.out.println("Задача 1");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число месяца от 1 до 12: ");
        int a = input.nextInt();
        switch (a) {
            case 12:
            case 1:
            case 2:
                System.out.println("Time of year Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Time of year Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Time of year Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Time of year Autumn");
                break;
            default:
                System.out.println("Введенное число не попадает в интервал от 1 до 12");
                break;
        }

//Задача 2: Используя while вывести все числа от 0 до 25 в одну строку через пробел.
        System.out.println("Задача 2");
        int i = 0;
        while (i < 25) {
            System.out.println("Выводим все числа от 0 до 25:");
            System.out.print(i + " ");
            i++;
        }

//Задача 3: Используя for вывести каждое четное число от 2 до 20 включительно и больше 10

        for (int j = 2; j < 25; j += 2) {
            System.out.print(j + " ");
        }
        System.out.println();
//Домашнее задание
//Задача 1: Напишите программу, которая будет принимать на вход число из консоли и на выход будет выводить
//сообщение четное число или нет. Для определения четности числа используйте операцию получения остатка от деления
//(операция выглядит так: '% 2').
        System.out.println("Задача 1");
        Scanner input2 = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a2 = input2.nextInt();

        if (a2 % 2 == 0) {
            System.out.println("Число четное");
        } else System.out.println("Число не четное");

// Задача 2: Для введенного числа t (температура на улице) вывести: Если t>–5,
//то вывести «Warm». Если –5>= t >–20, то вывести «Normal». Если –20>= t, то вывести «Cold».
        System.out.println("Задача 2");
        Scanner input3 = new Scanner(System.in);
        System.out.println("Введите число:");
        int a3 = input3.nextInt();
        if (a3 > -5) System.out.println("Warm");
        else if (a3 > -20) System.out.println("Normal");
        else System.out.println("Cold");

// Задача 3:
//Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
        System.out.println("Задача 3");
        for (int i9 = 10; i9 <= 20; i9++) {
            System.out.print(i9 * i9 + " ");
        }
        System.out.println();
//Задача 4: Необходимо,
//чтоб программа выводила на экран вот такую последовательность: 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
//В решении используйте цикл while.
        System.out.println("Задача 4");
        int g = 7;
        do {
            System.out.print(g + " ");
            g = g + 7;
        }
        while (g <= 98);

//Задача *: Напишите программу, где пользователь вводит любое целое положительное
//число. А программа суммирует все числа от 1 до введенного пользователем числа. Для ввода числа воспользуйтесь
//классом Scanner. Сделать проверку, чтобы пользователь не мог ввести некорректные данные

        System.out.println("Задача 5");
        int number;
        while (true) {
            System.out.print("Введите целое число в диапазоне int: ");

            if (input.hasNextInt()) {
                number = input.nextInt();
                input.nextLine();
                System.out.println("Вы ввели: " + number + " и это подходящее целое число!");
                break;
            } else {
                System.out.println("Ошибка! Это не целое число.");
                input.nextLine(); // очистка неверного ввода
            }
        }
    }
}
