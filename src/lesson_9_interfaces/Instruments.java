package lesson_9_interfaces;

// .java
// .class
// keyword interface only for compiler
// keyword public - interfaces by default public
interface Instruments extends CanRepair{
    String sound();
    String speed();
    String message(String msg);
}