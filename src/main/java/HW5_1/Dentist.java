package HW5_1;

public class Dentist extends Doctor {
    public Dentist() {
        super("Стоматолог");
    }

    @Override
    public void treat() {
        System.out.println("Дантист лечит кариес");
    }
}
