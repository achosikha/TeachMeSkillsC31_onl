package task_6;

public class NotePeople {
    // Attributes
    // Name
    // Surname
    // Address
    // Telephone number
    String name;
    String surname;
    String address;
    long telephoneNumber;

    {
        this.name = "Unknown"; // 0x3id393er.name
        this.surname = "Unknown";
        this.address = "Unknown";
    }

    NotePeople(){}

    NotePeople(String name, String surname, String address, long telephoneNumber){
        this.name = name; // 0x3id393er.name = name;
        this.surname = surname;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }

    // Verbs (methods)
    // method: get general information
    // method: get name, get surname, get address, get telephone number
    // method: set name, set surname, set address, set telephone number

    // Separate method to get name value
    // Get-s, get the value
    String name(){
        return this.name;
    }

    String surname(){
        return this.surname;
    }

    String address(){
        return this.address;
    }

    long telephoneNumber(){
        return this.telephoneNumber;
    }

    // to set new value from another object via function nameNewValue(String name)
    // Set-s set the value
    void nameNewValue(String name){
        this.name = name;
    }

    void surnameNewValue(String surname){
        this.surname = surname;
    }

    void addressNewValue(String address){
        this.address = address;
    }

    void numberNewValue(long telephoneNumber){
        this.telephoneNumber = telephoneNumber;
    }

    // void getFullInformation() with cout()
    void getFullInformationCout(){
        System.out.println("Name: " + this.name);
        System.out.println("Surname: " + this.surname);
        System.out.println("Address: " + this.address);
        System.out.println("Phone number: " + this.telephoneNumber);
    }

    String getFullInformation(){
        return "Name: " + this.name + "\n" + // "Name: " + this.name + \n
                "Surname: " + this.surname + "\n" +
                "Address: " + this.address + "\n" +
                "Telephone number: " + this.telephoneNumber;
    }
}
