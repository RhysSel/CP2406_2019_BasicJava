package week10;


import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class JLeftOrRight extends JFrame implements MouseListener {
    JLabel label = new JLabel("Click da screen");

    public JLeftOrRight() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(label);
        addMouseListener(this);
    }

    public static void main(String[] args) {
        // create object
        JLeftOrRight left = new JLeftOrRight();
        left.setSize(400, 400);
        left.setVisible(true);

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        label.setText("The" + mouseEvent.getModifiersEx() + " click was used");
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
