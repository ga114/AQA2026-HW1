package HomeWork4;

public class Calculator {
    // Поля класса
    double weight;
    double cost;
    String color;

    // Конструктор для заполнения полей
    public Calculator(double weight, double cost, String color) {
        this.weight = weight;
        this.cost = cost;
        this.color = color;
    }

    // Метод сложения
    public double sum(double a, double b) {
        return a + b;
    }

    // Метод вычитания
    public double difference(double a, double b) {
        return a - b;
    }

    // Метод деления
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль!");
        }
        return a / b;
    }

    // Метод умножения
    public double multiply(double a, double b) {
        return a * b;
    }
}