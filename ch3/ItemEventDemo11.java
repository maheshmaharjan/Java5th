package ch3;

import java.awt.*;
import java.awt.event.*;

public class ItemEventDemo11 implements ItemListener {

    private Frame frame;
    private Checkbox checkbox1, checkbox2;
    private Label label;

    public ItemEventDemo11() {
        // Create a frame
        frame = new Frame("ItemEvent Example");
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(3, 1));

        // Create checkboxes
        checkbox1 = new Checkbox("Checkbox 1");
        checkbox2 = new Checkbox("Checkbox 2");

        // Add ItemListener to checkboxes
        checkbox1.addItemListener(this);
        checkbox2.addItemListener(this);

        // Create a label to display item event information
        label = new Label("ItemEvent will appear here.", Label.CENTER);

        // Add components to the frame
        frame.add(checkbox1);
        frame.add(checkbox2);
        frame.add(label);

        // Add window listener to close the window
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true); // Show the frame
    }

    // ItemListener method to handle item state changes
    @Override
    public void itemStateChanged(ItemEvent e) {
        String itemName = ((Checkbox) e.getItemSelectable()).getLabel();
        String state = (e.getStateChange() == ItemEvent.SELECTED) ? "selected" : "deselected";

        // Display the item and its new state
        label.setText(itemName + " was " + state);
    }

    public static void main(String[] args) {
        new ItemEventDemo11(); // Run the demo
    }
}

