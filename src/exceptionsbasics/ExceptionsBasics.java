package exceptionsbasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsBasics {
    public static void main(String[] args){
        // Logical Errors, array[0] = array[1] -> wrong result, logical

        // Compile-time errors -> syntax errors, wrong usage of the external resources
        // array[5] -> array[6] -> compiler-time error, file open -> no document

        // Run-time errors --b
        // Program works -> no resources
        getDocumentWithCatch();
    }

    public static void getDocumentWithCatch(){
        File file = new File("getDocument.txt");

        // block level exception handling
        // does not need method exception
        // not to let program to be fully corrupt - or fail
        try{
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e){
            System.out.println("Your document has not been found! -> " + e.getLocalizedMessage());
        }

        System.err.println("Will I achieve this line of the code?!");
    }

    // System.err.println()
    public static void getSystemError(String msg){
        int x = 0;

        if (x == 0) System.err.println(msg);
        System.out.println("Division by zero...");
    }

    // method level exception -> throws + exception type
    // needs exceptions to be followed by the next methods
    public static void getDocument() throws FileNotFoundException{
        // class File is used to get address of the file

        File file = new File("getDocument.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
    }

    public static void classicExamples(){
        // Unchecked
        System.out.println(0 / 10);

        System.out.println(10 / 0);
        int[] numbers = new int[]{1, 9, 10, 11};

        // unchecked exception
        for (int index = 0; index <= 5; index++){
            System.out.println(numbers[index]);
        }
    }
}
