package lesson_9_interfaces;

public class PianoXG extends Piano{
    @Override
    public String sound() {
        return "This is a PianoXG";
    }

    @Override
    public String speed() {
        return "PianoXG depends on a Musician!";
    }

    @Override
    public String message(String msg) {
        return "Your message is " + msg;
    }

    @Override
    public boolean isPlayable() {
        return true;
    }

    @Override
    public boolean isRepairable() {
        return false;
    }
}