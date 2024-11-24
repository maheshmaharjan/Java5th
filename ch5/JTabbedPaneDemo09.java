package ch5;

import javax.swing.*;
import java.awt.*;

// Main class demonstrating JTabbedPane
public class JTabbedPaneDemo09 {
    public JTabbedPaneDemo09() {
        JFrame frame = new JFrame("JTabbedPane Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Create an instance of JTabbedPane
        JTabbedPane jtp = new JTabbedPane();

        // Add tabs with associated panels
        jtp.addTab("Cities", new CitiesPanel());
        jtp.addTab("Colors", new ColorPanel());
        jtp.addTab("Flavors", new FlavorPanel());

        // Add the tabbed pane to the frame
        frame.add(jtp);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JTabbedPaneDemo09::new);
    }
}

// Panel for Cities tab
class CitiesPanel extends JPanel {
    public CitiesPanel() {
        setLayout(new FlowLayout());
        // Add buttons representing different cities
        JButton b1 = new JButton("New York");
        JButton b2 = new JButton("London");
        JButton b3 = new JButton("Hong Kong");
        JButton b4 = new JButton("Tokyo");

        // Add buttons to the panel
        add(b1); add(b2); add(b3); add(b4);
    }
}

// Panel for Colors tab
class ColorPanel extends JPanel {
    public ColorPanel() {
        setLayout(new FlowLayout());
        // Add checkboxes for colors
        JCheckBox cb1 = new JCheckBox("Red");
        JCheckBox cb2 = new JCheckBox("Green");
        JCheckBox cb3 = new JCheckBox("Blue");

        // Add checkboxes to the panel
        add(cb1); add(cb2); add(cb3);
    }
}

// Panel for Flavors tab
class FlavorPanel extends JPanel {
    public FlavorPanel() {
        setLayout(new FlowLayout());
        // Create a JComboBox for flavor options
        JComboBox<String> jcb = new JComboBox<>();
        jcb.addItem("Vanilla");
        jcb.addItem("Chocolate");
        jcb.addItem("Strawberry");

        // Add JComboBox to the panel
        add(jcb);
    }
}

