package task_7.sidorenko;

public class Doctors {
    private String name;
    private String specialization;

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    Doctors(String name, String specialization){
        this.name = name;
        this.specialization = specialization;
    }

    void treat(){
        System.out.println("Лечит все болезни");
    }
}
