package homework5.homework5_1;

public class PolyclinicMain {
    /* Создать программу для имитации работы клиники. Пусть в клинике будет три врача:
    хирург, терапевт и дантист. Каждый врач имеет метод «лечить», но каждый врач лечит по-своему.
    Так же предусмотреть класс «Пациент» с полем «План лечения» и полем «Доктор». Создать объект класса «Пациент» и
    добавить пациенту план лечения. У терапевта создать метод, который будет назначать врача пациенту
    согласно плану лечения:
    Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
    Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
    Если план лечения имеет любой другой код – назначить терапевта и выполнить метод лечить. */

    public static void main(String[] args) {

        Patient patient = new Patient(1);
        Patient patient2 = new Patient(2);
        Patient patient3 = new Patient(3);

        Therapist  therapist = new Therapist();

        therapist.assignDoctorAndTreat(patient);
        therapist.assignDoctorAndTreat(patient2);
        therapist.assignDoctorAndTreat(patient3);
    }
}
