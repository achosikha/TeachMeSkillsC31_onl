package lesson_12;

import java.util.Formatter;

public class StringsAdditional {
    public static void main(String[] args) {
        makeBasicStringBuilder();
    }

    public static void makeBasicStringBuilder(){
        // StringBuilder
        // StringBuffer -> before SE5 the most popular

        // String -> immutable, not thread safe, not synchronized, fast
        // Golden middle -> StringBuilder -> mutable, not thread safe, not synchronized, fast
        // StringBuffer -> mutable, thread safe, synchronized, low
        String archil = "Archil";
        // to change use method, + -> concat +, -, =
        // перегрузка бинарных операторов из С++, в Джаве +, =

        StringBuffer buffer = new StringBuffer("Archil");
        StringBuilder builder = new StringBuilder("Archil");

        String valueOfCounter = String.valueOf(1);

        // If we in a loop work with String modify we always create new object
        // If you need to work with Strings in a loop and modify always go for StringBuilder
        for (int counter = 1; counter < 5; counter++){
            valueOfCounter += String.valueOf(counter); // creates new object of String
        }

        // StringBuilder - toString() -> явное указание приведение к строчке
        // Особенно в циклах
        System.out.println(builder.toString());

        // tenet
        builder.reverse();
        System.out.println(builder);

        StringBuilder tenet = new StringBuilder("tenet");
        System.out.println(tenet);
        System.out.println(tenet.reverse());
    }

    public static void formattedBasics(){
        // System.out
        // printf()
        // format()
        // format style

        // %[argument][width][.precision]type
        String profession = "a Java lecturer...";
        System.out.printf("Archil Sikharulidze is %d years old...\n", 35);
        System.out.printf("Archil Sikharulidze is %s.\n", profession);

        System.out.printf("%d %s %f.\n", 35, "Archil", 134F);

        // boolean -> 0 (false), 0 != true
        // must be careful with BOOLEAN
        System.out.printf("%d %c %f %b.\n", 34, 'c', 34F, 0);

        // %20 - from right to left
        // %-20 - from left to right
        // . precision how many symbols to show
        System.out.printf("%20.10s.\n", "Archil Sikharulidze");
        System.out.printf("%.3f.\n", 145.56734F);
        System.out.printf("%.10s.\n", "Java Development is cool...");
        System.out.println("Archil Sikharulidze" + " is a Java Lecturer...");

        // All formatted staff was actually added in SE5
        System.out.format("%d.\n", 134);

        String formattedString = String.format("This is %c and %b", 'A', false);
        System.out.println(String.format("%s details\n", "These are details."));
        System.out.println(formattedString);

        Formatter formattedText = new Formatter(System.out);

        // PrintStream -> formatted
        System.out.println(formattedText.format("%d", 145));
    }

    public static void basicStringMethods(){
        String name = "Archil";
        char[] charLements = name.toCharArray();
        char[] permanentValue = "Katya".toCharArray();

        for (char el : "TeachMeSkills welcome to Java Development...".toCharArray()){
            System.out.print(el + " ");
        }

        System.out.println();
        String text = "General";
        System.out.println(text.charAt(0));

        String clearEmptySpaces = "  Text   Archil Space   ";
        System.out.println(clearEmptySpaces.trim());

        // string methods do not change original values
        // they are echo methods - the return new values
        String trimmedString = clearEmptySpaces.trim();
        System.out.println(trimmedString);

        clearEmptySpaces = clearEmptySpaces.trim();
        System.out.println(clearEmptySpaces);

        // toCharArray()
        // trim()

        String value = "NUMn";

        // equals by default is case sensitive
        System.out.println(value.equals("Numn"));
        System.out.println(value.equalsIgnoreCase("Numn"));
        // equalsIgnoreCase()

        // toLowerCase()
        // toUpperCase()
        System.out.println("archil sikharulidze".toUpperCase());
        System.out.println("EVGENY GRISHKO".toLowerCase());

        // valueOf()
        String numberValueOfInteger = 15 + "";

        double doubleValue = 245.41;
        numberValueOfInteger = String.valueOf(doubleValue);
        System.out.println(numberValueOfInteger);

        // boolean in Java is boolean, 0 == false, 0 != true in Java is incorrect
        numberValueOfInteger = String.valueOf(true);
        System.out.println(numberValueOfInteger);
    }
}
