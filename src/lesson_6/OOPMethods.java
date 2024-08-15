package lesson_6;

public class OOPMethods {
    public static void main(String[] args) {
        // OOP Class
    }

    public static void getVarArgs(){
        // String[] names = new String[]{"A", "B", "C"};
        // initializeArray(names);

        initializeArray("Archil", "Zhenya", "Polina");
        getArgumentsAndVarArgs(new int[]{9, 5, 10}, "Archil", "Polina", "Zhenya", "Anton");
    }

    public static void getMethodOverloads(){
        String[] names = new String[]{"Polina", "Evgeny", "Aleksandr"};
        int[] numbers = new int[]{1, 9, 10};

        getArrays(names);
        getArrays(numbers);

        double val = 12;

        getNumber(12); // compiler cannot resolve some types
        getNumber(12.5);

        float value = 12.5f;
        getNumber(value);

        byte byteValue = 120;
        getNumber(byteValue);

        long longValue = 124L;
        getNumber(longValue);
    }
    // Подпись метода это название метода и передаваемые значения
    // Перегрузка метода это создание двух одинаковых методов по имени, но разных по параметрам
    // Method Overload - перегрузка метода
    public static void getArrays(String[] names){
        for (String el : names){
            System.out.print(el + " ");
        }
        System.out.println();
    }

    public static void getArrays(int[] numbers){
        for (int el : numbers){
            System.out.print(el + " ");
        }
        System.out.println();
    }

    public static void getNumber(int number){
        System.out.println("Your number is: " + number);
    }

    public static void getNumber(double number){
        System.out.println("Your number is: " + number);
    }

    public static void initializeArray(String... names){
        // type... variableName = varargs
        // String[] names = new String[]{..., ..., ...};
        // Output: one dimensional array String

        for (String el : names){
            System.out.print(el + " ");
        }
        System.out.println();
    }

    // var-args must be always in the end of the parameters list
    public static void getArgumentsAndVarArgs(int[] numbers, String... names){
        System.out.println(numbers[0]);
        System.out.println(names[1]);
    }
}
