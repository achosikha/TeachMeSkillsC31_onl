package task_7.hospital;

public class Dentist extends Doctor{
    public Dentist(){};

    Dentist(String name) {
        super(name);
    }

    @Override
    public void treat() {
        System.out.println("I treat teeth");
    }

}
