package lesson_9.instruments;

// abstract
// class & methods
public abstract class Instruments {
    private final String instrumentName;
    private final String instrumentType;

    public Instruments(String instrumentName, String instrumentType){
        this.instrumentName = instrumentName;
        this.instrumentType = instrumentType;
    }

    // Abstract method has no body just signature
    public abstract String sound();
    public abstract String speed();
    public abstract void getAdditionalData(String[] data);

    @Override
    public String toString() {
        return "Instruments{" +
                "instrumentName='" + instrumentName + '\'' +
                ", instrumentType='" + instrumentType + '\'' +
                '}';
    }
}
