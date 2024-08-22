package lesson_8.pc.zooinfrastructure;

public class Infrastructure {
    private String territory;
    private String address;

    public Infrastructure(String territory, String address){
        this.address = address;
        this.territory = territory;
    }

    @Override
    public String toString() {
        return "Infrastructure{" +
                "territory='" + territory + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
