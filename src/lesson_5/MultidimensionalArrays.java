package lesson_5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MultidimensionalArrays {
    public static void main(String[] args){
        // int[][][] -> modelling, games
        // int[][][][] -> physics and the following
        // int[][][][][]
        /*
        String[][][] modelling = new String[4][][];
        modelling[0] = new String[10][];
        modelling[0][0] = new String[4];
         */
        int[][][] numbers = new int[][][]{
                {
                    { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 }
                }
        };

        for (int outer = 0; outer < numbers.length; outer++){
            for (int inner = 0; inner < numbers[outer].length; inner++){
                for (int deeper = 0; deeper < numbers[outer][inner].length; deeper++){
                    System.out.println(numbers[outer][inner][deeper]);
                }
            }
        }

        for (int[][] number : numbers) {
            for (int[] ints : number) {
                for (int anInt : ints) {
                    System.out.println(anInt);
                }
            }
        }

        // 5 dimensional
        int[][][][][] veryDifficultArray = new int[10][][][][];
    }

    public static void getArrayBasic(){
        // Two dimensional array
        int[][] matrix = setArray();

        showMultidimensionalArrayEnhanced(matrix);

        System.out.println("--------------------------------");
        int[] oneDimensional = new int[5];
        Arrays.fill(oneDimensional, 5);
        System.out.println(Arrays.toString(oneDimensional));

        int[][] matrixAutoFill = new int[][]{
                {4, 5, 7},
                {1},
                {9, -1}
        };
        System.out.println(Arrays.deepToString(matrixAutoFill));
        // Arrays.fill(matrixAutoFill[0], 10);
        // array == array
        // array[index] == array[1]
    }

    public static int[][] setArray(){
        return new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
    }

    public static void getAdditionalArray(){
        // Fixed size, no different rows size
        // int[][] dimensionalNumbers = new int[10][2];
        int[][] dimensionalNumbers = new int[][]{
                { 19, 21, 90},
                { 1 },
                { 2, 10, 100, 19, 20, 22},
        };

        setArray(dimensionalNumbers);
        showMultidimensionalArrayEnhanced(dimensionalNumbers);
    }

    public static void start(){
        String[] names = new String[]{"Dasha", "Anton", "Archil", "Katya"};

        showArray(names);

        // Multidimensional arrays the first [size] must be given
        String[][] fullNames = new String[5][];

        // new String[5][]
        // access new String[5][access index 0] -> no size
        // System.out.println(fullNames[0][0]); -> no size mentioned
        fullNames[0] = new String[4]; // [Scanner][4] - null
        fullNames[1] = new String[10];
        fullNames[2] = new String[1];
        fullNames[3] = new String[8];
        fullNames[4] = new String[5];

        System.out.println(fullNames[0][3]);
        System.out.println(fullNames[4][4]);
    }

    public static void showArray(String[] names){
        for (String name : names){
            System.out.println("Your names are: " + name);
        }
    }

    public static void showMultiDimensionalArrayClassic(String[][] fullNames){
        for (int outer = 0; outer < fullNames.length; outer++){
            for (int inner = 0; inner < fullNames[outer].length; inner++){
                System.out.print(fullNames[outer][inner] + " -> ");
            }
            System.out.println();
        }
    }

    // method overload перегрузка метода
    // это когда имя метода не изменяется, но изменяется тип и количество параметров в методе
    // (String[], int) - (int, String[])
    // (String, int, double) - (double, double, String)
    public static void showMultidimensionalArrayEnhanced(int[][] dimensionalNumbers){
        for (int outer = 0; outer < dimensionalNumbers.length; outer++) {
            for (int inner = 0; inner < dimensionalNumbers[outer].length; inner++) {
                System.out.print(dimensionalNumbers[outer][inner] + "...");
            }
            System.out.println();
        }
    }

    public static void showMultidimensionalArrayEnhanced(String[][] fullNames){
        for (String[] outer : fullNames){ // from fullNames -> all values to String[] el
            for (String inner : outer){
                System.out.print(inner + " - ");
            }
            System.out.println();
        }
    }

    public static void setArray(int[][] numbers){
        for (int outer = 0; outer < numbers.length; outer++){
            for (int inner = 0; inner < numbers[outer].length; inner++){
                numbers[outer][inner] = new Random().nextInt(1, 101);
            }
        }
    }

    public static Scanner getScanner(){
        return new Scanner(System.in);
    }
}
