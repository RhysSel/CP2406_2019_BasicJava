package week12.DebugSixteen;

// This program should display a bullseye, not a cone

import javax.swing.*;
import java.awt.*;

public class FixDebugSixteen1 extends JPanel {
    String msg = "This is a bull's eye";
    int radius, corner;

    public FixDebugSixteen1() {
        setBackground(Color.WHITE);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new FixDebugSixteen1());
        frame.setSize(340, 340);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        // Need to decrement the 'corner' dimension to create the bullseye shape
        // instead of the cone
        for (corner = 150, radius = 2; radius < 200; radius += 6, corner -= 3) {
            if (radius < 50)
                gr.setColor(Color.RED);
            else if (radius < 100)
                gr.setColor(Color.GREEN);
            else if (radius < 150)
                gr.setColor(Color.YELLOW);
            else
                gr.setColor(Color.BLUE);
            gr.drawOval(corner, corner, radius, radius);
        }
        gr.setFont(new Font("Arial", Font.ITALIC, 20));
        gr.setColor(Color.BLACK);
        gr.drawString(msg, 100, 150);
    }
}