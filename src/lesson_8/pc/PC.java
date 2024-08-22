package lesson_8.pc;

import lesson_8.pc.components.PCBaseboard;
import lesson_8.pc.components.PCCase;
import lesson_8.pc.components.PCRAM;

public class PC {
    private PCCase myCase;
    private PCBaseboard baseboard;
    private PCRAM ram;

    public PC(PCCase myCase, PCBaseboard baseboard, PCRAM ram) {
        this.myCase = myCase;
        this.baseboard = baseboard;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return this.myCase.toString() + "\n" +
                this.baseboard.toString() + "\n" +
                this.ram.toString();
    }
}
