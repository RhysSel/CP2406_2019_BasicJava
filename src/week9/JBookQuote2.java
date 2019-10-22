package week9;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JBookQuote2 extends JFrame implements ActionListener {
    FlowLayout layout = new FlowLayout();
    JLabel message1 = new JLabel("Ya boi out here");
    JLabel message2 = new JLabel("with the phat pentas\r\n");
    JButton button = new JButton("Click button for author details");
    JLabel message3 = new JLabel("Rhys Selwyn - 21/05/97");

    public JBookQuote2() {
        super("Book Quote");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(layout);
        add(button);
        button.addActionListener(this);
        add(message1);
        add(message2);

    }

    public static void main(String[] args) {
        JBookQuote2 bigFrame = new JBookQuote2();
        bigFrame.setSize(400, 500);
        bigFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        add(message3);
        remove(message1);
        remove(message2);
        validate();
        repaint();
    }

}