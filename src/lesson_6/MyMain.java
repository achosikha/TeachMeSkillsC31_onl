package lesson_6;

public class MyMain {
    public static void main(String[] args) {
        // Class Car
        // To create concrete car we need to use keyword new
        // Экземпляр класса
        Car bmw = new Car(); // на основе общего чертежа Машина (класс), есть определенная модель bmw, default constructor

        bmw.getCarDetails();
        System.out.println("Your bmw maxSpeed is: " + bmw.maxSpeed);

        bmw.companyName = "BMW";
        bmw.carColor = "Yellow";
        bmw.maxSpeed = 320;
        bmw.minSpeed = 60;
        System.out.println("--------------------------------------------");
        bmw.getCarDetails();

        // Создать экземпляр класса со свойми автоматическими данными
        System.out.println("---------------------------------------------");
        Car mercedes = new Car();
        mercedes.getCarDetails();

        System.out.println("------------------------------------------------");
        Car opel = new Car("Opel", "Black", 160, 40);
        opel.getCarDetails();
    }
}
