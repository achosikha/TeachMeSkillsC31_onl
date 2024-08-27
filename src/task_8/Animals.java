package task_8;

public class Animals {
    private final String name;
    private final String type;

    public Animals(String name, String type){
        this.name = name;
        this.type = type;
    }

    public void sound(){};
    public void eat(String food){};

    // Method toString() inherited from super class Object
    @Override
    public String toString() {
        return "The animal is: " + this.type + "\n" +
                "The animal name is: " + this.name;
    }
}
