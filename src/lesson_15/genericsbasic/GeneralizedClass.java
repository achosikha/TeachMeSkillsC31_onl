package lesson_15.genericsbasic;

public class GeneralizedClass <T, S>{
    T data;
    S sData;

    public GeneralizedClass(T data, S sData){
        this.data = data;
        this.sData = sData;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setsData(S sData) {
        this.sData = sData;
    }

    public S getsData() {
        return sData;
    }

    public String showGeneralValue(GeneralizedClass<?, ?> data){
        return "msg";
    }

    @Override
    public String toString() {
        return "GeneralizedClass{" +
                "data=" + data +
                ", sData=" + sData +
                '}';
    }
}
