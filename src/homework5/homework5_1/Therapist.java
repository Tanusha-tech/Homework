package homework5.homework5_1;

public class Therapist {

    Surgeon surgeon = new Surgeon();
    Dentist dentist  = new Dentist();

    public void treat() {
        System.out.println("Повторный осмотр");
    }

    public void assignDoctorAndTreat(Patient patient) {
        switch (patient.getTreatmentPlan()) {
            case 1:
                patient.assignDoctor("Хирург");
                surgeon.treat();
                break;
            case 2:
                patient.assignDoctor("Дантист");
                dentist.treat();
                break;
            default:
                patient.assignDoctor("Терапевт");
                treat();
                break;
        }
    }
}
