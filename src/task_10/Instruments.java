package task_10;

import java.util.Arrays;
import java.util.Random;

// Comparator
// Comparable
public class Instruments implements Cloneable {
    private String name;
    private final String surname;
    private final String[] additional;

    public Instruments(String name, String surname, String[] additional) {
        this.name = name;
        this.surname = surname;
        this.additional = additional;
    }

    // Constructor delegate
    public Instruments(String name, String surname){
        // call my main constructor
        this(name, surname, new String[]{});
    }

    // Copy constructor
    public Instruments(Instruments temp){
        this.name = temp.name;
        this.surname = temp.surname;

        // Array content (deep copy) can make shallow
        // Set array but copy array
        // temp.additional -> address (stack) -> stack address points to heap value
        // first element of the array -> this.additional[0]
        // this.additional = temp.additional;
        this.additional = Arrays.copyOf(temp.additional, temp.additional.length);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Instruments temp = (Instruments) obj;

        // return this.name.equals(temp.name) && this.surname.equals(temp.surname);
        return this.name.equals(((Instruments) obj).name) && this.surname.equals(((Instruments) obj).surname);
    }

    @Override
    public String toString() {
        return "Instruments{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", additional=" + Arrays.toString(additional) +
                '}';
    }

    // integer (-)
    @Override
    public int hashCode() {
        // Random() -> times in milliseconds on your PC
        // add time additionally
        // Add library math formulas -> more complex pseudo-random numbers
        return new Random().nextInt(1, Integer.MAX_VALUE);
    }

    @Override
    public Instruments clone() {
        try {
            // Use clone() method from super class Object
            // Create fully independent object
            // and cast it to Instruments
            // Cast from Super to Particular because Instruments is a part of the Object
            Instruments clone = (Instruments) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
