package task_7.hospital;

public class Therapist extends Doctor{
    public Therapist() {}

    @Override
    public void treat() {
        System.out.println("I prescribe treatment");
    }

    public void setDoctor(int IDTreat){
        switch (IDTreat) {
            case 1 -> Patient.doctor = "Surgeon";
            case 2 -> Patient.doctor = "Dentist";
            default -> Patient.doctor = "Therapist";
        }
    }
}
