package task_10;

public class MyMain {
    public static void main(String[] args) {
        // Constructor delegate
        // Clone()
        // Constructor copy
        Object instruments = new Instruments("Guitar", "Regular", new String[]{"No new details"});
        Object instrumentsOne = new Instruments("Guitar", "Regular", new String[]{"No new details"});

        Instruments guitarOne = new Instruments("GuitarFX", "Fender", new String[]{"Black", "Damaged"});

        // Copy constructor
        Instruments guitarCopyConstructor = new Instruments(guitarOne);

        // instanceof - checks from which class it derives, never use on a regular basis
        // sizeof -> size of the variable, primitive are the same size on all machines
        System.out.println(instruments);
        System.out.println("Your hasChode is: " + instruments.hashCode());
        System.out.println("Are two objects equal: " + instruments.equals(instrumentsOne));
        System.out.println("-------------------------------------------");
        System.out.println(guitarCopyConstructor);
        guitarOne.setName("GuitarOne");
        System.out.println("---------------------------------------------------");
        System.out.println(guitarOne);
        System.out.println(guitarCopyConstructor);

        Instruments guitarWithTwoParameters = new Instruments("Guitar", "Just");

        System.out.println("------------------------------------------------");
        Instruments cloneGuitar = guitarWithTwoParameters.clone();
        System.out.println(cloneGuitar);
    }
}
