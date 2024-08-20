package lesson_7;

public class Tigers extends Animals{
    Tigers(String animalType, String animalColor, String animalName, int animalAge, int animalWeight) {
        super(animalType, animalColor, animalName, animalAge, animalWeight);
    }

    @Override
    void sounds() {
        System.out.println("My Tiger is silent...");
    }

    @Override
    void runs() {
        System.out.println("My tiger is hunting!");
    }

    void onlyTiger(){
        System.out.println("Only Tiger!");
    }
}
