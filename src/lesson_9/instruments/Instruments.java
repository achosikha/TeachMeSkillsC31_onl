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

    public String sound(){
        return "";
    }

    public String speed(){
        return "";
    }

    @Override
    public String toString() {
        return "Instruments{" +
                "instrumentName='" + instrumentName + '\'' +
                ", instrumentType='" + instrumentType + '\'' +
                '}';
    }
}
