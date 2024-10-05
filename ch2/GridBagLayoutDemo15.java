package ch2;

import java.awt.*;

public class GridBagLayoutDemo15 {
    private Frame f;
    private Label headerLabel;
    private Panel controlPanel;

    public GridBagLayoutDemo15() {
        f = new Frame("Java GridBagDemo");
        f.setSize(400, 400);
        f.setLayout(new GridLayout(2, 1));

        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
       
        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());

        f.add(headerLabel);
        f.add(controlPanel);
        f.setVisible(true);
    }

    private void showGridBagLayoutDemo() {
        headerLabel.setText("Layout in action: GridBagLayout");

        Panel panel = new Panel();
        panel.setBackground(Color.darkGray);
        panel.setSize(300, 300);

        GridBagLayout gb = new GridBagLayout();
        panel.setLayout(gb);  // Set GridBagLayout to the panel
        GridBagConstraints gbc = new GridBagConstraints();

        // Adding Button 1 at (0, 0)
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new Button("Button 1"), gbc);

        // Adding Button 2 at (1, 0)
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(new Button("Button 2"), gbc);

        // Adding Button 3 at (0, 1) with additional padding
        gbc.ipady = 20;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new Button("Button 3"), gbc);

        // Adding Button 4 at (1, 1)
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(new Button("Button 4"), gbc);

        // Adding Button 5 at (0, 2), spanning two columns
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        panel.add(new Button("Button 5"), gbc);

        controlPanel.add(panel);  // Add the panel with GridBagLayout to the control panel
        f.setVisible(true);
    }

    public static void main(String[] args) {
        GridBagLayoutDemo15 gridLayoutDemo = new GridBagLayoutDemo15();
        gridLayoutDemo.showGridBagLayoutDemo();
    }
}

