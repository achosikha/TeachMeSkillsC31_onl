package lesson_8.pc.components;

public class PCBaseboard {
    private String baseboard;
    private int slotNumbers;

    public PCBaseboard(String baseboard, int slotNumbers){
        this.baseboard = baseboard;
        this.slotNumbers = slotNumbers;
    }

    @Override
    public String toString() {
        return "Baseboard: \n" +
                "baseboard='" + baseboard + '\'' +
                ", slotNumbers=" + slotNumbers + '\'';
    }
}
