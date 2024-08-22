package lesson_8.pc.zoostaff;

public class BlueColorWorkers extends Staff{
    public BlueColorWorkers(String blueColorWorkers, String whiteColorWorkers) {
        super(blueColorWorkers, whiteColorWorkers);
    }

    @Override
    void timetable() {
        System.out.println("Blue color workers are cleaners and other low income staff!");;
    }

    @Override
    void obligations() {
        System.out.println("To take care of the Animals!");
    }
}
