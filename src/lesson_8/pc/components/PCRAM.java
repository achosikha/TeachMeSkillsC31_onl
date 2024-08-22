package lesson_8.pc.components;

public class PCRAM {
    private String ram;
    private int ramSize;

    public PCRAM(String ram, int ramSize){
        this.ram = ram;
        this.ramSize = ramSize;
    }

    @Override
    public String toString() {
        return "RAM: \n" +
                "ram='" + ram + '\'' +
                ", ramSize=" + ramSize + '\'';
    }
}
