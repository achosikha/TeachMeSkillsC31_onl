package lesson_3;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        // Method call
        getArraysClass();
    }

    public static void getArraysClass(){
        char[] letters = new char[]{'A', 'r', 'c', 'h', 'i', 'l'};

        // My class Arrays, by default Arrays
        // Name conflict, cannot access integrated class Arrays
        // Shows my my own class Arrays
        String getCharArray = Arrays.toString(letters);
        String getAnotherArray = letters.toString(); // address
        System.out.println("From char array to String: " + getCharArray);
        System.out.println(getAnotherArray);

        int[] numbers = new int[]{9, 1, 10, -1, 100};
        Arrays.sort(numbers);

        for (int el: numbers){
            System.out.println(el);
        }

        System.out.println("----------------------------------------------------");
        int result = Arrays.binarySearch(numbers, 10);
        System.out.println(result); // index of the key value
        // !!! binarySearch can be done only if the array is sorted!!!

        // copy array
        int[] arrayOne = new int[]{1, 2, 3, 4, 5};
        int[] arrayTwo = new int[5];

        for (int index = 0; index < arrayOne.length; index++){
            arrayTwo[index] = arrayOne[index];
        }

        System.out.println("-----------------------------------------------------");
        // System.arraycopy();
        int[] arrayThree = new int[10];
        // int - 4 byte
        // 10 el * 4 = 40 byte
        // String name = "Archil" -> char 1 byte, 5 char * 1 char = 5 byte
        // 1 - откуда, 2 - с какой позиции, 3 - куда, 4 - с какой позиции куда, и сколько элементов
        System.arraycopy(arrayTwo, 0, arrayThree, 4, 5);

        for(int el : arrayThree){
            System.out.println(el);
        }
    }

    public static void forEachLoop(){
        char[] englishAlphabet = new char[26];
        for (int index = 0, letter = 97; index < englishAlphabet.length; index++, letter++){
            englishAlphabet[index] = (char) letter; // letter int -> char also int, narrowing - direct casting
        }

        // for-each loop
        // only to read
        // to direct access to values and indexes
        for(char el : englishAlphabet){
            System.out.println("Element: " + el);
        }

        System.out.println("---------------------------------------------");
        int letter = 65;
        // attempt to change values
        // instead of an array I gave values to temporary char el
        for(char el : englishAlphabet){
            el = (char) letter;
            letter++;
            System.out.println("New values: " + el);
        }

        System.out.println("-----------------------------------------------");
        for(char el : englishAlphabet){
            System.out.println("Element: " + el);
        }
    }

    public static void getEnglishAlphabet(){
        char[] englishAlphabet = new char[26];

        // array length 26, index = 0
        // index < length
        // initialized array with English language letter, lower case
        for (int index = 0, letter = 97; index < englishAlphabet.length; index++, letter++){
            englishAlphabet[index] = (char) letter; // letter int -> char also int, narrowing - direct casting
        }

        System.out.println("English language alphabet. Array index[1]: " + englishAlphabet[1]);

        for (int index = 0; index < englishAlphabet.length; index++){
            System.out.println("englishAlphabet[" + (index + 1) + "]: " + englishAlphabet[index]);
        }

        System.out.println("---------------------------------------------------");

        // while
        int index = 0;

        while(index < englishAlphabet.length){
            System.out.println("englishAlphabet[" + (index + 1) + "]: " + englishAlphabet[index]);
            index++;
        }
    }

    public static void getOneDimensionalArray(){
        // Arrays
        // Массив в java - это конечное именованное множество переменных одного типа.
        // C - no String, array of chars == String
        // C++ String = array of chars
        // Java - array group of the same type elements
        // Java array type int - -1, 100, 0, 1945 < INT_MAX
        // Java array length -> how many elements in an array
        // Java array length is permanent, cannot array be resized
        // Java array is necessary to keep basic data and make basic operations
        // Java and to save memory
        // Java style declaration
        int[] randomNumbers; // declaration of a one dimensional array, cannot be used, no memory allocate
        randomNumbers = new int[10]; // allocate memory for ten elements, can be used

        // In Java class (object) level is by default initialized
        // In case with int - 0, byte - 0, short - 0, long 0
        // float, double - 0.0
        System.out.println(randomNumbers[5]);

        // Primitive types are not by default initialized
        // In Java you must initialize
        // int random;
        // System.out.println(random); -> compile-time error

        // String array = null, nothing
        String[] words;
        words = new String[5]; // index - 0, 1, 2, 3, 4
        System.out.println(words[1]);

        // To access elements we need indexes
        // The first index equals == 0 (5 elements, element 1 = index 0
        // The last length - 1 (5 elements, 5 - 1, index 4)
        System.out.println("words[0] " + words[0]);
        System.out.println("words[1] " + words[1]);
        System.out.println("words[2] " + words[2]);
        System.out.println("words[3] " + words[3]);
        System.out.println("words[4] " + words[4]);

        // ArrayIndexOutOfBoundsException -> error
        // System.out.println("words[5] " + words[5]); // no grammar mistake

        // C/C++ and other C-type languages array declaration
        int numbers[] = new int[4]; // can be but please do not use
        numbers[0] = 10;
        numbers[1] = -19;
        numbers[2] = 29;
        numbers[3] = -99;

        System.out.println("numbers[3]: " + numbers[3]);

        System.out.println("numbers[2] > numbers[3]: " + (numbers[2] > numbers[3]));

        System.out.println("-------------------------------------------------------");

        // When you set by default your values initially you cant set array size directly
        String[] namesStudents = new String[]{"Dashulya", "Katya", "Denis", "Anton", "Katya"}; // new String[5]
        System.out.println("nameStudents[0]: " + namesStudents[0]);
        System.out.println("nameStudents[0]: " + namesStudents[4]);
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
