package lesson_15;

import java.util.*;

public class CollectionsBasics {
    public static void main(String[] args) {
        // no value before the run-time
        // only primitives
        // array has fixed size
        // memory issues - only arrays

        // Collections super class
        // Collections - realizations containers

        // Collections super class
        // Sometimes in an advanced books called containers: List, Set, Queue
        // List: ArrayList, LinkedList
        // Set: HashSet, TreeSet, LinkedHashSet
        // Queue

        // Map
        // Containers: HashMap, TreeMap, LinkedHashMap

        storePersonalClasses();
    }

    public static void storePersonalClasses(){
        List<Animal> animals = new ArrayList<>(Arrays.asList(
                new Animal("Random", 10),
                new Cats("Vasya", 2),
                new Lion("Olga", 1)
        ));

        for (Animal animal : animals){
            System.out.println(animal);
        }

        animals.add(new Cats("Liudmila", 7));
    }

    public static void getSet(){
        // Set receives only unique values
        // HashSet -> int unique sort very quick, not ordered, not sorted
        // data according to hashCode, but not order
        Set<String> stringNames = new HashSet<>(Arrays.asList("Timur", "Archil", "Vasya", "Irina", "Ekaterina"));

        for (String name : stringNames){
            System.out.println(name);
        }

        System.out.println("--------------------------------------");

        stringNames.add("Ylia");
        for (String name : stringNames){
            System.out.println(name);
        }

        System.out.println("------------------------------------------------");
        // TreeSet
        Set<Double> doubleSet = new TreeSet<>(Arrays.asList(14.5, 20.1, 19.4));

        for (double value : doubleSet){
            System.out.println(value);
        }

        doubleSet.add(-1.1);

        System.out.println("----------------------------------");
        for (double value : doubleSet){
            System.out.println(value);
        }

        System.out.println("---------------------------------------------------------------");
        // LinkedHashSet
        Set<Character> characterSet = new LinkedHashSet<>(Arrays.asList('A', 'Z', 'E', 'R'));

        // From LinkedHashSet to Character[]
        Character[] arrayChar = characterSet.toArray(new Character[characterSet.size()]);

        for (char letter : characterSet) {
            System.out.println(letter);
        }
    }

    public static void getLikedList(){
        List<String> stringList = new LinkedList<>(Arrays.asList("Katya", "Vova", "Igor"));

        for (String name : stringList){
            System.out.println(name);
        }
    }

    public static void getList(){
        // Before SE5
        // List in its basics is just an array
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        System.out.println(list.get(0));
        // list.add(1);

        // ArrrayList()
        // size() 2, capacity() -> always more
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(19, 10));
        arrayList.add(100);
        arrayList.add(1, 109);
        arrayList.addFirst(-100);
        arrayList.addLast(9); // the same as add()
        arrayList.set(0, 1988);

        for (int el : arrayList){
            System.out.print(el + " ");
        }

        arrayList.clear();
        arrayList.add(19);
        arrayList.add(21);
        arrayList.add(25);
        arrayList.remove(1);
    }

    public static void getBasicInformationOnArraysCollections(){
        // int, double, float -> the fastest
        // always fastest if used with primitive types
        int[] numbers = new int[]{1, 2, 3, 4};

        // expendable array
        // we can just add values and the arrayList will expand by default
        List<Integer> listNumbers = new ArrayList<>(Arrays.asList(14, 15, 5, 9));

        System.out.println(listNumbers.get(0));

        for (int index = 0; index < listNumbers.size(); index++){
            System.out.println(listNumbers.get(index));
        }

        System.out.println("-----------------------------------------");

        for (int value : listNumbers){
            System.out.println(value);
        }
    }
}
