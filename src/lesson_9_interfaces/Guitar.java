package lesson_9_interfaces;

// to implement interface use keyword implements
// Interfaces give us opportunity to realize multiple inheritance
public class Guitar implements Instruments, Playable, CanBeClonned{
    @Override
    public String sound() {
        return "This is Guitar sound!";
    }

    @Override
    public String speed() {
        return "Guitar speed depends on a Musician!";
    }

    @Override
    public String message(String msg) {
        return "Your message is: " + msg;
    }

    @Override
    public boolean isPlayable() {
        return false;
    }

    @Override
    public boolean isRepairable() {
        return true;
    }
}
