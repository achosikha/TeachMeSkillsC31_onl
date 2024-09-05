package lesson_12;

import java.text.Format;
import java.util.Formatter;

public class StringsAdditional {
    public static void main(String[] args) {
        formattedBasics();
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
