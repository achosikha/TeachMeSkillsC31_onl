package task_7.hospitaltwo;

public class Therapist extends Doctor{
    public Therapist(String name) {
        super(name);
    }

    @Override
    public void treat() {
        System.out.println("General treatment");
    }

    public void appointDoctor(Patient patient) {
        if (patient.getTreatmentPlan() == 1) {
            patient.setDoctor(new Surgeon("Oliver"));
        } else if (patient.getTreatmentPlan() == 2) {
            patient.setDoctor(new Dentist("Jack"));
        } else {
            patient.setDoctor(new Therapist("Emily"));
        }
    }
}
