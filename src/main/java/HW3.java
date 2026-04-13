import java.util.Arrays;
import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
//Практика
//Задача 1: Сгенерировать 5 случайных чисел. Каждое возвести в квадрат и вывести в консоль.

        System.out.println("Выводим 5 случайных чисел возведенных в квардрат:");
        for (int i = 1; i <= 5; i++) {
            int rand = (int) (Math.random() * 100);
            int square = rand * rand;
            System.out.print(square + " ");
        }
        System.out.println();
//Задача 2: 2.1 Создать массив fruits и заполнить его 4 произвольными фруктами.
        String[] fruits = {"яблоко", "банан", "груша", "апельсин"};
// 2.2 вывести в консоль второй и четвертый.
        System.out.println(fruits[1] + " " + fruits[3]);
//2.3 вывести в консоль длину массива.
        System.out.println(fruits.length);
// 2.4 третий фрукт заменить на иной.
        fruits[2] = "мандарин";
// 2.5 проверить результат в консоли.
        System.out.println(fruits[2]);


//Задача 3: 3.1 Создать пустой массив типа double с названием masDouble такого размера, который пользователь вводит с клавиатуры.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        int size = sc.nextInt();
        Double[] masDouble = new Double[size];
// 3.2 Заполнить masDouble рандомными числами, используя Math.random() и вывести его в консоль.
        System.out.print("Исходный массив: ");
        for (int i = 0; i <= size - 1; i++) {
            masDouble[i] = Math.random() * 1000;
            System.out.print(masDouble[i] + " ");
        }
        System.out.println();

// 3.3 Каждый чётный элемент masDouble возвести в квадрат. Вывести массив в прямом и обратном порядке

        System.out.print("Исходный выбранный массив: ");
        for (int i = 0; i < size; i++) {
            if ((i + 1) % 2 == 0) {
                System.out.print(masDouble[i] + " ");// чётные по порядку (2-й(индекс 1, не 0), 4-й (индекс 3))
                masDouble[i] = masDouble[i] * masDouble[i];
            }
        }
        System.out.println();
        System.out.print("Прямой порядок: ");
        for (int i = 0; i < size; i++) {
            if ((i + 1) % 2 == 0) {
                System.out.printf(masDouble[i] + " ");
            }
        }
        System.out.println();
        System.out.print("Обратный порядок: ");
        for (int i = size - 1; i >= 0; i--) {
            if ((i + 1) % 2 == 0) {
                System.out.print(masDouble[i] + " ");
            }
        }
        System.out.println();

//Домашнее задание
//Для всех задач исходные условия следующие: пользователь с клавиатуры вводит размер массива (просто целое число).
// После того, как размер массива задан, заполнить его одним из двух способов: используя Math.random(),
// или каждый элемент массива вводится пользователем вручную. Попробовать оба варианта. После заполнения массива данными,
// решить для него следующие задачи:

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        int size2 = sc2.nextInt();
        Integer[] randInteger = new Integer[size2];
        for (int i = 0; i < size2; i++) {
            randInteger[i] = (int) (Math.random() * 1000);
        }


        Scanner sc3 = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        int size3 = sc3.nextInt();

        Integer[] manuallyInteger = new Integer[size3];
        for (int i = 0; i < size2; i++) {
            Scanner sc4 = new Scanner(System.in);
            System.out.println("Введите элемент массива " + i + " : ");
            manuallyInteger[i] = sc4.nextInt();
        }
//Задача 1: Пройти по массиву, вывести все элементы в прямом и в обратном порядке.

        System.out.println("Массив введенный вручную в прямом порядке:");
        for (int j = 0; j < size3; j++) {
            System.out.println(manuallyInteger[j] + " ");
        }
        System.out.println("Массив введенный вручную в обратном порядке:");
        for (int j = size3 - 1; j >= 0; j--) {
            System.out.println(manuallyInteger[j] + " ");
        }
//Задача 2: Найти минимальный - максимальный элементы и вывести в консоль.
        System.out.println("Оригинальный массив: ");
        for (int u = 0; u <= size2 - 1; u++) {
            System.out.print(randInteger[u] + " ");
        }

        int index1 = 0;
        int index2 = 0;

        int max = 0;
        for (int u = 0; u <= size2 - 1; u++) {
            if (randInteger[u] > max) {
                max = randInteger[u];
                index1 = u + 1;
            }
        }
        System.out.println();
        System.out.println("Максимальное число: " + max);

        int min = 88888888;
        for (int u = 0; u <= size2 - 1; u++) {
            if (randInteger[u] < min) {
                min = randInteger[u];
                index2 = u + 1;
            }
        }
        System.out.println("Минимльное число: " + min);

//Задача 3: Найти индексы минимального и максимального элементов и вывести в консоль.
        System.out.println("Индекс максимального значения: " + index1 + " а минимального: " + index2);
//Задача 4: Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести сообщение, что их нет.

        int numNull = 0;
        for (int i = 0; i < size2; i++) {
            if (manuallyInteger[i] > 0) {
            } else {
                numNull++;
            }
        }
        if (numNull > 0) {
            System.out.println("Количество нулевых элементов: " + numNull);
        } else System.out.println("Нулевых элементов нет!");

// Задача 5: Пройти по массиву и поменять местами элементы первый и последний, второй и предпоследний и т.д.

        System.out.println("Исходный массив:");
        for (int i = 0; i < randInteger.length; i++) {
            System.out.print(randInteger[i] + " "
            );
        }
        System.out.println();
        for (int i = 0; i < randInteger.length / 2; i++) {
            int cash = randInteger[1];
            randInteger[i] = randInteger[randInteger.length - 1 - i];
            randInteger[randInteger.length - 1 - i] = cash;
        }
        System.out.println(Arrays.toString(randInteger));
        System.out.println();
// Задача 6: Проверить, является ли массив возрастающей последовательностью (каждое следующее число больше предыдущего).

        for (int i = 0; i < randInteger.length - 1; i++) {
            if (randInteger[i] > randInteger[i + 1]) {
            } else System.out.println("В массиве обнаружен признак не последовательности!");
            break;
        }


// Задача *: Имеется массив из неотрицательных чисел(любой).
// Представьте что массив представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} - > 999).
// Задача добавить единицу к этому “числу” и на выходе получить исправленный массив.
// Массив не содержит нуля в начале, кроме самого числа 0.
// Пример: Input: [1,4,0,5,6,3] Output: [1,4,0,5,6,4] Input: [9,9,9] Output: [1,0,0,0]

        Scanner sc5 = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        sc5.nextLine();
        int size5 = sc5.nextInt();
        Integer[] arrayTest = new Integer[size5];
        for (int i = 0; i < size5; i++) {
            Scanner sc6 = new Scanner(System.in);
            System.out.println("Введите " + i + " элемент массива: ");
            sc6.nextLine();
            arrayTest[i] = sc6.nextInt();
        }

        System.out.println("Исходный введенный массив: ");
        for (int j = 0; j < size5; j++) {
            System.out.print(arrayTest[j] + " ");
        }
        System.out.println();

        //Приведем массив к числу Integer, а потом распилим его при помощи деления без остатка
        int summArray = 0;
        for (int i = 0; i < size5; i++) {
            int razryad = (int) Math.pow(10, size5 - 1 - i);  // 100, 10, 1
            summArray += arrayTest[i] * razryad;
        }


        System.out.println("Свели массив к целому числу: " + summArray);
        summArray = summArray + 1;
        System.out.println("Приплюсовали единичку: " + summArray);

        // Разделим число обратно на массив
        // Надо вычислить длинну нового массива, вдруг она больше, поэтому заведем массив с новыой длинной

        int size6 = String.valueOf(summArray).length();  // определяем количество цифр
        Integer[] arrayTest2 = new Integer[size6];
        String str = String.valueOf(summArray);
        for (int i = 0; i < size6; i++) {
            arrayTest2[i] = Character.getNumericValue(str.charAt(i));
        }
        System.out.println(Arrays.toString(arrayTest2));

    }
}



