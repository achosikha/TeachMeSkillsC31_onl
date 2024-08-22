package lesson_8.task;

public class HomeWorkComments {
    public static void main(String[] args) {
        Animals crocodile = new Animals("Crocodile", "Gena", 3, 150);
        System.out.println(crocodile.getFullInformation());
        System.out.println("-----------------------------------------");
        System.out.println(crocodile.toString());
        System.out.println("------------------------------------------");
        System.out.println(crocodile);
        System.out.println("------------------------------------------");
        crocodile.jump();

        Animals[] zooAnimals = new Animals[]{
                new Crocodile("Crocodile", "Gena", 5, 120),
                new Coala("Coala", "Luke", 1, 40),
                new Cangooru("Cangooru", "John", 5, 200)
        };

        for (Animals animal : zooAnimals){
            System.out.println(animal);
            System.out.println("-------------------------------------");
        }

        System.out.println("-----------------------------------------");
        System.out.println(zooAnimals[0]);

        System.out.println("-----------------------------------------");
        System.out.print(zooAnimals[0].getAnimalType() + ": ");
        zooAnimals[0].jump();
        System.out.print(zooAnimals[0].getAnimalType() + ": ");
        zooAnimals[0].run();
        System.out.print(zooAnimals[1].getAnimalType() + ": ");
        zooAnimals[1].jump();
        System.out.print(zooAnimals[1].getAnimalType() + ": ");
        zooAnimals[1].run();

        System.out.println("--------------------------------------------");
        System.out.println("Please give me a hidden information about animals:");

        Crocodile crocodileWithHiddenData = new Crocodile(
                "Crocodile", "HiddenGena", 10, 120
        );
       crocodileWithHiddenData.getHiddenInformation();
        Coala coalaHidden = new Coala(
                "Coala", "Tatyana", 2, 45
        );
        coalaHidden.getHiddenInformation();
    }
}
/*
class SecondClass{
    public static void main(String[] args) {

    }
}

public class HomeWorkComments {
    private String name;
    public static void main(String[] args) {
        // One .java per Class
        // Class names
        // Abbreviations -=, +=
        // Separate Classes
        long accountNumber = 13213213L;
        long addToAccount = 12L;

        accountNumber += addToAccount;
        // this.name
    }
}

class ThirdClass{
    public static void main(String[] args) {

    }
}
 */