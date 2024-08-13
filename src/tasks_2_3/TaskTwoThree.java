package tasks_2_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Function in Class is called Method
// Method is not in the class it is Function
public class TaskTwoThree {
    public static void main(String[] args){
        // Homework 3
        showArray(new int[]{90, -10, 0, 18, 17});
        System.out.println("-------------------------------");
        showReverseArray(new int[]{90, -10, 0, 18, 17});
    }

    public static void initializeArrayStepByStep(){
        System.out.print("Please enter length of the array: ");
        int[] numbers = new int[getScanner().nextInt()];

        for (int index = 0; index < numbers.length; index++){
            System.out.print("Please enter integer value for index[" + index + "]: ");
            numbers[index] = getScanner().nextInt();
        }

        showArray(numbers);

        Arrays.sort(numbers);

        showArray(numbers);

        System.out.println("Your value is under the index: " + Arrays.binarySearch(numbers, 10));
    }
    // Homework 3
    public static void setArraySizeAndValues(){
        System.out.print("Please enter length of the array: ");

        int[] numbers = new int[getScanner().nextInt()];

        /*
        for (int index = 0; index < numbers.length; index++){
            numbers[index] = (int) (Math.random() * 10);
        }
         */

        for (int index = 0; index < numbers.length; index++) {
            // take getRandomNumber() -> new Random() + .nextInt(1, 101) = new Random().nextInt(1, 101);
            // numbers[index] = new Random().nextInt(1, 101); -> without method
            numbers[index] = getRandomNumber().nextInt(1, 101);
        }

        for(int el : numbers){
            System.out.println("numbers array: " + el);
        }
    }

    // Homework 2, Task 1
    // Method signature
    // Method signature: method name and parameters = getNumbers(int num, int num1)
    public static void getEvenOdd() {
        Scanner input = new Scanner(System.in);

        /*
        do {
            System.out.print("Please enter an integer number or -1 to leave: ");
            int number = input.nextInt();

            if (number != -1){
                System.out.println("You have entered -1 and GOODBYE!");
                return;
            } else {
                if ((number % 2) == 0) {
                    System.out.println("Your number is EVEN.");
                } else {
                    System.out.println("Your number is ODD.");
                }
            }

        } while (true);
        */

        int number;

        System.out.print("Please enter a number or -1 to leave: ");

        while ((number = input.nextInt()) != -1){
            if ((number % 2) == 0) {
                System.out.println("Your number is EVEN.");
            } else {
                System.out.println("Your number is ODD.");
            }

            System.out.print("Please enter a number or -1 to leave: ");
        };
    }

    // check temperature
    public static void checkTempetrature(){
        System.out.print("Please enter outside temperature: ");
        int temperature = getScanner().nextInt();

        if (temperature > -5){
            System.out.println("Warm!");
        } else if (temperature <= -5 && temperature > -20){
            System.out.println("Cold...");
        } else if (temperature <= -20){
            System.out.println("Very cold!");
        }
    }

    // Value 1 = x;
    // Value 2 = x + value2;
    public static int getIncrementNumber(int initialValue, int step){
        for (int counter = 1; counter < 11; counter++){
            System.out.println("Your number is: " + initialValue);
            initialValue += step;
        }

        return initialValue; // return value via method
    }

    // getScanner method
    public static Scanner getScanner() {
        // return: breaks method
        // method returns something via keyword return
        return new Scanner(System.in);
    }

    // public static int getRandomNumber(){
    // return (int) new Random().nextInt(1, 101);
    public static Random getRandomNumber(){
        return new Random();
    }

    // just to show array of integer
    public static void showArray(int[] numbers){
        for(int el : numbers){
            System.out.println("numbers array: " + el);
        }
    }

    public static void showReverseArray(int[] numbers){
        for (int index = numbers.length - 1; index >= 0; index--){
            System.out.println("Array[" + index + "]: " + numbers[index]);
        }
    }

// Homework 2, Task 2
}
