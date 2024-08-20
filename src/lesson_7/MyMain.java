package lesson_7;

public class MyMain {
    public static void main(String[] args) {
        // OOP
        // Encapsulation - скрытие данных
        // Наследование
        // Полиморфизм

        createZoo();
    }

    public static void createZoo(){
        Animals[] zoo = new Animals[]{
                new Lions("Lion", "Yellow", "Vasya", 3, 80),
                new Lions("Lion", "Yellow", "Olga", 1, 60),
                new Tigers("Tiger", "Yelldotted", "Irina", 10, 100)
        };

        for (Animals animal : zoo){
            System.out.println(animal.getAnimalFullInformation());
            animal.sounds();
            animal.runs();
            System.out.println("-----------------------------------------");
        }

        Animals tigerGeneral = new Tigers(
                "Tiger", "Yelldotted", "Irina", 10, 98
        );
    }

    public static void createAnimal(){
        Animals lion = new Animals(
                "Lion", "Yellow", "Vasya", 3, 80
        );
        System.out.println(lion.getAnimalFullInformation());

        System.out.println("----------------------------------------------");

        // Create instance of Lion
        Animals lionOlga = new Lions(
                "Lion", "Yellow", "Olga", 1, 60
        );
        System.out.println(lionOlga.getAnimalFullInformation());
        System.out.println("-------------------------------------------------------");

        // Create instance of Tigers
        Animals tigerIrina = new Tigers(
                "Tiger", "Yellow-dotted", "Irina", 10, 100
        );
        System.out.println(tigerIrina.getAnimalFullInformation());
    }

    public static void createPC(){
        // PC Case, Motherboard, CPU i9, RAM, VGA, SSD
        MyPC i9IntelP = new MyPC(
                "x98A", "GH78A", "i9X10", "GTX1010", 1, 16
        );

        i9IntelP.getFullInformation();

        // GET & SET
        System.out.println(i9IntelP.getCaseName());
        i9IntelP.setCaseName("Case JK1");
    }
}
