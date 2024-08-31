package task_7.sidorenko;

public class MySidorenko {
    public static void main(String[] args) {
        Patient patient = new Patient("Полина", 2);
        Therapist therapist = new Therapist("Никита", "терапевт");
        therapist.appointment(patient);
    }
}
