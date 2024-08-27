package task_8.animals;

import task_8.Animals;

public class Rabbits extends Animals {
    public Rabbits(String name, String type) {
        super(name, type);
    }

    @Override
    public void sound() {
        System.out.println("Rabbit does not make any serious sound!");
    }

    @Override
    public void eat(String food) {
        switch (food){
            case "Grass" -> System.out.println("I love Grass!");
            case "Meat" -> System.out.println("I hate Meat!");
            default -> System.out.println("I don't even eat the rest!");
        }
    }
}
