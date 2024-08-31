package task_7.sidorenko;

public class Therapist extends Doctors{
    Therapist(String name, String specialization) {
        super(name, specialization);
    }

    @Override
    void treat() {
        System.out.println("Врач " + this.getName() + " со специализацией " + this.getSpecialization() + " начинает лечение");
    }

    void appointment(Patient patient) {
        if (patient.getTreatmentPlan() == 1) {
            patient.setDoctor(new Surgeon("Ксения", "хирург"));
        } else if (patient.getTreatmentPlan() == 2) {
            patient.setDoctor(new Dentist("Павел", "стоматолог"));
        } else {
            patient.setDoctor(this);
        }
        patient.getDoctor().treat();
    }
}
