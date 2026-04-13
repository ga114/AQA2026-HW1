package HW5_1;

public class Patient {

    public Doctor doctor;
    int plan;

    public Patient(int plan) {
        this.plan = plan;
    }

    public void info() {
        if (doctor != null) {
            System.out.println("Врач - " + doctor.name);
        } else {
            System.out.println("Враа нет!");
        }
    }
}
