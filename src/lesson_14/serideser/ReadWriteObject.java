package lesson_14.serideser;

import java.io.*;

public class ReadWriteObject {
    public static void main(String[] args) throws IOException {
        Person archil = new Person("Archil", 35, "Just staff");

        System.out.println(archil);

        serializeObject(archil);

        System.out.println("-------------------------------------");

        Person archil2 = (Person) deserializeObject();
        System.out.println(archil2);

        // When you have deserialization -> do not change class structure
        // if you want to avoid some attributes included use key transient
    }

    public static void serializeObject(Person p) throws IOException {
        File file = new File("src/lesson_14/serideser/person.txt");
        ObjectOutputStream writeObject = new ObjectOutputStream(new FileOutputStream(file));
        writeObject.writeObject(p);
    }

    public static Object deserializeObject() throws IOException {
        File file = new File("src/lesson_14/serideser/person.txt");
        ObjectInputStream writeObject = new ObjectInputStream(new FileInputStream(file));

        // Object with Person data
        return writeObject.read(); // Object Archil
    }
}
