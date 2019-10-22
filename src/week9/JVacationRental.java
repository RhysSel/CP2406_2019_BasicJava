package week9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JVacationRental extends JFrame implements ItemListener {
    FlowLayout flow = new FlowLayout();
    String companyName = "Lambert's Vacation Rentals";
    int parkPrice = 600, poolPrice = 750, lakePrice = 825, totalPrice;
    int oneRoom = 0, twoRoom = 75, threeRoom = 150;
    int noMeals = 0, Meals = 200;

    ButtonGroup location = new ButtonGroup();
    JCheckBox park = new JCheckBox("park", false);
    JCheckBox pool = new JCheckBox("pool", false);
    JCheckBox lake = new JCheckBox("lake", false);

    ButtonGroup rooms = new ButtonGroup();
    JCheckBox oneBedroom = new JCheckBox("One Bedroom", false);
    JCheckBox twoBedroom = new JCheckBox("Two Bedroom", false);
    JCheckBox threeBedroom = new JCheckBox("Three Bedrooms", false);

    ButtonGroup mealsGroup = new ButtonGroup();
    JCheckBox meals = new JCheckBox("Meals", false);
    JCheckBox nomeals = new JCheckBox("No Meals", false);


    public JVacationRental() {
        super("Vacation Rentals");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        location.add(park);
        location.add(pool);
        location.add(lake);
        rooms.add(oneBedroom);
        rooms.add(twoBedroom);
        rooms.add(threeBedroom);
        mealsGroup.add(nomeals);
        mealsGroup.add(meals);
        meals.addItemListener(this);
        nomeals.addItemListener(this);
        oneBedroom.addItemListener(this);
        twoBedroom.addItemListener(this);
        threeBedroom.addItemListener(this);
        pool.addItemListener(this);
        park.addItemListener(this);
        park.addItemListener(this);
        add(pool);
        add(lake);
        add(park);
        add(oneBedroom);
        add(twoBedroom);
        add(threeBedroom);
        add(meals);
        add(nomeals);
    }

    public static void main(String[] args) {
        JVacationRental frame = new JVacationRental();
        frame.setSize(600, 600);
        frame.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent check) {
        Object source = check.getItem();
        if (source == park) {
            int select = check.getStateChange();
            if (select == ItemEvent.SELECTED) {
                totalPrice += parkPrice;
            } else if (select == ItemEvent.DESELECTED) {
                totalPrice -= parkPrice;
            }
        }
    }
}
