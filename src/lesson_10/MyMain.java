package lesson_10;

// Super Class Object

public class MyMain {
    public static void main(String[] args) {
        // System.gc(); // just recommendation
        Human tioma = new Human("Tiona", 25, new String[]{"Archil"});
        System.out.println(tioma.getClass());

        // Due to strict types rarely we use instanceof
        // Checks if tioma is an instanceof Human
        System.out.println(tioma instanceof Human);

        // every class in an instanceof Object
        System.out.println(tioma instanceof Object);
        System.out.println(tioma.hashCode());
    }

    // Destructor
    /*
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
     */

    @Override
    public String toString() {
        return super.toString();
    }

    // wait(), notify(), notifyAll() - Threads, multi-threading
    // Multi-processing - OS level multiple programs running and working
    // Program level - ability to work in a few different micro-systems simoultaniously
}
