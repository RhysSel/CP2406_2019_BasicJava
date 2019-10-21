package week12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JUpsideDownPanel extends JPanel implements ActionListener {
    final int yPos = 120;
    String message = "cancerous prac";
    int buttonPresses = 0;
    int xPos = 10, initialX, initialSize, fontSize = 40;
    int initialFontSize = 40;
    Font normal = new Font("ComicSans", Font.ITALIC, fontSize);
    Font upsideDown = new Font("ComicSans", Font.ITALIC, -fontSize);
    JButton aButton = new JButton("Big ol button");
    Font font = normal;
    Color color;


    public JUpsideDownPanel() {
        setBackground(Color.WHITE);
        add(aButton);
        aButton.addActionListener(this);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new JUpsideDownPanel());
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(font);
        g.drawString(message, xPos, yPos);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (buttonPresses % 2 == 1) {
            font = normal;
            xPos = 200;
        } else {
            font = upsideDown;
            xPos = 500;
        }
        buttonPresses++;
        repaint();
    }
}
