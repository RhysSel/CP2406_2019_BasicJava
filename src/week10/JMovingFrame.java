package week10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMovingFrame extends JFrame implements ActionListener {
    final int MAX = 8;
    Container con = getContentPane();
    JPanel[] panel = new JPanel[8];
    JButton button = new JButton("Press");
    JLabel[] blankLabel = new JLabel[MAX];
    int x = 0, y;

    public JMovingFrame() {
        con.setLayout(new GridLayout(3, 3));
        setTitle("Moving Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (y = 0; y < MAX; ++y) {
            blankLabel[y] = new JLabel("        ");
            panel[y] = new JPanel();
            con.add(panel[y]);
            panel[y].add(blankLabel[y]);
        }
        panel[4].add(button);
        button.addActionListener(this);

    }

    public static void main(String[] args) {
        JMovingFrame mFrame = new JMovingFrame();
        mFrame.setSize(450, 450);
        mFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        blankLabel[x].setText("      ");
        x++;
        if (x == MAX)
            x = 0;
        blankLabel[x].setText("Dodgin 4 days");
    }
}