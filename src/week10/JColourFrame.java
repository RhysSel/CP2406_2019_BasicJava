package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JColourFrame extends JFrame implements ActionListener {
    Button colourButton = new Button("Change the colour boii");
    JPanel centre = new JPanel();
    JPanel north = new JPanel();
    JPanel south = new JPanel();
    JPanel east = new JPanel();
    JPanel west = new JPanel();
    int counter = 0;

    public JColourFrame() {
        super("JColourFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = this.getContentPane();
        con.setLayout(new BorderLayout());
        centre.add(colourButton);
        con.add(north, BorderLayout.NORTH);
        con.add(south, BorderLayout.SOUTH);
        con.add(east, BorderLayout.EAST);
        con.add(west, BorderLayout.WEST);
        con.add(centre, BorderLayout.CENTER);
        colourButton.addActionListener(this);
    }

    public static void main(String[] args) {
        JColourFrame cFrame = new JColourFrame();
        cFrame.setSize(450, 450);
        cFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (counter % 5 == 0)
            north.setBackground(Color.GREEN);
        else if (counter % 5 == 1)
            east.setBackground(Color.MAGENTA);
        else if (counter % 5 == 2)
            west.setBackground(Color.ORANGE);
        else if (counter % 5 == 3)
            south.setBackground(Color.RED);
        else {
            east.setBackground(Color.WHITE);
            south.setBackground(Color.WHITE);
            north.setBackground(Color.WHITE);
            west.setBackground(Color.WHITE);
        }
        counter++;
    }
}
