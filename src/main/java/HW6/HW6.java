package HW6;

public class HW6 extends methods {
    //Домашнее задание
//Задача 1: Создать класс с как минимум 4 разными методами, в каждом методе добавить проверку на исключительные
//ситуации, используя: 1. try- catch 2. try-catch, где catch будет несколько 3. try -catch,
//с использованием multi - catch 4. try-catch-fi nally
//Продемонстрировать обработку исключительных ситуаций на примерах.

    // Точка входа для демонстрации
    public static void main(String[] args) {
        ExceptionHandler handler = new ExceptionHandler();

        System.out.println("=== Тестирование метода 1 ===");
        handler.calculateRatio(25.0, 5.0);
        handler.calculateRatio(10.0, 0.0);

        System.out.println("\n=== Тестирование метода 2 ===");
        handler.processData(1, "test");
        handler.processData(5, "test");
        handler.processData(2, null);

        System.out.println("\n=== Тестирование метода 3 ===");
        handler.validateEntry(0, "data");
        handler.validateEntry(10, "data");
        handler.validateEntry(2, "data");

        System.out.println("\n=== Тестирование метода 4 ===");
        handler.executeOperation(1, "payload");
        handler.executeOperation(3, "payload");
        handler.executeOperation(2, "payload");
    }
}
