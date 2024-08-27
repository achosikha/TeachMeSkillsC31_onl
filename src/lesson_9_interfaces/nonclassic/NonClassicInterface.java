package lesson_9_interfaces.nonclassic;

public interface NonClassicInterface {
    // final & static
    // String is final and belongs to the INTERFACE
    // because INTERFACE is ABSTRACT
    // Means no instance of this INTERFACE
    String NAME = "Archil";
    int VALUE = 10;

    // default method helps us not to overload
    default void getDefaultMethod(){
        System.out.println("This is the default method with the body!");
    }
}
