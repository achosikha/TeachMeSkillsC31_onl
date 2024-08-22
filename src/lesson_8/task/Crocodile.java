package lesson_8.task;

public class Crocodile extends Animals {
    private String getHiddenInfo;

    Crocodile(){
        super();
    }

    Crocodile(String animalType, String animalName, int animalAge, int animalWeight) {
        super(animalType, animalName, animalAge, animalWeight);
        this.getHiddenInfo = "Additional information is that this Crocodile is not alvie anymore";
    }

    @Override
    void sound() {
        System.out.println("Crocodile does not have any particular sound!");
    }

    @Override
    void jump() {
        System.out.println("Crocodile does not jump!");
    }

    @Override
    void run() {
        System.out.println("Crocodiles maximum speed is 30km per hour...");
    }

    void getHiddenInformation(){
        System.out.println("This is only information for crocodiles: " + this.getHiddenInfo);
    }
}