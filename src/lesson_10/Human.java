package lesson_10;

import java.util.Arrays;

public class Human {
    private final String name;
    private final int age;
    private final String[] additional;

    public Human(String name, int age, String[] additional){
        this.name = name;
        this.age = age;

        // To avoid copying Array address from ony object to another
        this.additional = Arrays.copyOf(additional, additional.length);
    }

    void getOnlyHumanMethod(){
        System.out.println("Human message!");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Human temp = (Human) obj;

        return (this.name.equals(temp.name)) && (this.age == temp.age);
    }

    // if you override hashCode - unique id-s
    /*
    @Override
    public int hashCode() {
        return 167810910;
    }
     */
}
