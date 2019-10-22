package week9;

import javax.swing.*;
import java.awt.*;

public class JBookQuote extends JFrame {
    FlowLayout layout = new FlowLayout();
    JLabel message1 = new JLabel("Ya boi out here");
    JLabel message2 = new JLabel("with the phat pentas");

    public JBookQuote() {
        super("Book Quot");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(layout);
        add(message1);
        add(message2);
    }

    public static void main(String[] args) {
        JBookQuote bigFrame = new JBookQuote();
        bigFrame.setSize(400, 500);
        bigFrame.setVisible(true);
    }
}
