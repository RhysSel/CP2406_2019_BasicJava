package week12;

import javax.swing.*;
import java.awt.*;

public class JNestedBoxesPanel extends JPanel {
    int numBoxes = 8, increment = 20, width = 300, height = 300, y = 20, x = 20;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new JNestedBoxesPanel());
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        int y = 20, x = 20, width = 300, height = 300;
        for (int i = 0; i < numBoxes; i++) {
            gr.drawRect(x, y, width, height);
            y += increment;
            x += increment;
            width -= increment * 2;
            height -= increment * 2;
        }
    }
}
