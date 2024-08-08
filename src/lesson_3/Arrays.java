package lesson_3;

import java.sql.SQLOutput;

public class Arrays {
    public static void main(String[] args) {
        // Method call
        getMathClassFunctions();
    }

    public static void getOneDimensionalArray(){
        // Arrays
    }

    public static void getMathClassFunctions(){
        // Class Math
        // Math
        // ** sometimes means exponantion
        double pow = Math.pow(2, 8);
        System.out.println("Variable pow 2 ** 8: " + pow);

        int maxNumber = 10;
        int minNumber = 11;

        System.out.println((maxNumber > minNumber));
        System.out.println(Math.max(maxNumber, minNumber));

        for (int counter = 1; counter < 10; counter++){
            System.out.println((int) (0 + Math.random() * 10));
        }
    }

    public static void getSwitchLambda(){
        // Using switch with Lambda
        char letter = 'a';

        switch (letter){
            case 'a':
                System.out.println("It is 'a'");
                break;
            case 'b':
                System.out.println("It is 'b'");
                break;
            case 'c':
                System.out.println("It is 'c'");
                break;
            case 'd':
                System.out.println("It is 'd'");
                break;
            default:
                System.out.println("There is no such letter!");
        }

        System.out.println("---------------------------------------------");
        // ->
        switch (letter){
            case 'a' -> System.out.println("'a'");
            case 'b' -> System.out.println("'b'");
            case 'c' -> System.out.println("'c'");
            case 'd' -> System.out.println("'d'");
        }

        System.out.println("-----------------------------------------------");
        String days = "Monday";

        switch (days){
            // if (days.equal("Monday") || days.equal("Tuesday")...
            case "Monday":
            case "Tuesday":
            case "Thursday":
                System.out.println("If you have Monday, Tuesday or Thursday - you got the message...");
                break;
        }

        switch (days){
            case "Wendesday", "Friday", "Saturday" -> System.out.println("You have chosen Wen, Fri, Sat");
            case "Sunday" -> System.out.println("You have chosen Sunday...");
        }
    }

    public static void getScope(){
        // till the end of the method
        int methodLevelVariable = 10;

        {
            // Block level works only in this block
            int blockLevelVar = 11;
            System.out.println("Method level variable equals: " + methodLevelVariable);
            System.out.println("Block level variable equals: " + blockLevelVar);
        }

        System.out.println("Method level variable equals: " + methodLevelVariable);
        // System.out.println("Block level variable equals: " + blockLevelVar); -> does not exist

        // Counter is loop scope
        for (int counter = 1; counter < 11; counter++){
            System.out.println("Counter equals: " + counter);
        }

        // Java three levels of variables
        // Attribute class
        // Method variable
        // Scope variable
        // Global variable does not exist
        // Java variables with the same name cannot exist, does not matter if it is class or other level
    }
}
