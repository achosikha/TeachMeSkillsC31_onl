package lesson_15.genericsbasic;

public class GeneralOneParameter <T> {
    T data;

    public GeneralOneParameter(T data){
        this.data = data;
    }

    // <?> -> any type
    // <? extends Number> -> Number extends Integer, Double... -> Number
    // <? super Integer> -> Integer -> above -> Integer above
    public boolean getParameter(GeneralOneParameter<?> data){
        return true;
    }
}
