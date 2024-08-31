package task_7.sidorenko;

public class Patient {
    private String name;
    private Doctors doctor;
    private int treatmentPlan;

    public Patient(String name, Doctors doctor, int treatmentPlan) {
        this.name = name;
        this.doctor = doctor;
        this.treatmentPlan = treatmentPlan;
    }

    public Patient(String name, int treatmentPlan) {
        this.name = name;
        this.treatmentPlan = treatmentPlan;
    }

    public String getName() {
        return name;
    }

    public Doctors getDoctor() {
        return doctor;
    }

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setDoctor(Doctors doctor) {
        this.doctor = doctor;
    }
}
