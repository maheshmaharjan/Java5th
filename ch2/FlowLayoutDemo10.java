package ch2;

import java.awt.*;

class FlowLayoutDemo10 {
    public FlowLayoutDemo10 () {
        // Create a Frame (window)
        Frame f = new Frame();

        // Set FlowLayout with left alignment and 10-pixel gaps
        f.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        // Add components: a label, button, and text fields
        Label l = new Label("first");
        Button b = new Button("button");
        TextField t = new TextField("Textfield");
        TextField t1 = new TextField("Textfield1");
        TextField t2 = new TextField("Textfield2");
        TextField t3 = new TextField("Textfield3");
        TextField t4 = new TextField("Textfield4");
        TextField t5 = new TextField("Textfield5");

        // Add components to the Frame
        f.add(l);
        f.add(b);
        f.add(t);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);

        // Set Frame size and visibility
        f.setSize(400, 400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutDemo10();
    }
}

