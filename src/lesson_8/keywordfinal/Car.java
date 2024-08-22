package lesson_8.keywordfinal;

public class Car {
    private String model;
    private int counter;

    // I do belong to everyone and the CLASS not its instances
    private static int newCounter;

    static {
        // checkout information, homework
    }

    Car(String model){
        this.model = model;
        counter++;
        newCounter++;
    }

    public static int getCounterStatic(){
        return newCounter;
    }

    public int getCounter() {
        return counter;
    }

    // final in method can not be overriden
    final void getCarSound(){
        System.out.println("Final method implementation. No override!");
    }
}
