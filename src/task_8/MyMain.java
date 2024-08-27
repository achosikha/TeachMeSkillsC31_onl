package task_8;

/*
import task_8.animals.Dogs;
import task_8.animals.Rabbits;
import task_8.animals.Tiger;
*/

import task_8.animals.*; // .* -> import everything

public class MyMain {
    public static void main(String[] args) {
        Animals[] zooAnimals = new Animals[]{
                new Dogs("Vasya", "Dog"),
                new Rabbits("Katya", "Rabbit"),
                new Tiger("Ksenya", "Tiger")
        };

        for(Animals animal : zooAnimals){
            System.out.println(animal);
            animal.eat("Meat");
            animal.sound();
            System.out.println("------------------------------");
        }
    }
}
