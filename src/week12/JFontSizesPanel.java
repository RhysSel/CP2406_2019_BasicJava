package week12;

import javax.swing.*;
import java.awt.*;

public class JFontSizesPanel extends JPanel {
    String words = "cancerous prac";
    int fontStart = 6, fontEnd = 20, vertPos;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new JFontSizesPanel());
        frame.setSize(450, 450);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int vertPos = 10;
        for (int i = fontStart; i <= fontEnd; i++) {
            g.setFont(new Font("ComicSans", Font.ITALIC, i));
            g.drawString(words, 50, vertPos);
            vertPos += 20;
        }

    }

}
