package lesson_8.pc.zoostaff;

public class Staff {
    private String blueColorWorkers;
    private String whiteColorWorkers;

    public Staff(String blueColorWorkers, String whiteColorWorkers){
        this.blueColorWorkers = blueColorWorkers;
        this.whiteColorWorkers = whiteColorWorkers;
    }

    void obligations(){}
    void timetable(){}

    @Override
    public String toString() {
        return "Staff{" +
                "blueColorWorkers='" + blueColorWorkers + '\'' +
                ", whiteColorWorkers='" + whiteColorWorkers + '\'' +
                '}';
    }
}
