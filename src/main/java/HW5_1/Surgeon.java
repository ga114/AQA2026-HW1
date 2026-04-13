package HW5_1;

public class Surgeon extends Doctor {

    public Surgeon(String name) {
        super(name);
    }

    public Surgeon() {
        super("Хирург");
    }

    @Override
    public void treat() {
        System.out.println("Хирург опертирует");
    }
}
