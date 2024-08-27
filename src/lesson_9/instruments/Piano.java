package lesson_9.instruments;

public class Piano extends Instruments{
    public Piano(String instrumentName, String instrumentType) {
        super(instrumentName, instrumentType);
    }

    @Override
    public String sound() {
        return "Piano sounds terrific!";
    }

    @Override
    public String speed() {
        return "Speed depends on the musician!";
    }

    @Override
    public void getAdditionalData(String[] data) {
        for (String el : data){
            System.out.println(el);
        }
    }
}
