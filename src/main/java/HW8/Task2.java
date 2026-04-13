package HW8;

import java.util.ArrayList;
import java.util.List;

class AnimalCollection {

    private final List<String> animals = new ArrayList<>();

    // Добавление в начало
    public void add(String animal) {
        animals.add(0, animal);
    }

    // Удаление из конца
    public void remove() {
        if (!animals.isEmpty()) {
            animals.remove(animals.size() - 1);
        }
    }

    // Показать всех
    public void show() {
        System.out.println(animals);
    }
}

public class Task2 {
    //    Задача 2: Создать класс, который будет хранить в себе коллекцию с названиями животных. Реализовать методы
//    удаления и добавления животных по следующим правилам: добавляется всегда в начало коллекции, а удаляется всегда
//    из конца. Показать работу объекта этого класса в main методе другого класса.

    public static void main(String[] args) {
        AnimalCollection zoo = new AnimalCollection();

        // Добавляем животных
        zoo.add("Кот");
        zoo.add("Собака");
        zoo.add("Попугай");

        System.out.print("После добавления: ");
        zoo.show();

        // Удаляем из конца
        zoo.remove();

        System.out.print("После удаления: ");
        zoo.show();

        // Ещё добавим
        zoo.add("Рыбка");

        System.out.print("После добавления: ");
        zoo.show();
    }

}