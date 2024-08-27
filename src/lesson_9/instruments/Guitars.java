package lesson_9.instruments;

public abstract class Guitars extends Instruments{
    public Guitars(String instrumentName, String instrumentType) {
        super(instrumentName, instrumentType);
    }

    public void onlyForGuitars(){}
}
