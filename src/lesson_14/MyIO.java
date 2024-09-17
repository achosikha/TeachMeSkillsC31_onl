package lesson_14;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Fully buffered input -> documents, waits for the special marker EOF - end of file
 * Partially buffered input -> everything that expects special symbol '\n' - next line (console input)
 * Non-buffered input -> avoid keeping data and goes directly to the source (games)
 */
public class MyIO {
    public static void main(String[] args) {
        // I/O
        // Byte-reading (binary system)
        // Symbol (text-stream system)

        // InputStream
        // OutputStream
        // FileInputStream -> to read
        // FileOutputStream -> to write

        // Reader
        // Writer
        // FileReader -> to read
        // FileWriter -> to write

        // To work with files and directories we have main class FILE
    }

    public static void generalInformationOnInput() throws IOException{
        // Полубуфферизированный ввод
        System.out.print("Please enter a single value: ");
        int val = System.in.read();
        System.out.println("You have entered a value: " + (char) val);

        // Buffer -> text + enter = text + '\n'
        new Scanner(System.in).nextLine();

        System.out.print("Please enter your value: ");
        // Полубуфферизированный ввод
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(str);
        scanner.close();
    }
}
