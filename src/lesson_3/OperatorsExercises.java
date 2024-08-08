package lesson_3;

import java.util.Random;
import java.util.Scanner;

public class OperatorsExercises {
    public static void main(String[] args) {
        // Method call
        getRandomNumbersTemporary();
    }

    public static void getRandomNumbersTemporary(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter minimum number >= 0: ");
        int minNumber = input.nextInt();
        System.out.print("Please enter maximum number > 0: ");
        int maxNumber = input.nextInt();

        for (int counter = 1, counterSize = 5; counter < counterSize; counter++){
            System.out.println("Your random number between " + minNumber +
                                " and " + maxNumber + ": " + new Random().nextInt(minNumber, maxNumber));
        }
    }

    public static void getRandomNumbers(){
        // Random from 1 to 10
        // Math.random() -> 0.1 to 0.9
        // Math.random() * max
        // Math.random()
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter minimum number >= 0: ");
        int minNumber = input.nextInt();
        System.out.print("Please enter maximum number > 0: ");
        int maxNumber = input.nextInt();

        // Class random to avoid Math.random()
        Random random = new Random();

        for (int counter = 1, randomInteger, counterSize = 5; counter < counterSize; counter++){
            randomInteger = random.nextInt(minNumber, maxNumber); // min included, max excluded
            System.out.println("Your random number between " + minNumber +
                                " and " + maxNumber + ": " + randomInteger);
        }

        System.out.println("---------------------------------------------------------------------");
        for (int counter = 1, counterSize = 5; counter < counterSize; counter++){
            System.out.println("Your random number between " + minNumber +
                    " and " + maxNumber + ": " + random.nextInt(minNumber, maxNumber));
        }
    }
}
