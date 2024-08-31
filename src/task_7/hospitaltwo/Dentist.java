package task_7.hospitaltwo;

public class Dentist extends Doctor{
    public Dentist(String name) {
        super(name);
    }

    @Override
    public void treat() {
        System.out.println("Dental treatment");
    }
}
