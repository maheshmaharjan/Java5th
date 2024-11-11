package ch3;

import java.awt.*;
import java.awt.event.*;

public class ContainerEventDemo09 implements ContainerListener {

    private Frame frame;
    private Panel panel;
    private Button addButton, removeButton;
    private Label label;

    public ContainerEventDemo09() {
        // Create a frame
        frame = new Frame("ContainerEvent Example");
        frame.setSize(400, 200);
        frame.setLayout(new BorderLayout());

        // Create a panel and add container listener
        panel = new Panel();
        panel.setLayout(new FlowLayout());
        panel.addContainerListener(this); // Add container listener to panel

        // Create buttons and label
        addButton = new Button("Add Label");
        removeButton = new Button("Remove Label");
        label = new Label("Hello, I'm a label!");

        // Add action listener for addButton to add a label to the panel
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.add(label);   // Add label to panel
                panel.revalidate(); // Refresh panel layout
                panel.repaint();    // Repaint panel
            }
        });

        // Add action listener for removeButton to remove the label from the panel
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.remove(label); // Remove label from panel
                panel.revalidate();  // Refresh panel layout
                panel.repaint();     // Repaint panel
            }
        });

        // Add buttons and panel to the frame
        frame.add(addButton, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.add(removeButton, BorderLayout.SOUTH);

        // Add window listener to close the window
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true); // Show the frame
    }

    // ContainerListener method to handle components being added
    @Override
    public void componentAdded(ContainerEvent e) {
        System.out.println("Component added: " + e.getChild().getClass().getName());
    }

    // ContainerListener method to handle components being removed
    @Override
    public void componentRemoved(ContainerEvent e) {
        System.out.println("Component removed: " + e.getChild().getClass().getName());
    }

    public static void main(String[] args) {
        new ContainerEventDemo09(); // Run the demo
    }
}

