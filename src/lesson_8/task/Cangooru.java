package lesson_8.task;

public class Cangooru extends Animals{
    private String getHiddenInfo;

    Cangooru(){
        super();
    }

    Cangooru(String animalType, String animalName, int animalAge, int animalWeight) {
        super(animalType, animalName, animalAge, animalWeight);
        this.getHiddenInfo = "Additional information is that this Cangooru is pregnant";
    }

    @Override
    void sound() {
        System.out.println("Cangooru does not sound, it fights!");
    }

    @Override
    void jump() {
        System.out.println("Cangooru jumps very high!");
    }

    @Override
    void run() {
        System.out.println("Cangooru does not run, it cannot run!");
    }

    void getHiddenInformation(){
        System.out.println("This is only information for Cangooru's: " + this.getHiddenInfo);
    }
}
