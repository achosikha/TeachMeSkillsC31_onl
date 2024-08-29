package lesson_10;

public class ClassWrappers {
    public static void main(String[] args) {
        // Обертка примитивных классов
        boolean isTrue = true;
        char charLetter = 'l';
        int number = 10;
        double doubleNum = 13.4;
        float floatNum = 14.4F;

        // primitive types to classes Class Wrapper
        // Чтобы мы могли указывать примитивный тип данных в коллекциях
        // super class Number
        // super class of Number -> Object

        /*
        Integer numberInt = new Integer(100);
        Boolean isFalse = new Boolean(false);
        Character isClassCharacter = new Character('K');
        Double doubleClassWrapper = new Double(145.2);
        Float floatClassWrapper = new Float(1456.1F);
         */

        // Super object
        // Can contain everything
        // Object reference style -> heap allocate enough memory to keep any type of data in Java

        // VERY BAD!
        Object generalObjectInstance = new Object();
        System.out.println(generalObjectInstance); // address in Stack pointing to the Heap
        System.out.println(generalObjectInstance.getClass()); // class name Object
        System.out.println(generalObjectInstance.hashCode()); // Long type object instance id
        System.out.println(generalObjectInstance.toString()); // Attempt to present the object to String
        System.out.println(generalObjectInstance.equals(new Object())); // Compare

        System.out.println("------------------------------------------------");

        generalObjectInstance = 149;
        System.out.println(generalObjectInstance);
        System.out.println(generalObjectInstance.getClass());

        generalObjectInstance = 145.45F;
        System.out.println(generalObjectInstance);
        System.out.println(generalObjectInstance.getClass());

        generalObjectInstance = 'A';
        System.out.println(generalObjectInstance);
        System.out.println(generalObjectInstance.getClass());

        generalObjectInstance = "Archil Sikharulidze";
        System.out.println(generalObjectInstance);
        System.out.println(generalObjectInstance.getClass());

        generalObjectInstance = false;
        System.out.println(generalObjectInstance);
        System.out.println(generalObjectInstance.getClass());

        // VERY BAD!
        // Object archil = new Human();
        Object[] objects = new Object[]{
                new Human("Archil", 35, new String[]{"Archil"}),
                123,
                "Archil Sikharulidze",
                'A',
                345.1,
                false
        };

        System.out.println(objects[0]);
        System.out.println(objects[1]);

        System.out.println("------------------------------------");
        for (Object object : objects){
            System.out.println(object);
        }
    }
}
