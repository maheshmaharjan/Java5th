package ch5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButtonDemo08 implements ActionListener {
    private JLabel label; // Label to display the selected option

    public JRadioButtonDemo08() {
        JFrame frame = new JFrame("JRadioButton Demo");
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create radio buttons for options
        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");

        // Group the radio buttons
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        // Create a label to display the selected gender
        label = new JLabel("Select your gender:");

        // Add components to the frame
        frame.add(label);
        frame.add(maleButton);
        frame.add(femaleButton);

        // Make the frame visible
        frame.setVisible(true);

        // Add action listeners to the radio buttons
        maleButton.addActionListener(this);
        femaleButton.addActionListener(this);

        // Set action commands explicitly (optional, default is button text)
        // maleButton.setActionCommand("Male from setActionCommand");
        // femaleButton.setActionCommand("Female from setActionCommand");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // Update the label based on the selected radio button
        label.setText("You selected: " + ae.getActionCommand());

        // The method getActionCommand() is part of the ActionEvent class in Java. It retrieves a string that represents the action command associated with the event source.
    }

    public static void main(String[] args) {
        // Run the GUI in the Event Dispatch Thread
        SwingUtilities.invokeLater(JRadioButtonDemo08::new);
    }
}
