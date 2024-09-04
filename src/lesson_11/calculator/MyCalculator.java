package lesson_11.calculator;

import javax.swing.*;

public class MyCalculator {
    public static void main(String[] args) {
        // Java AWT (Abstract Window Toolkit) is an API to develop
        // Graphical User Interface, Swing - JavaFX

        // SwingUtilities create threads
        // in the thread -> builds forms
        // Anonymous -> with no name or particular address
        // To avoid thread deadlock
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculator();
            }
        });
    }
}
