package lesson_8.task;

public class Coala extends Animals{
    private String getHiddenInfo;

    Coala(){
        super();
    }

    Coala(String animalType, String animalName, int animalAge, int animalWeight) {
        super(animalType, animalName, animalAge, animalWeight);
        this.getHiddenInfo = "Additional information is that this Coala is on a tree";
    }

    @Override
    void sound() {
        System.out.println("Coala is snoozed!");
    }

    @Override
    void jump() {
        System.out.println("Coala jumps very low!");
    }

    @Override
    void run() {
        System.out.println("Coala only walks!");
    }

    void getHiddenInformation(){
        System.out.println("This is only information for Coala's: " + this.getHiddenInfo);
    }
}
