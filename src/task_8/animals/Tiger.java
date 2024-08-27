package task_8.animals;

import task_8.Animals;

public class Tiger extends Animals {
    public Tiger(String name, String type) {
        super(name, type);
    }

    @Override
    public void sound() {
        System.out.println("Tiger roars!");
    }

    @Override
    public void eat(String food) {
        switch (food){
            case "Meat":
                System.out.println("I am a MEAT love!");
                break;
            case "Milk":
                System.out.println("In my childhood milk is OK!");
                break;
            default:
                System.out.println("The rest is not for me!");
                break;
        }
    }
}
