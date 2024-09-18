package lesson_15.genericsbasic;

public class MyGenerics {
    public static void main(String[] args) {
        GeneralizedClass<Integer, String> integerGeneric = new GeneralizedClass<>(35, "Archil");
        GeneralizedClass<Double, Integer> doubleGeneric = new GeneralizedClass<>(14.3, -1);
        GeneralizedClass<String, Character> stringGeneric = new GeneralizedClass<>("Katya", 'C');

        System.out.println(integerGeneric);
        System.out.println(doubleGeneric);
        System.out.println(stringGeneric);

        if (integerGeneric.sData.equals("Archil")){
            System.out.println("Your name is Archil...");
        }

        GeneralOneParameter<?> general = new GeneralOneParameter<>(134);
        GeneralOneParameter<?> generalString = new GeneralOneParameter<>("Archil");
        GeneralOneParameter<? extends Number> numberGeneral = new GeneralOneParameter<>(134.5);
        GeneralOneParameter<? extends Number> numberGeneralTwo = new GeneralOneParameter<>(15);
        GeneralOneParameter<? extends Number> numberGeneralThre = new GeneralOneParameter<>(1);

        GeneralOneParameter<? super Integer> onlyIntegerAndAbove = new GeneralOneParameter<Integer>(15);
    }

    public static void genericsViaObjects(){
        GenericsBase bankAccount = new GenericsBase(12, 'c');

        if (bankAccount.getAllTypesBankAccount() instanceof String){
            System.out.println("This is a String value: " + bankAccount.getAllTypesBankAccount());
        } else if (bankAccount.getAllTypesBankAccount() instanceof Integer){
            System.out.println("This is an Integer value: " + bankAccount.getAllTypesBankAccount());
        } else if (bankAccount.getAllTypesBankAccount() instanceof Double){
            System.out.println("This is an Double value: " + bankAccount.getAllTypesBankAccount());
        } else {
            System.out.println("It is neither String, nor Integer and Double...");
        }
    }
}
