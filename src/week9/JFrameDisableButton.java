package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton extends JFrame implements ActionListener {
    Container con = getContentPane();
    JButton button = new JButton("press to kill");

    public JFrameDisableButton() {
        super("Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        con.setLayout(new FlowLayout());
        setSize(300, 300);
        setVisible(true);
        con.add(button);
    }

    public static void main(String[] args) {
        JFrameDisableButton frame = new JFrameDisableButton();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        button.setEnabled(false);
    }
}
