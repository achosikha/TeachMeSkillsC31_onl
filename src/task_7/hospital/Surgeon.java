package task_7.hospital;

public class Surgeon extends Doctor{
    public Surgeon(){};

    Surgeon(String name) {
        super(name);
    }

    @Override
    public void treat() {
        System.out.println("I treat injuries");
    }
}
