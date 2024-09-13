package exceptionsbasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionsBasics {
    public static void main(String[] args) throws MyPersonalException {
        // Logical Errors, array[0] = array[1] -> wrong result, logical

        // Compile-time errors -> syntax errors, wrong usage of the external resources
        // array[5] -> array[6] -> compiler-time error, file open -> no document

        // Run-time errors --b
        // Program works -> no resources
        useMuPersonalException();

        try{
            useMuPersonalException();
            System.out.println(10 / 0);
        } catch (MyPersonalException e){
            System.out.println(e.getLocalizedMessage());
        }

        System.out.println("Message...");
    }

    public static void useMuPersonalException() throws MyPersonalException{
        throw new MyPersonalException("General message");
    }

    public static void useThrow(){
        // throws -> method level
        // throw code level
        int x = 0;

        if (x == 0) throw new ArithmeticException("Your variable is 0...");
    }

    public static void tryWithResources(){
        File file = new File("document.txt");

        // try with resources will close by default the resources mentioned in the try
        try(FileInputStream fileInputStream = new FileInputStream(file)){
            // if there is a file
            if (file.exists()){
                // is a regular document that we can use
                if (file.isFile()){
                    while((fileInputStream.read()) != -1){ // -1, EOF
                        System.out.println(fileInputStream.read());
                    }
                }
            }
        } catch (FileNotFoundException e){
            System.out.println("Your file has not been found: " + e.getLocalizedMessage());
        } catch (IOException e){
            System.out.println("You have IOException: " + e.getLocalizedMessage());
        } finally { // no need to use finally to close the resources
            getFinalizedMethod();
        }
    }

    public static void closeResourcesViaFinally() throws IOException {
        File file = new File("getDocument.txt");

        // allocate resource and memory
        // document, I open it and to free the resource I need to close
        FileInputStream fileInputStream = null;

        try{
            // does not matter if we manage to read or not
            // we must close the resource and close the document
            fileInputStream = new FileInputStream(file);
        } catch(FileNotFoundException | SecurityException e){
            System.out.println("Your file has not been found or there are security threats: " +
                    e.getLocalizedMessage());
        } catch (Exception e){
            System.out.println("General exception: " + e.getLocalizedMessage());
        }finally {
            fileInputStream.close();
        }
    }

    public static void getScanner(){
        // In theory we should also close the Scanner
        // because the program is small and it is in the method
        // it will be freed by JVM
        Scanner scanner = new Scanner(System.in);

        int getIntegerValue = scanner.nextInt();

        scanner.close();
    }

    public static void tryCatchFinally(){
        try{
            int counter = 2;
            int objectCounter = 10;

            System.out.println(objectCounter / counter);
        } catch(ArithmeticException e){
            System.out.println("You have arithmetic exception: " + e.getLocalizedMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Your array gone wild..." + e.getLocalizedMessage());
        } catch (Exception e){
            System.out.println("The general one: " + e.getLocalizedMessage());
        }finally {
            System.out.println(
                    "The exception was handled because your counter value is ZERO. Check your formula..."
            );

            System.out.println("Additional information...");
            getFinalizedMethod();
        }
    }

    // finalize method() to finish some staff
    public static void getFinalizedMethod(){
        // code to finalize some process
    }

    // broken hierarchy in exception list
    public static void checkBrokenHierarchy(){
        File file = new File("document.txt");
        try{
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e){
            System.out.println(e.getLocalizedMessage());
        } catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        } /* catch (SecurityException e){

        } */
    }

    public static void shortenedTryCatch(){
        File file = new File("document.txt");

        try{
            int[] numbers = new int[]{10, 9, -1, 100};

            System.out.println(10 / 0);

            for (int index = 0; index < 10; index++){
                System.out.println(numbers[index]);
            }
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("Your array has gone beyond your index or you tried to divide by zero: "
                    + e.getLocalizedMessage());
        } catch (FileNotFoundException | SecurityException e){
            System.out.println("File mentioned by you has not been found or Security issues are on the ground...: "
                    + e.getLocalizedMessage());
        } catch (RuntimeException e){
            System.out.println("This will cover all RuntimeExceptions: " + e.getLocalizedMessage());
        } catch (Exception e){
            System.out.println(
                    "This is general Exception that will catch all possible mistakes: " + e.getLocalizedMessage());
        }

        System.out.println("Exception has been made but the program still works!");
    }

    public static void useJustException(){
        File file = new File("document.txt");

        try{
            int[] numbers = new int[]{10, 9, -1, 100};

            System.out.println(10 / 0);

            for (int index = 0; index < 10; index++){
                System.out.println(numbers[index]);
            }

            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (Exception e){
            System.out.println(
                    "This is general Exception that will catch all possible mistakes: " + e.getLocalizedMessage());
        }

        System.out.println("Exception has been made but the program still works!");
    }

    public static void getExceptionBasic(){
        File file = new File("document.txt");

        try{
            int[] numbers = new int[]{10, 9, -1, 100};

            System.out.println(10 / 0);

            for (int index = 0; index < 10; index++){
                System.out.println(numbers[index]);
            }
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Your array has gone beyond your index: " + e.getLocalizedMessage());
        } catch (ArithmeticException e){
            System.out.println("You have illegal argument in your code: " + e.getLocalizedMessage());
        } catch (FileNotFoundException e){
            System.out.println("File mentioned by you has not been found: " + e.getLocalizedMessage());
        } catch (SecurityException e){
            System.out.println("You have problems with the security exception: " + e.getLocalizedMessage());
        } catch (RuntimeException e){
            System.out.println("This will cover all RuntimeExceptions: " + e.getLocalizedMessage());
        } catch (Exception e){
            System.out.println(
                    "This is general Exception that will catch all possible mistakes: " + e.getLocalizedMessage());
        }

        System.out.println("Exception has been made but the program still works!");
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
