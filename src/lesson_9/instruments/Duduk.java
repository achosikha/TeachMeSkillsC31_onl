package lesson_9.instruments;

public class Duduk extends Instruments{
    public Duduk(String instrumentName, String instrumentType) {
        super(instrumentName, instrumentType);
    }

    @Override
    public String sound() {
        return "Duduk has a specific sound for some music compositions...";
    }

    @Override
    public String speed() {
        return "It depends on Musician!";
    }

    @Override
    public void getAdditionalData(String[] data) {
        for (String el : data){
            System.out.println(el);
        }
    }
}
