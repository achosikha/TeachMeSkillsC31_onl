package lesson_9_interfaces;

public class MainInterfaces {
    public static void main(String[] args) {
        // Multiple-inheritance not supported
        // Java only one inherited class

        /*
        Final abstraction for the class
         - Attributes
         - Basic constructor
         - Abstract methods
         - Basic method realization for everyone
         */

        // Move to a full abstraction
        // We apply: INTERFACE

        // Classical interface
        // Only abstraction
        // No Constructors
        // No attributes
        // No body realization
        Instruments guitar = new Guitar();
        System.out.println(guitar.sound());
        System.out.println(guitar.speed());

        Instruments piano = new PianoXG();
        System.out.println(piano.sound());
        System.out.println(piano.speed());

        System.out.println("----------------------------------");
        System.out.println(guitar.message("This is a GUITAR!"));
        System.out.println(piano.message("This is a PIANO!"));

        Guitar guitarAlone = new Guitar();
        System.out.println("Can we play on this guitar? " + guitarAlone.isPlayable());
    }
}
