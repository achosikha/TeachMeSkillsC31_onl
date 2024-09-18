package lesson_15.files;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileAdditional {
    public static void main(String[] args) {
        //
        getListAndCheck();
    }

    public static void createFile(){
        File file = new File("src/lesson_15/createDocument.txt");

        // File fileAgain = new File("text.txt", "doc.txt");

        try {
            if (file.createNewFile()){
                System.out.println("File has been created...");
            }

            if (file.exists()){
                if (file.canWrite()){
                    System.out.println("Write some content...");
                }
            }
        } catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }

    public static void getListAndCheck(){
        File file = new File(".");
        String[] list = file.list();

        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);

        for (String element : list){
            System.out.println(element);
        }

        if (new File(list[0]).isFile()){
            System.out.println("This is not a file...");
        } else {
            System.out.println("This is probably directory...");
        }

        System.out.println("--------------------------------------------");
        for (String element : list){
            if (new File(element).isFile()){
                System.out.println(element + " is a file...");

            } else if (new File(element).isDirectory()){
                System.out.println(element + " is a directory...");
            } else {
                System.out.println(element + " is something else...");
            }
            System.out.println("******");
        }
    }
}
