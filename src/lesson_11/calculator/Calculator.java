package lesson_11.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JTextField textField;

    public Calculator(){
        // constructor super()
        super("Calculator Swing"); // JFrame super() -> title of the window

        // to set how to draw elements
        setLayout(new BorderLayout());

        add(setTop(), BorderLayout.NORTH); // top, fully covers top part
        add(setBody(), BorderLayout.CENTER); // Covers the rest
        // frame -> рамка
        setDefaultCloseOperation(EXIT_ON_CLOSE); // to terminate window if we push X
        setSize(300, 500); // set size
        setResizable(false); // prohibit resize
        setVisible(true); // make it visible
    }

    JPanel setTop(){
        JPanel top = new JPanel();
        textField = new JTextField("0");
        textField.setEditable(false);

        top.setLayout(new BorderLayout());
        top.add(textField, BorderLayout.CENTER);

        return top;
    }

    JPanel setBody(){
        JPanel body = new JPanel();
        body.setLayout(new GridLayout(5, 4));

        // ActionListener instance
        ActionListener click = new ActionListenerClass(textField);

        JButton clear = new JButton("C");
        // How to make some buttons work irregularly?
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("0");
            }
        });

        JButton backspace = new JButton("Backs");
        // use anonymous interface -> YOUR TASK

        JButton pow = new JButton("**");
        // use anonymous interface -> make POW, YOUR TASK

        JButton minus = new JButton("-");
        minus.addActionListener(click);

        body.add(clear);
        body.add(backspace);
        body.add(pow);
        body.add(minus);

        for (int counter = 9; counter >= 0; counter--){
            // String.valueOf -> transforms accessible value to a String
            JButton btn = new JButton(String.valueOf(counter));
            btn.addActionListener(click);
            body.add(btn);
        }

        JButton addition = new JButton("+");
        addition.addActionListener(click);
        JButton division = new JButton("/");
        division.addActionListener(click);
        JButton multiply = new JButton("*");
        multiply.addActionListener(click);
        JButton dot = new JButton(".");
        dot.addActionListener(click);
        JButton equals = new JButton("=");
        // when I click equals we need to work with the STRING
        // Обработать строчку, посмотреть какие есть данные
        // и какая на месте операция бинарная (+, -, /, %, *)

        JButton modus = new JButton("%");
        modus.addActionListener(click);

        body.add(addition);
        body.add(division);
        body.add(multiply);
        body.add(modus);
        body.add(dot);
        body.add(equals);

        return body;
    }
}
