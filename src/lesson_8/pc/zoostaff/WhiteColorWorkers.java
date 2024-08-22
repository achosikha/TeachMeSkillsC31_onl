package lesson_8.pc.zoostaff;

public class WhiteColorWorkers extends Staff{
    public WhiteColorWorkers(String blueColorWorkers, String whiteColorWorkers) {
        super(blueColorWorkers, whiteColorWorkers);
    }

    @Override
    void timetable() {
        System.out.println("White color workers are managers and work when they want!");;
    }

    @Override
    void obligations() {
        System.out.println("Managing the system...");
    }
}
