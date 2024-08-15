package lesson_6;

public class Car {
    // Class attributes (method level variables)
    String companyName = "Unknown"; // attributes have default values null
    String carColor = "Unknown"; // by default null
    int maxSpeed = 60; // by default 0
    int minSpeed = 0; // by default 0

    // Every class has by default constructor
    Car(){
        // default
    }

    // User define constructor, no default
    // we can replace with keyword = this
    /*
    Car(String company, String color, int maximumSpeed, int minimumSpeed){
        companyName = company;
        carColor = color;
        maxSpeed = maximumSpeed;
        minSpeed = minimumSpeed;
    }
     */
    Car(String companyName, String carColor, int maxSpeed, int minSpeed){
        // this is reference to an object in the memory
        this.companyName = companyName; // Car opel = new Car(); - this -> opel
        this.carColor = carColor;
        this.maxSpeed = maxSpeed;
        this.minSpeed = minSpeed;
    }

    void getCarDetails(){
        System.out.println("Your cars company name is: " + this.companyName);
        System.out.println("Your cars color is: " + this.carColor);
        System.out.println("Your cars maximum speed is: " + maxSpeed);
        System.out.println("Your cars minimum speed is: " + minSpeed);
        System.out.println("Address of the class example: " + this); // address
    }
}