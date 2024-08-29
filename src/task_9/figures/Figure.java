package task_9.figures;

public abstract class Figure implements Methods{
    private final double x;
    private final double y;
    private final double z;

    public Figure(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Must be done...";
    }
}
