package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton2 extends JFrame implements ActionListener {
    int counter = 0;
    Container con = getContentPane();
    JButton button = new JButton("press to kill");
    JLabel label = new JLabel("you did it");

    public JFrameDisableButton2() {
        super("Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        con.setLayout(new FlowLayout());
        setSize(300, 300);
        setVisible(true);
        con.add(button);
        label.setVisible(false);
    }

    public static void main(String[] args) {
        JFrameDisableButton frame = new JFrameDisableButton();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        counter++;
        if (counter > 8) {
            button.setEnabled(false);
            label.setVisible(true);

        }
    }
}