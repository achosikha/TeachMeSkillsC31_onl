package tasks_6;

public class MyMain {
    public static void main(String[] args) {
        NotePeople archil = new NotePeople(); // address == 0x3id393er
        NotePeople yevgeny = new NotePeople(
                "Yevgeny", "Sugako", "Minsk, Belarus", 9281005L
        );
        NotePeople dima = new NotePeople();

        archil.getFullInformationCout();
        System.out.println("------------------------------------------------");
        yevgeny.getFullInformationCout();
        System.out.println("------------------------------------------------");

        // Breaking encapsulation approach
        dima.name = "Dmitry";
        dima.surname = "Yashin";
        dima.address = "Pokrovsk, Tailand";
        dima.telephoneNumber = 39682201L;
        dima.getFullInformationCout();

        System.out.println("---------------------------------------------------");
        System.out.println("Address of Dima is: " + dima.address);

        // OOP RULE!
        // One object should not change values of another object's attributes directly!
        System.out.println("What is Dima's number? It is: " + dima.telephoneNumber());
        System.out.println("What is Dima's surname? It is: " + dima.surname());

        // Change values via OOP style methods
        dima.nameNewValue("Dima");
        dima.surnameNewValue("Ivanov");
        dima.addressNewValue("Ankara, Turkey");
        dima.numberNewValue(75910430L);
        System.out.println("-------------------------------------------------------");
        System.out.println("Dima new values according to OOP style are: ");
        dima.getFullInformationCout();

        System.out.println("------------------------------------------------------");
        // Show with String return
        System.out.println(dima.getFullInformation());
        System.out.println("--------------------------------------------------------");
        System.out.println("''''''"); // Compiler
        System.out.println("\\"); // \ escape ___ compile error, \\ -> \
        System.out.println("\t\"\nWelcome\n\t\"");
    }
}
