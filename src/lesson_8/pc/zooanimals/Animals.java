package lesson_8.pc.zooanimals;

public class Animals {
    private String type;
    private String name;

    public Animals(String type, String name){
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
