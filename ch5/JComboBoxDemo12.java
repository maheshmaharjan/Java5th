package ch5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JComboBoxDemo12 extends JFrame implements ActionListener {
    private JComboBox<String> comboBox;
    private JLabel selectionLabel;
    private JTextField addItemField;
    private JButton addButton;

    public JComboBoxDemo12() {
        setTitle("JComboBox Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new BorderLayout(10, 10));
        setLocationRelativeTo(null); // Center the frame

        // Initialize components
        String[] initialItems = {"Morning", "Afternoon", "Evening"};
        comboBox = new JComboBox<>(initialItems);
        comboBox.setSelectedIndex(-1); // No selection initially
        comboBox.addActionListener(this); // Register ActionListener

        selectionLabel = new JLabel("Your selection: None");
        selectionLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Panel for adding new items
        JPanel addPanel = new JPanel(new FlowLayout());
        addItemField = new JTextField(10);
        addButton = new JButton("Add Item");
        addButton.addActionListener(this); // Register ActionListener for addButton
        addPanel.add(new JLabel("New Item:"));
        addPanel.add(addItemField);
        addPanel.add(addButton);

        // Add components to the frame
        add(comboBox, BorderLayout.NORTH);
        add(selectionLabel, BorderLayout.CENTER);
        add(addPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle JComboBox selection
        if (e.getSource() == comboBox) {
            String selected = (String) comboBox.getSelectedItem();
            if (selected != null) {
                selectionLabel.setText("Your selection: " + selected);
            } else {
                selectionLabel.setText("Your selection: None");
            }
        }

        // Handle Add Item button click
        if (e.getSource() == addButton) {
            String newItem = addItemField.getText().trim();
            if (!newItem.isEmpty()) {
                comboBox.addItem(newItem);
                addItemField.setText(""); // Clear the text field
                JOptionPane.showMessageDialog(this, "Item \"" + newItem + "\" added to the combo box.");
            } else {
                JOptionPane.showMessageDialog(this, "Please enter a valid item.", "Invalid Input", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        // Run the GUI in the Event Dispatch Thread
        SwingUtilities.invokeLater(JComboBoxDemo12::new);
    }
}

