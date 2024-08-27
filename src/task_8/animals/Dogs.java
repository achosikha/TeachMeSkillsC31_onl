package task_8.animals;

import task_8.Animals;

public class Dogs extends Animals {
    public Dogs(String name, String type) {
        super(name, type);
    }

    @Override
    public void sound() {
        System.out.println("Dog usually barks!");
    }

    @Override
    public void eat(String food) {
        switch (food){
            case "Meat" -> System.out.println("Oooh, I really love " + food);
            case "DogFood" -> System.out.println("The best from the Doctor!");
            default -> System.out.println("Well, I can survive!");
        }
    }
}
