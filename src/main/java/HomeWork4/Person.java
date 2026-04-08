package HomeWork4;


public class Person {
    String fullName;
    Integer age;

    //Конструктор без параметров
    public Person() {
        this.fullName = "noName";
        this.age = 0;
    }

    //Конструктор с параметрами
    public Person(String fullName, Integer age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void talk (String text){
        System.out.println(fullName + " talk \"" + text + "\".");
    }
    public void move (){
        System.out.println(fullName + " walk.");
    }
}
