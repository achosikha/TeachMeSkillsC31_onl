package task_7.hospitaltwo;

public class Surgeon extends Doctor{
    public Surgeon(String name) {
        super(name);
    }
    @Override
    public void treat() {
        System.out.println("Surgical treatment");
    }
}
