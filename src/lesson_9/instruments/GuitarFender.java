package lesson_9.instruments;

public final class GuitarFender extends Guitars{
    public GuitarFender(String instrumentName, String instrumentType) {
        super(instrumentName, instrumentType);
    }

    @Override
    public String sound() {
        return "";
    }

    @Override
    public String speed() {
        return "";
    }

    @Override
    public void getAdditionalData(String[] data) {
        for (String el : data){
            System.out.println(el);
        }
    }

    @Override
    public void onlyForGuitars() {
        super.onlyForGuitars();
        System.out.println("This is particularly Fender!");
    }
}
