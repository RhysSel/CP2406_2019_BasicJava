package week10;

import javax.swing.*;
import java.awt.*;

public class JFlexiblePanel extends JPanel {
    Color fore;
    Color back;
    Font font;
    String message;
    JLabel label = new JLabel();

    public JFlexiblePanel(Color bkgd, Color frgd, Font fnt, String msg) {
        fore = frgd;
        back = bkgd;
        font = fnt;
        message = msg;
        this.add(label);
        label.setText(message);
        label.setFont(font);
        this.setBackground(back);
        label.setForeground(frgd);
    }

}
