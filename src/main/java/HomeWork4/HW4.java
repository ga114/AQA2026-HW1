package HomeWork4;


import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
//        Практика
//        Задача 1:
//        1.1 Создать класс Calculator с полями weight, cost, color и заполнить их. И методами нахождения
//        суммы, разности, деления, умножения двух чисел. Метод main в этом классе не создавать!

        Calculator calculator = new Calculator(5, 4, "red");
        System.out.println("\n--- Создан объект калькулятор и ему присвоены значения, далее можно создать другой с другими значениями ---\n");
        System.out.println("Ведите число А: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("Ведите число B: ");

        Scanner sc2 = new Scanner(System.in);
        double b = sc2.nextDouble();

        double s = calculator.sum(a, b);
        System.out.println("Результат сложения чисел " + a + " и " + b + " = " + s);
        double dif = calculator.difference(a, b);
        System.out.println("Результат вычитания чисел " + a + " и " + b + " = " + dif);
        double div = calculator.divide(a, b);
        System.out.println("Результат деления чисел " + a + " и " + b + " = " + div);
        double mul = calculator.multiply(a, b);
        System.out.println("Результат умножения чисел " + a + " и " + b + " = " + mul);

//        1.2 Создать объект класса Calculator в main методе другого класса. Проверить работу методов и вывести
//        в консоль значения полей weight, cost, color.
        System.out.println("Вывести значения заданные в калькуляторе weight: " + calculator.weight + " cost: " + calculator.cost + " color: " + calculator.color);
//        1.3 Создать конструктор для класса Calculator, чтобы иметь возможность инициализировать поля в момент создания
//        объекта. Также в логическом блоке добавить вывод в консоль, что создаётся объект Calculator.
        // решено выше

//        Задача 2:
//        2.1 Создать класс Person, который содержит: переменные fullName, age;
//         методы talk(String text) и move(), в которых вывести на консоль сообщение -
//         "*fullName* talk *text*..." и "*fullName* walk.".

        class Person {
            final String fullName;
            final int age;

            public Person() {
                this.fullName = "Неизвестно";
                this.age = 0;
            }

            public Person(String fullName, int age) {
                this.fullName = fullName;
                this.age = age;
            }

            public void talk(String text) {
                System.out.println(fullName + " talk: " + text);
            }

            public void move() {
                System.out.println(fullName + " walk.");
            }
        }
//        2.2 Добавьте два конструктора Person() и Person(fullName, age).
        Person person = new Person();
        System.out.println("***Первый человек***");
        System.out.println("Имя: " + person.fullName + ", Возраст: " + person.age);
        person.move();
        person.talk("Hello world");
//        2.3 Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой -
//        Person(fullName, age). Вызовите методы move() и talk()
        Person person2 = new Person("Иванов Иван", 40);
        System.out.println("\n***Второй человек***");
        System.out.println("Имя: " + person2.fullName + ", Возраст: " + person2.age);
        person2.move();
        person2.talk("Да будет новая точка развития!");

//        Домашнее задание
//        Задача 1: Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте метод,
//        который позволяет начислять сумму на кредитную карточку. Добавьте метод, который позволяет снимать с карточки
//        некоторую сумму. Добавьте метод, который выводит текущую информацию о карточке. Напишите программу, которая
//        создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма. Тестовый сценарий
//        для проверки: Положите деньги на первые две карточки и снимите с третьей. Выведите на экран текущее состояние
//        всех трех карточек.

        class CreditCart {
            final int numberCard;
            int balance;

            public CreditCart(int numberCard, int balance) {
                this.numberCard = numberCard;
                this.balance = balance;
            }

            public void addMoney(int amount) {
                this.balance += amount;
            }

            public void subtractMoney(int amount) {
                this.balance -= amount;

            }
        }
        CreditCart cart1 = new CreditCart(111, 0);
        CreditCart cart2 = new CreditCart(222, 0);
        CreditCart cart3 = new CreditCart(333, 3000);
        cart1.addMoney(1000);
        cart2.addMoney(2000);
        cart3.subtractMoney(1000);
        System.out.println("Баланс карт:");
        System.out.println("Карта 1: " + cart1.balance);
        System.out.println("Карта 2: " + cart2.balance);
        System.out.println("Карта 3: " + cart3.balance);

//        Задача 2: Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате, должен задаваться
//        тремя свойствами: количеством купюр номиналом 20, 50 и 100. Сделать метод для добавления денег в банкомат.
//        Сделать функцию, снимающую деньги, которая принимает сумму денег, а возвращает булевое значение - успешность
//        выполнения операции. При снятии денег, функция должна распечатывать каким количеством купюр какого номинала
//        выдаётся сумма. Создать конструктор с тремя параметрами -количеством купюр каждого номинала

        class ATM {
            // Поля класса - количество купюр каждого номинала
            private int banknote20;   // количество купюр по 20
            private int banknote50;   // количество купюр по 50
            private int banknote100;  // количество купюр по 100

            // Конструктор с тремя параметрами
            public ATM(int count20, int count50, int count100) {
                this.banknote20 = count20;
                this.banknote50 = count50;
                this.banknote100 = count100;
            }

            // Метод для добавления денег в банкомат
            public void addMoney(int add20, int add50, int add100) {
                this.banknote20 += add20;
                this.banknote50 += add50;
                this.banknote100 += add100;
                System.out.println("Деньги добавлены успешно!");
                printBalance();
            }

            // Метод для снятия денег
            public boolean withdraw(int amount) {
                System.out.println("\n=== Попытка снять " + amount + " ===");

                // Проверка: сумма должна быть положительной и кратной 10
                if (amount <= 0 || amount % 10 != 0) {
                    System.out.println("Ошибка: сумма должна быть положительной и кратной 10");
                    return false;
                }

                // начинаем с крупных купюр
                int need100 = 0, need50 = 0, need20 = 0;
                int remaining = amount;

                // Пытаемся выдать купюры по 100
                need100 = Math.min(remaining / 100, banknote100);
                remaining -= need100 * 100;

                // Пытаемся выдать купюры по 50
                need50 = Math.min(remaining / 50, banknote50);
                remaining -= need50 * 50;

                // Пытаемся выдать купюры по 20
                need20 = Math.min(remaining / 20, banknote20);
                remaining -= need20 * 20;

                // Проверяем, удалось ли выдать всю сумму
                if (remaining != 0) {
                    System.out.println("Ошибка: невозможно выдать сумму " + amount + " имеющимися купюрами");
                    return false;
                }

                // Выдаём деньги (уменьшаем количество купюр в банкомате)
                banknote100 -= need100;
                banknote50 -= need50;
                banknote20 -= need20;

                // Печатаем результат
                System.out.println("Операция успешна! Выдано:");
                if (need100 > 0) System.out.println("  " + need100 + " x 100 = " + (need100 * 100));
                if (need50 > 0) System.out.println("  " + need50 + " x 50 = " + (need50 * 50));
                if (need20 > 0) System.out.println("(" + need20 + " x 20 = " + (need20 * 20));
                System.out.println("Итого: " + amount);

                printBalance();
                return true;
            }

            // Вспомогательный метод: показать баланс банкомата
            public void printBalance() {
                int total = banknote20 * 20 + banknote50 * 50 + banknote100 * 100;
                System.out.println("Баланс банкомата: " + total + " (20x" + banknote20 + ", 50x" + banknote50 + ", 100x" + banknote100 + ")");
            }
        }
        // Главный метод для тестирования
        // Создаём банкомат: 10 купюр по 20, 5 купюр по 50, 3 купюры по 100
        ATM atm = new ATM(10, 5, 3);
        System.out.println("=== Банкомат создан ===");
        atm.printBalance();

        // Тестируем снятие денег
        atm.withdraw(180);   // 100 + 50 + 20 + 10? → нет, 100 + 80(20x4)
        atm.withdraw(370);   // 100x3 + 50 + 20
        atm.withdraw(100);   // 100
        atm.withdraw(30);    // ошибка: нет купюры 10
        atm.withdraw(5000);  // ошибка: недостаточно средств

        // Добавляем денег
        atm.addMoney(5, 2, 1);

        // Ещё одно снятие
        atm.withdraw(150);   // 100 + 50
    }
}
