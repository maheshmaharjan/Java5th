package ch5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JCheckBoxDemo06 implements ItemListener {

    // Declare JCheckBoxes and JLabel
    JCheckBox c1, c2, c3, c4, c5;
    JLabel status;

    public JCheckBoxDemo06() {
        JFrame frame = new JFrame("Checkbox Demo");
        frame.setLayout(new GridLayout(2, 1));
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panels for layout
        JPanel hobbiesPanel = new JPanel(new FlowLayout());
        JPanel statusPanel = new JPanel(new FlowLayout());

        // Create checkboxes for different hobbies
        c1 = new JCheckBox("Singing");
        c2 = new JCheckBox("Dancing");
        c3 = new JCheckBox("Football");
        c4 = new JCheckBox("Basketball");
        c5 = new JCheckBox("Cricket");

        // Create a label for hobbies
        JLabel hobbiesLabel = new JLabel("Hobbies:");

        // Add components to the hobbies panel
        hobbiesPanel.add(hobbiesLabel);
        hobbiesPanel.add(c1);
        hobbiesPanel.add(c2);
        hobbiesPanel.add(c3);
        hobbiesPanel.add(c4);
        hobbiesPanel.add(c5);

        // Create a label to display selected hobbies
        status = new JLabel();

        // Add the status label to the status panel
        statusPanel.add(status);

        // Add panels to the frame
        frame.add(hobbiesPanel);
        frame.add(statusPanel);
        
        // Make the frame visible
        frame.setVisible(true);

        // Register item listeners for the checkboxes
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);
        c5.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        // Initialize strings to hold selected hobbies
        String singing = "", dancing = "", football = "", basketball = "", cricket = "";

        // Check the state of each checkbox and update the strings accordingly
        if (c1.isSelected()) {
            singing = c1.getText();
        }
        if (c2.isSelected()) {
            dancing = c2.getText();
        }
        if (c3.isSelected()) {
            football = c3.getText();
        }
        if (c4.isSelected()) {
            basketball = c4.getText();
        }
        if (c5.isSelected()) {
            cricket = c5.getText();
        }

        // Update the status label to show selected hobbies
        status.setText("Your Hobbies: " + singing + " " + dancing + " " + football + " " + basketball + " " + cricket);
    }

    public static void main(String[] args) {
        // Run the GUI in the Event Dispatch Thread
        SwingUtilities.invokeLater(JCheckBoxDemo06::new);
    }
}

