/**
 * JadaDoc
 */
package lesson_2;

// package java - subfolder util - class Scanner
// import java.util.*; -> .* means everything

import java.io.IOException;
import java.util.Scanner;

public class ControlOperators {
    public static void main(String[] args) {
        // psvm
        // sout

        // Method call
        specialKeyWords();
    }

    public static void specialKeyWords(){
        // keyword break - breaks structure
        for (int counter = 1; counter < 11; counter++){
            System.out.println("Counter: " + counter);
            if (counter == 5){
                break;
            }
        }

        System.out.println("-------------------------------------");

        for (int counter = 1; counter < 11; counter++){
            if (counter == 5) continue; // skips iteration
            System.out.println("Counter: " + counter);
        }

        System.out.println("---------------------------------------");

        for (int counter = 1; counter < 11; counter++){
            if (counter == 9){
                return;
            }
            System.out.println("Counter: " + counter);
        }

        System.out.println("This code is after keyword return...");
        System.out.println("This code will never be shown...");
    }

    public static void loops(){
        // Loop - повторение одного и того же кода до определенного логического исхода
        // 1 to 10
        // while
        // do while
        // for

        int value = 1;

        // while пока проверяется условие и потом выполняется тело
        // т.е. если условие ложное тело никогда не выполнится
        while(value < 11){ // condition
            // body
            System.out.println("Value equals: " + value);
            value++; // conditional marker
        }

        System.out.println("--------------------------------------------------");
        // do while
        // он пока выполняет тело, а потом проверяет условие
        // он хотя бы однажды выполнится
        int val = 0;

        do {
            System.out.println("Val: " + val);
            val++;
        } while(val > 0 && val < 11);

        System.out.println("----------------------------------------------------");

        // for
        for (int counter = 1; counter < 11; counter++){
            System.out.println("Counter: " + counter);
        }

        // for (; ; ;)
        // for (int counter = 10; ; counter++){}
        // for (; k == 1; ){}
    }

    public static void getSwitchOperator(){
        // switch-case
        Scanner insert = new Scanner(System.in);

        System.out.print("Please enter day of the week by numbers where Mon = 1 & Sun = 7: ");
        int day = insert.nextInt();

        switch (day){
            // case "Archil" = String
            // case 'l' = char
            case 1:
                System.out.println("It is a Monday");
                break; // keyword break breaks the switch
            case 2:
                System.out.println("It is a Tuesday");
                break;
            case 3:
                System.out.println("It is a Wendnsday");
                break;
            case 4:
                System.out.println("It is a Thursday");
                break;
            case 5:
                System.out.println("It is a Friday");
                break;
            case 6:
                System.out.println("It is a Saturday");
                break;
            case 7:
                System.out.println("It is a Sunday");
                break;
            default: // can be skipped
                System.out.println("The number does not match any day of the week!");
                break;
        }
    }

    public static void insertedIfElse(){
        String name = "Archil";
        String position = "Engineer";

        if (name.equals("Archil")){
            if (position.equals("Developer")){
                System.out.println("Your name is Archil and your are a Developer...");
            } else {
                System.out.println("Your name is Archil but you are not a Developer...");
            }
        } else if (name.equals("Ylia")){
            if (position.equals("Engineer")){
                System.out.println("Your name is Ylia and your are a Engineer...");
            } else {
                System.out.println("Your name is Ylia but you are not a Engineer...");
            }
        } else {
            System.out.println("Your name is not Archil nor Ylia...");
        }
    }

    public static void getBlockOfCode(){
        // Create block of code
        {
            // lines of code combined by { } is called block of code
            // to implement a group of code
            // also, creates micro environment
        }

        String name = "Archill";

        // To compare String use .equals("");
        // Never use ==
        // if after conditional operator there are no {}
        // the first line is actual if true
        // the rest by default
        if (name.equals("Archil"))
            System.out.println("Your name is Archil");
        System.out.println("It is great to meet you...");
        System.out.println("See you soon!");

        /*
        if (name.equals("Archil")){
        System.out.println("Your name is Archil");
        System.out.println("It is great to meet you...");
        System.out.println("See you soon!");
        }
         */

        boolean isAlive = false;

        if (isAlive){ // by default == true
            System.out.println("He is alive...");
        }

        // to change by default and check on false
        if (!isAlive){ // if it is false
            System.out.println("He is alive...");
        }
    }
    // Control Operators
    public static void getControlOperators(){
        // if () {}
        // () ? _ : _
        // Class Diagram | Unified Modeling Language (UML)

        System.out.print("Please enter your age: ");
        Scanner getMyAge = new Scanner(System.in);
        int myAge = getMyAge.nextInt();
        final int mature = 18; // keyword final - immutable value, cannot be changed
        final int pensioner = 65;

        // >, <, ==, !=, >=, <=, !
        // Comment selected text - ctrl + / (eng keyword)
//        if (myAge >= mature){
//            System.out.println("I can vote!");
//        }
//
//        if (myAge < mature){
//            System.out.println("I am still a child...");
//        }
//
//        if (myAge >= pensioner){
//            System.out.println("I am a pensioner and still can vote...");
//        }

        // if-else creates a logical chain, if one element is equals true other are not checked
//        if (myAge >= mature){
//            System.out.println("I can vote!");
//        } else if (myAge < mature){
//            System.out.println("I am still a child...");
//        } else if (myAge >= pensioner){
//            System.out.println("I am a pensioner and still can vote...");
//        } else {
//            System.out.println("All previous logical chains were false...");
//        }

        // Improved code
        // and &&, or ||
        // && - all conditions are true
        // || - one of the conditions is true
//        if (myAge >= mature && myAge < pensioner){
//            System.out.println("I can vote!");
//        } else if (myAge < mature){
//            System.out.println("I am still a child...");
//        } else if (myAge >= pensioner){
//            System.out.println("I am a pensioner and still can vote...");
//        } else {
//            System.out.println("All previous logical chains were false...");
//        }

        boolean isMarried = false;

        if (myAge >= mature && isMarried == true){
            System.out.println("You are adult and married...");
        } else if (myAge < mature && isMarried == true){
            System.out.println("It is too early...");
        }

        // if one of the conditions must be true
        // if (myAge >= mature || isMarried == true)
    }

    public static void getScanner() throws IOException {
        // pre-fefix increment
        // pre-fix decrement
        int var = 10;

        System.out.println(var++); // post-fix increment = var + 1
        System.out.println(var--); // post-fix decrement = var - 1
        System.out.println(var);

        // var = 10
        System.out.println(--var); // (var - 1) = give value
        System.out.println(++var); // (var + 1) = give value

        double sum = 0;
        double max = 21.5;
        double min = 21.5;

        // if max > min = max, max < min = min, max == min = -1
        // Вложенный тернарный оператор
        sum = (max > min) ? max : (max == min) ? -1 : min;
        System.out.println(sum);

        // Scanner class
        // Class Scanner создать его экземпляр
        // Выделить под него память и привязать имя переменной к этой памяти
        // Экземпляр класса создается через ключевое слово new
        // C++ -> class stack / heap
        // Java Stack - примитивные типы
        // Heap - использовать new
        // All objects are stored in the Heap
        // If we use keyword new - we allocate memory in the Heap
        // By default, java.lang is imported all basic Java data
        Scanner input = new Scanner(System.in); // System.in - мы получаем данные с клавиатуры
        // Принимаемые данные обычно приходят в формате строки, на не чисел
        // Строка это массив символов

        // Java elementary level single char receive
        System.out.print("This is a System.in.read() method and it received one character: ");
        int charInt = System.in.read();
        System.out.println("ASCII table value: " + charInt);
        System.out.println("Type casting to char: " + (char) charInt);

        // Catch the junk in the buffer
        // System.out.println(System.in.read());
        System.in.read();

        // Принимает строчку, имя и фамилию
        System.out.print("Please enter your first name and family name: ");
        String fullName = input.nextLine();
        System.out.println("Your full name is: " + fullName);
        System.out.print("Please enter your weight: ");
        double weight = input.nextDouble();
        System.out.println("Your weight is: " + weight);
    }
}
