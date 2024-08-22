package lesson_8.pc;

import lesson_8.pc.components.PCBaseboard;
import lesson_8.pc.components.PCCase;
import lesson_8.pc.components.PCRAM;

public class MainPC {
    public static void main(String[] args) {
        // Let's create a PC
        createPC();
    }

    public static void createPC(){
        PC myPersonalComputer = new PC(
                new PCCase("GX29", 100, "Mixed"),
                new PCBaseboard("BaseBoard GH1", 14),
                new PCRAM("DDR5", 32)
        );

        System.out.println(myPersonalComputer);
    }
}
