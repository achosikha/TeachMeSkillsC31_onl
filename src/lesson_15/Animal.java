package lesson_15;

public class Animal {
    private final String name;
    private final int age;

    public Animal(String name, int age){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
