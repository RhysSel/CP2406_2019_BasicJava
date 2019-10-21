package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFontSelector extends JFrame implements ActionListener {
    int size, counter = 0;
    JButton nButton = new JButton("Courier");
    JButton eButton = new JButton("Helvetica");
    JButton sButton = new JButton("TimesRoman");
    JButton wButton = new JButton("Algerian");
    JButton tButton = new JButton("Arial");
    JButton sizeButton = new JButton("Control size here");
    Panel thisOne = new Panel();
    Font nFont = new Font("Courier", Font.PLAIN, size);
    Font eFont = new Font("Helvetica", Font.PLAIN, size);
    Font sFont = new Font("TimesRoman", Font.PLAIN, size);
    Font wFont = new Font("Algerian", Font.PLAIN, size);
    Font tFont = new Font("Arial", Font.PLAIN, size);
    Font myFont = nFont;


    public JFontSelector() {
        setTitle("JFontSelector");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(wButton);
        add(nButton);
        add(eButton);
        add(sButton);
        add(tButton);
        add(sizeButton);

        eButton.addActionListener(this);
        wButton.addActionListener(this);
        nButton.addActionListener(this);
        sButton.addActionListener(this);
        tButton.addActionListener(this);
        sizeButton.addActionListener(this);
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
            myFont = nFont;
        } else if (source == eButton) {
            myFont = eFont;
        } else if (source == wButton) {
            myFont = wFont;
        } else if (source == sButton) {
            myFont = sFont;
        } else if (source == sizeButton) {
            if (counter % 2 == 1) {
                size = 12;
            } else {
                size = 24;
            }
            counter++;
        }
    }
}
