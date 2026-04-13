package HW5_1;

public class Doctor {

    public String name;

    public Doctor(String name) {
        this.name = name;
    }

    public void treat() {
        System.out.println(name + "лечит");
    }
}
