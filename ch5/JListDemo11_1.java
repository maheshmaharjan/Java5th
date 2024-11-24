package ch5;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.List;

public class JListDemo11_1 extends JFrame implements ListSelectionListener {
    private JList<String> cityList;
    private JLabel statusLabel;
    private JScrollPane scrollPane;

    public JListDemo11_1() {
        // Frame setup
        setTitle("JList Multi-Select Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null); // Center the frame

        // Initialize list data
        String[] cities = {"New York", "Chicago", "Houston", "Paris", "Los Angeles", "Kathmandu", "New Delhi"};

        // Create JList with data
        cityList = new JList<>(cities);
        cityList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // Enable multi-select
        
        cityList.addListSelectionListener(this); // Register ListSelectionListener

        // Wrap JList inside a JScrollPane
        scrollPane = new JScrollPane(cityList);
        scrollPane.setPreferredSize(new Dimension(200, 100));

        // Create status label to display selected cities
        statusLabel = new JLabel("Choose cities");

        // Add components to the frame
        add(scrollPane);
        add(statusLabel);

        // Make the frame visible
        setVisible(true);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        // Ignore intermediate events
        if (!e.getValueIsAdjusting()) {
            // Get all selected values
            List<String> selectedCities = cityList.getSelectedValuesList();
            
            if (!selectedCities.isEmpty()) {
                statusLabel.setText("Selected: " + String.join(", ", selectedCities));
            } else {
                statusLabel.setText("Choose cities");
            }
        }
    }

    public static void main(String[] args) {
        // Run the GUI in the Event Dispatch Thread
        SwingUtilities.invokeLater(JListDemo11_1::new);
    }
}
