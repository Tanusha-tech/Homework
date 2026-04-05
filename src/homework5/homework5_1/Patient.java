package homework5.homework5_1;

public class Patient {
    int treatmentPlan;
    String doctor;

    public Patient(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public void assignDoctor(String doctorName) {
        this.doctor = doctorName;
        System.out.printf("\nНазначен врач: %s%n", doctorName);
    }
}
