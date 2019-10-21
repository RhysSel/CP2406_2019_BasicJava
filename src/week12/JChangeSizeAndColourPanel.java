package week12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JChangeSizeAndColourPanel extends JPanel implements ActionListener {
    final int yPos = 120;
    String message = "cancerous prac";
    int buttonPresses = 0;
    int xPos = 10;
    int fontSize = 40;
    JButton aButton = new JButton("Big ol button");
    Font font;
    Color color;

    public JChangeSizeAndColourPanel() {
        setBackground(Color.WHITE);
        add(aButton);
        aButton.addActionListener(this);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new JChangeSizeAndColourPanel());
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        font = new Font("ComicSans", Font.ITALIC, fontSize);
        g.setFont(font);
        g.setColor(color);
        g.drawString(message, xPos, yPos);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (buttonPresses == 0)
            color = Color.GREEN;
        else if (buttonPresses == 1)
            color = Color.PINK;
        else if (buttonPresses == 2)
            color = Color.YELLOW;
        buttonPresses++;
        fontSize -= 10;
        xPos += 50;
        if (buttonPresses <= 2)
            repaint();
    }
}
