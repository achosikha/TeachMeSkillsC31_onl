package lesson_8.task;

public class Animals {
    private String animalType;
    private String animalName;
    private int animalAge;
    private int animalWeight;

    Animals(){}

    Animals(String animalType, String animalName, int animalAge, int animalWeight){
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalAge = animalAge;
        this.animalWeight = animalWeight;
    }

    public String getAnimalType() {
        return animalType;
    }

    void run(){
        System.out.println("No information in the SuperClass Animals...");
    }

    void sound(){
        System.out.println("No information in the SuperClass Animals...");
    }

    void jump(){
        System.out.println("No information in the SuperClass Animals...");
    }

    String getFullInformation(){
        return "Animal type: " + this.animalType + "\n" +
                "Animal name: " + this.animalName + "\n" +
                "Animal age: " + this.animalAge + "\n" +
                "Animal weight: " + this.animalWeight;
    }

    @Override
    public String toString() {
        return "Animal type: " + this.animalType + "\n" +
                "Animal name: " + this.animalName + "\n" +
                "Animal age: " + this.animalAge + "\n" +
                "Animal weight: " + this.animalWeight;
    }
}
