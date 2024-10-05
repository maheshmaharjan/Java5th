package ch2;

import java.awt.*;
import java.awt.event.*;

public class ButtonDemo02 {
    public ButtonDemo02() {
        Frame f = new Frame("Button Example");
        Button button = new Button("Click Me");
        Label mylabel = new Label();

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button was clicked!");
                mylabel.setText("Button");
            }
        });

        f.add(button);
        f.add(mylabel);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        f.setSize(300, 200);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonDemo02();
    }
}

