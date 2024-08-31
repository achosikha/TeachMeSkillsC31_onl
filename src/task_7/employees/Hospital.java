package task_7.employees;

public class Hospital {
    private Terapist terapist;
    private Surgeon surgeon;
    private Dentist dentist;

    public Hospital(Terapist terapist, Surgeon surgeon, Dentist dentist){
        this.terapist = terapist;
        this.surgeon = surgeon;
        this.dentist = dentist;
    }

    public Terapist getTerapist() {
        return terapist;
    }
}
