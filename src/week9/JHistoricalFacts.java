package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JHistoricalFacts extends JFrame implements ActionListener {
    FlowLayout layout = new FlowLayout();
    int counter = 0;
    JLabel label1 = new JLabel(" cool dood\r\n");
    JLabel label2 = new JLabel("cdoooooooooooodd\r\n");
    JLabel label3 = new JLabel("dudest \r\n");
    JLabel label4 = new JLabel("bruh\r\n");
    JLabel label5 = new JLabel("brus\r\n");
    JButton button = new JButton("press to change fact\r\n");

    public JHistoricalFacts() {
        super("Facts");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(layout);
        add(button);
        button.addActionListener(this);

    }

    public static void main(String[] args) {
        JHistoricalFacts frame = new JHistoricalFacts();
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        add(label1);
        counter++;
        if (counter == 5) {
            counter = 0;
        }
        if (counter == 1) {
            remove(label1);
            add(label2);
        } else if (counter == 2) {
            remove(label2);
            add(label3);
        } else if (counter == 3) {
            remove(label3);
            add(label4);
        } else if (counter == 4) {
            remove(label4);
            add(label5);
        } else {
            remove(label5);
            add(label1);
        }
        repaint();
        revalidate();
    }
}