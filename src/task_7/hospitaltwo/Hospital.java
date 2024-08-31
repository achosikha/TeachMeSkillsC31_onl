package task_7.hospitaltwo;

public class Hospital {
    public static void main(String[] args) {
        Patient patient1 = createPatient("John", 1);
        Patient patient2 = createPatient("Mary", 2);
        Patient patient3 = createPatient("Jane", 3);

        Therapist therapist = new Therapist("Emily");

        therapist.appointDoctor(patient1);
        Doctor doctor1 = patient1.getDoctor();
        doctor1.treat();
        therapist.appointDoctor(patient2);
        Doctor doctor2 = patient2.getDoctor();
        doctor2.treat();
        therapist.appointDoctor(patient3);
        Doctor doctor3 = patient3.getDoctor();
        doctor3.treat();
    }

    public static Patient createPatient(String name, int treatmentPlan) {
        return new Patient(name, treatmentPlan);
    }
}
