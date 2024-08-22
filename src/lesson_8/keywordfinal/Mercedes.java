package lesson_8.keywordfinal;

// class level - final means cannot inherit
final public class Mercedes extends Car{
    Mercedes(String model) {
        super(model);
    }

    // I cannot override oid getCarSound()
}
