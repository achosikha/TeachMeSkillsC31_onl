package lesson_9;

import lesson_9.instruments.*;

public class MainAgenda {
    public static void main(String[] args) {
        // Abstract classes
        // Abstract class cannot create instance of itself
        // Instruments instrument = new Instruments("General", "General"); -> ERROR
        Instruments[] instruments = new Instruments[]{
                new Piano("Veronica", "Piano"),
                new Duduk("Giorg", "Duduk"),
                new GuitarFender("Johnny", "Guitar Fender"),
        };

        // getInstruments(instruments);

        GuitarFender fenderGuitar = new GuitarFender("Jack", "Fender");
        fenderGuitar.onlyForGuitars();

        // Abstract methods

        // Interfaces
        // Interface as enum
        // Implementation vs. Realization
        // Interface as a multi-inheritance
        // Naming clashes
        // Marker interface
        // Function interface

        // Overload late-binding
    }

    // Instruments[] instruments
    public static void getInstruments(Instruments... instruments){
        for(Instruments instrument : instruments){
            System.out.println(instrument);
        }
    }
}
