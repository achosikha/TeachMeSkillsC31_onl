package lesson_11;

import java.util.Arrays;
import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
        // split -> cuts one part of the String from another basing on 'marker'
        String expression = "54/2";

        String[] splitExpression = expression.split("/");
        System.out.print("Please enter *, +, /, -, %: ");

        // String ...... -> [0]
        // Get only one letter
        // string.length > 1
        // if (string.length > 1) -> you have entered more values the needed
        char task = new Scanner(System.in).nextLine().charAt(0);

        switch(task){
            case '/' ->
                    System.out.println(Double.parseDouble(splitExpression[0]) / Double.parseDouble(splitExpression[1]));
            case '*' ->
                    System.out.println(Double.parseDouble(splitExpression[0]) * Double.parseDouble(splitExpression[1]));
            case '+' ->
                    System.out.println(Double.parseDouble(splitExpression[0]) + Double.parseDouble(splitExpression[1]));
            case '-' ->
                    System.out.println(Double.parseDouble(splitExpression[0]) - Double.parseDouble(splitExpression[1]));
            default -> System.out.println("You should never come here!");
        }

        System.out.println(Arrays.deepToString(splitExpression));
    }

    public static void stringsBasic(){
        // String - class
        String archil = "Archil";

        // never create String with new
        // unless there is demand to create separate space in the heap
        String katya = new String("Katya"); // creates String beyond String pool
        String katya2 = "Katya"; // katya2 == katya3
        String katya3 = "Katya"; // katya3 == katya2

        String mixedStrings = archil + " is a teacher of " + katya;

        // String optimization
        // String heap separate place called String Pool
        // String Pool is a space where all Strings are stored unless new keyword used

        System.out.println(mixedStrings);

        // String is IMMUTABLE
        // Каждый раз, когда вы меняете значение текста, вы создаете новый объект
        String str = "STR";
        str = "STR1";
        String concatStr = "concat";
        String concatenatedString = str.concat(concatStr);
        System.out.println(concatenatedString);
        String fullName = "Archil Sikharulidze";

        StringBuilder complexText = new StringBuilder(fullName);
        complexText.append('R');
        complexText.insert(0, 'B');
        System.out.println(complexText);
        complexText.reverse();
        System.out.println(complexText);
        complexText.replace(0, 3, "Arc");
        System.out.println(complexText);
    }
}
