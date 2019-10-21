package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMovieFrame extends JFrame implements ActionListener {

    JButton nButton = new JButton("Cool - India");
    JButton eButton = new JButton("Boring - Australia");
    JButton sButton = new JButton("Yaboi - Afghanistan");
    JButton wButton = new JButton("Hizole - Phillipines");
    JLabel northLabel = new JLabel("that guy");
    JLabel eastLabel = new JLabel("which guy");
    JLabel westLabel = new JLabel("who dat");
    JLabel southLabel = new JLabel("hmmm");


    public JMovieFrame() {
        setTitle("JMovieFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(wButton, "West");
        add(nButton, "North");
        add(eButton, "East");
        add(sButton, "South");
        eButton.addActionListener(this);
        wButton.addActionListener(this);
        nButton.addActionListener(this);
        sButton.addActionListener(this);
    }

    public static void main(String[] args) {
        JFontSelector frame = new JFontSelector();
        frame.setSize(600, 600);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == nButton) {
            remove(nButton);
            add(northLabel, BorderLayout.NORTH);
        } else if (source == eButton) {
            remove(eButton);
            add(eastLabel, BorderLayout.EAST);
        } else if (source == wButton) {
            remove(wButton);
            add(westLabel, BorderLayout.WEST);
        } else if (source == sButton) {
            remove(sButton);
            add(southLabel, BorderLayout.SOUTH);
        }
        invalidate();
        validate();
    }
}
