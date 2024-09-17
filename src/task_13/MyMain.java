package task_13;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        // Java 8, Java 1.8
        String empty = "";
        String nullValue = null;

        System.out.println(nullValue);

        // N.B.
        // if String can be null we must be careful with isEmpty()
        // assert variable != null; -> protects us from the null check
        // if ()...

        try{
            System.out.print("Please enter a string message that is maximum of 20 characters, " +
                    "minimum of two and is not empty: ");
            throwStringCheckException(new Scanner(System.in).nextLine());
        } catch (StringCheckException e){
            System.out.println(e.getLocalizedMessage());
        }
    }

    public static void throwStringCheckException(String str) throws StringCheckException{
        // if (str == null | str.isEmpty()) -> exception, cannot invoke isEmpty because there is no str, no address
        if (str.isEmpty()){
            throw new StringCheckException("Your string is simply empty...");
        } else if (str.length() > 20){
            throw new StringCheckException("Your string has achieved maximum size. You must fit 20 letters.");
        } else if (str.length() < 2){
            throw new StringCheckException("Your string is lesser then the minimum length required. " +
                    "You must have at least 2 letters.");
        }
    }
}
