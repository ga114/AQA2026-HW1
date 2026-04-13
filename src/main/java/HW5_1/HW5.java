package HW5_1;

public class HW5 {

    //Домашнее задание
//Задача 1: Создать программу для имитации работы клиники. Пусть в клинике будет три врача: хирург, терапевт и дантист.
// Каждый врач имеет метод «лечить», но каждый врач лечит по-своему. Так же предусмотреть класс «Пациент» с полем
// «План лечения» и полем «Доктор». Создать объект класса «Пациент» и добавить пациенту план лечения.
// У терапевта создать метод, который будет назначать врача пациенту согласно плану лечения:
// Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
// Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
// Если план лечения имеет любой другой код – назначить терапевта и выполнить метод лечить.
// Задача на полиморфизм - создадим иерархию классов с общим родительским классом Doctor и используем переопределение методов.
    public static void main(String[] args) {
        Patient patient1 = new Patient(1);
        Patient patient2 = new Patient(2);
        Patient patient3 = new Patient(3);
        Patient patient4 = new Patient(4);

        Therapist therapist = new Therapist();

        System.out.println("Первый пациент");
        therapist.choicheDostor(patient1);


        System.out.println("Второй пациент");
        therapist.choicheDostor(patient2);

        System.out.println("Третитй пациент");
        therapist.choicheDostor(patient3);

        System.out.println("Четвертый пациент");
        therapist.choicheDostor(patient4);
    }


}