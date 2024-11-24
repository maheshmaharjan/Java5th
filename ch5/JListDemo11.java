package ch5;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class JListDemo11 extends JFrame implements ListSelectionListener {
    private JList<String> cityList;
    private JLabel statusLabel;
    private JScrollPane scrollPane;

    public JListDemo11() {
        // Frame setup
        setTitle("JList Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 300);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null); // Center the frame

        // Initialize list data
        String[] cities = {"New York", "Chicago", "Houston", "Paris", "Los Angeles", "Kathmandu", "New Delhi"};

        // Create JList with data
        cityList = new JList<>(cities);
        cityList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Set selection mode
        cityList.addListSelectionListener(this); // Register ListSelectionListener

        // Wrap JList inside a JScrollPane
        scrollPane = new JScrollPane(cityList);
        scrollPane.setPreferredSize(new Dimension(150, 90));

        // Create status label to display selected city
        statusLabel = new JLabel("Choose a city");

        // Add components to the frame
        add(scrollPane);
        add(statusLabel);

        // Make the frame visible
        setVisible(true);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        // Ignore extra messages
        if (!e.getValueIsAdjusting()) {
            String selectedCity = cityList.getSelectedValue();
            if (selectedCity != null) {
                statusLabel.setText("Current Selection: " + selectedCity);
            } else {
                statusLabel.setText("Choose a city");
            }
        }
    }

    public static void main(String[] args) {
        // Run the GUI in the Event Dispatch Thread
        SwingUtilities.invokeLater(JListDemo11::new);
    }
}

