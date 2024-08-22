package lesson_8.keywordfinal;

public class KeywordFinal {
    // static belongs to the Class
    final private String name;
    final private String surname;

    // Will be done earlier then the constructor
    {
        this.surname = "Unknown";
    }

    public KeywordFinal(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Car mercedes = new Car("Mercedes");
        Car mercedes1 = new Car("Mercedes1");

        System.out.println(mercedes.getCounter());
        System.out.println(Car.getCounterStatic());
    }

    public static void getNumber(){
        // keyword final
        // final as const
        int number = 10;
        char letter = 'a';

        System.out.println("Number: " + number);
        System.out.println("Letter: " + letter);

        number = 11;
        letter = 'R';

        System.out.println("Number: " + number);
        System.out.println("Letter: " + letter);

        // final for data types means no change in the value
        final double PI = 3.1415;
        System.out.println("PI number: " + PI);
        final String name = "Archil"; // String cannot be too
    }
}
