package ch1;
// Create a simple Java AWT application that uses a Panel to group a label and a text field. When the user types in the text field and clicks a button, the label should display the entered text.

import java.awt.*;
import java.awt.event.*;

public class PanelExample04 {
    public static void main(String[] args) {
        Frame frame = new Frame("Panel Example");
        Panel panel = new Panel();

        Label label = new Label("Enter Text:");
        TextField textField = new TextField(20);
        Button button = new Button("Submit");

        frame.setSize(400, 150);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.add(panel);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

        panel.add(label);
        panel.add(textField);
        panel.add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                label.setText(textField.getText());
            }
        });
    }
}


