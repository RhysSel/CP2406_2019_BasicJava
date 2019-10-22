package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class JTVDownload2 extends JFrame implements ItemListener {
    JComboBox<String> programBox = new JComboBox<String>();
    JLabel title = new JLabel("                 Program List               ");
    JTextField description = new JTextField(20);
    String[] programs = {"Family Guy",
            "American Dad", "Southpark",
            "Parks and Recreation", "GOT"};
    String[] descrips = {"", "Fat peter",
            "American dude whos a dad",
            "Classic memes",
            "Comedy in local government office",
            "Incest n dragons"};

    public JTVDownload2() {
        super("JTVDownload");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        programBox.addItemListener(this);
        add(title);
        programBox.addItem("none");
        for (int x = 0; x < programs.length; ++x)
            programBox.addItem(programs[x]);
        add(programBox);
        add(description);
    }

    public static void main(String[] arguments) {
        JTVDownload frame = new JTVDownload();
        frame.setSize(150, 150);
        frame.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent list) {
        Object source = list.getSource();
        if (source == programBox) {
            int num = programBox.getSelectedIndex();
            try {
                description.setText(descrips[num]);
            } catch (ArrayIndexOutOfBoundsException e) {
                description.setText("Search not recognised");
            }
        }
    }
}