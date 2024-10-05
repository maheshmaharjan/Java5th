package ch2;

import java.awt.*;

public class TextFieldDemo08 {
    public TextFieldDemo08() {
        Label l1 = new Label("TextField 1");
        Label l2 = new Label("TextField 2");
        Label l3 = new Label("TextField 3");
        Label l4 = new Label("TextField 4");
        
        TextField tx1 = new TextField();  // Default TextField
        TextField tx2 = new TextField(25);  // TextField with specified width
        TextField tx3 = new TextField("username", 20);  // TextField initialized with text and width
        TextField tx4 = new TextField("password", 20);  // TextField for password
        
        Frame f = new Frame();
        Panel p = new Panel(new GridLayout(4, 2));
        p.setPreferredSize(new Dimension(300, 200));

        p.add(l1);
        p.add(tx1);
        p.add(l2);
        p.add(tx2);
        p.add(l3);
        p.add(tx3);
        p.add(l4);
        p.add(tx4);

        f.add(p);
        tx1.setText("Name");
        tx2.setText("Address");

        // Display the current text of the first two text fields
        System.out.println("First TextField: " + tx1.getText());
        System.out.println("Second TextField: " + tx2.getText());

        // Select and display a portion of text from the third TextField
        tx3.select(2, 5);
        System.out.println("Selected text of third TextField: " + tx3.getSelectedText());

        // Make the first TextField non-editable and check its status
        tx1.setEditable(false);
        System.out.println(tx1.isEditable() ? "Editable" : "Not Editable");

        // Set an echo character for the fourth TextField and display its status
        tx4.setEchoChar('*');
        System.out.println("Echo character: " + tx4.getEchoChar());
        System.out.println(tx4.echoCharIsSet() ? "Echo is set" : "Echo is not set");

        f.setSize(400, 400);
        f.setLayout(new FlowLayout());
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new TextFieldDemo08();
    }
}

