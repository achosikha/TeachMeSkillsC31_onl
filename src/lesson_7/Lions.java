package lesson_7;

// For inheritance we use keyword extends
public class Lions extends Animals{
    Lions(String animalType, String animalColor, String animalName, int animalAge, int animalWeight) {
        // Calls super Class constructor
        // Animals(animalType, animalColor, animalName, animalAge, animalWeight)
        super(animalType, animalColor, animalName, animalAge, animalWeight);
    }

    // Polymorphism
    @Override
    void sounds() {
        System.out.println("My lion roars...!!!");
        // super.sounds(); -> repeat what is given in the super class Animals
    }

    @Override
    void runs() {
        System.out.println("My lion is tired!");
    }
}