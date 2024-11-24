package ch5;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class JTableDemo13 extends JFrame implements ListSelectionListener {
    private JTable table;
    private JLabel statusLabel;

    public JTableDemo13() {
        // Frame setup
        setTitle("JTable Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Center the frame

        // Sample data for the table
        String[] columnNames = {"Name", "Address", "Phone Number"};
        Object[][] data = {
            {"Ram", "Kathmandu", "9841111111"},
            {"Shyam", "Lalitpur", "9841222222"},
            {"Hari", "Pokhara", "9841333333"},
            {"Joshna", "Biratnagar", "9841444444"},
            {"Nikhil", "Birgunj", "9841555555"},
            {"Narayan", "Bhairawa", "9841666666"},
            {"Pratik", "Nepalgunj", "9841777777"},
            {"Shanti", "Chitwan", "9841888888"},
            {"Bishal", "Dhangadi", "9841999999"},
            {"Madhav", "Argakhanchi", "9841234567"}
        };

        // Create JTable with data and column names
        table = new JTable(data, columnNames);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Set selection mode

        // Register ListSelectionListener to handle row selection
        table.getSelectionModel().addListSelectionListener(this);

        // Wrap JTable inside JScrollPane for scrolling
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(200, 200)); // Set preferred size

        // Create a label to display selected row information
        statusLabel = new JLabel("Select a row to see details.");
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Add components to the frame
        add(scrollPane, BorderLayout.CENTER);
        add(statusLabel, BorderLayout.SOUTH);

        // Make the frame visible
        setVisible(true);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                String name = table.getValueAt(selectedRow, 0).toString();
                String address = table.getValueAt(selectedRow, 1).toString();
                String phone = table.getValueAt(selectedRow, 2).toString();
                statusLabel.setText("Selected: " + name + ", " + address + ", " + phone);
            } else {
                statusLabel.setText("No row selected.");
            }
        }
    }

    public static void main(String[] args) {
        // Run the GUI in the Event Dispatch Thread
        SwingUtilities.invokeLater(JTableDemo13::new);
    }
}

