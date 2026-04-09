package HW5_2;

public class HW5 {



//Домашнее задание
// Задача 2: Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать функцию подсчета площади
// для каждого типа фигуры и подсчет
// периметра(используя абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму периметра
// всех фигур в массиве


    public static void main(String[] args) {
        Shape[] shapes = {new Circle(5), new Rectangle(2,4), new Triangle(4,5,6),
                new Rectangle(4,4), new Circle(7)};
        double sumPerim = 0.0;
        double sumArea = 0.0;
        for (Shape shape : shapes) {
            sumPerim += shape.getArea();
            sumArea += shape.getArea();
        }
        System.out.println("Area perimeter is: " + sumPerim);
        System.out.println("Area perimeter is: " + sumArea);
    }
}
