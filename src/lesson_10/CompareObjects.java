package lesson_10;

import java.util.Arrays;

public class CompareObjects {
    public static void main(String[] args) {
        //
        compareHumans();
    }

    public static void copyHuman(){
        Human archil = new Human("Archil", 35, new String[]{"Java Developer"});

        // IMPROVE THIS CODE
        // DEEP COPY
        Human anton = new Human(archil);
    }

    public static void compareHumans(){
        Human valery = new Human("Valery", 20, new String[]{"Archil", "Vova"});
        Human ksenya = new Human("Valery", 20, new String[]{"Volodya", "Johhny"});

        // if (valery == ksenya) -> by default, false, addresses are different - used keyword NEW

        // hashCode
        System.out.println(valery.hashCode());
        System.out.println(ksenya.hashCode());
        System.out.println((valery.hashCode() == ksenya.hashCode())); // true

        // valery.equals(ksenya) -> still false even if the content is the same
        System.out.println((valery.equals(ksenya))); // valery.equals(ksenya) == address == address
    }

    public static void compareObjects(){
        Object archil = "Archil"; // Optimizing String -> Archil
        Object archil1 = "Archil"; // Optimizing String -> Archil -> archil & archil1 -> the same address
        Object archil2 = new String ("Archil");

        System.out.println((archil == archil1)); // true, addresses
        System.out.println((archil.hashCode()));
        System.out.println((archil1.hashCode()));

        // archil2 create new address and space
        System.out.println((archil1 == archil2)); // false, hashCode
        System.out.println(archil2.hashCode()); // but hashCode is the same because object is the same
    }

    public static void compareArraysString(){
        // Shallow comparison
        // Deep comparison
        String archil = "Archil";
        String dasha = "Dasha";

        // String object
        // String -> address, hashCode
        // String does not contain value
        // archil == dasha compare addresses
        // not values
        // new -> creates new address
        if (archil == dasha){
            System.out.println("Equals!");
        } else {
            System.out.println("Does not equal!");
        }

        // Deep comparison
        // I compare two values not two addresses
        if (archil.equals(dasha)){
            System.out.println("Equals!");
        } else {
            System.out.println("Does not equal!");
        }

        // Shallow copy -> only address not values
        // Deep copy -> we copy attributes, inside part not address
        String volodya = "Volodya";
        String katya = volodya; // copies value because String class is optimized
        System.out.println(katya);

        // Arrays = object
        int[] integers = new int[]{1, 9, -1, 111};

        // Shallow copy -> присвоили массиву integersAgain адрес массива integers
        // alias
        int[] integersAgain = integers;

        for (int el : integersAgain){
            System.out.println(el);
        }

        // Deep copy
        integersAgain = Arrays.copyOf(integers, integers.length);
    }
}
