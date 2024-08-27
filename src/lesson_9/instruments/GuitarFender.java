package lesson_9.instruments;

public final class GuitarFender extends Guitars{
    public GuitarFender(String instrumentName, String instrumentType) {
        super(instrumentName, instrumentType);
    }

    @Override
    public void onlyForGuitars() {
        super.onlyForGuitars();
        System.out.println("This is particularly Fender!");
    }
}
