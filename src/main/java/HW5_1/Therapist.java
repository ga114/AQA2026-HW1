package HW5_1;

public class Therapist extends Doctor {
    Doctor doctor;

    public Therapist() {
        super("Терапевт");
    }

    @Override
    public void treat() {
        System.out.println("Терапевт осматривает");
    }

    public void choicheDostor(Patient patient) {


        if (patient.plan == 1) {
            doctor = new Surgeon();
            System.out.println("Назначен хирург");
        } else if (patient.plan == 2) {
            doctor = new Dentist();
            System.out.println("Назначен стоматолог");
        } else if (patient.plan == 3) {
            doctor = new Therapist();
            System.out.println("Назначен терапевт");
        }
        patient.doctor = doctor;
        doctor.treat();
    }
}

