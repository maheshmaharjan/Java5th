package ch2;

import java.awt.*;
import java.awt.event.*;

public class CheckBoxDemo03 {
    public CheckBoxDemo03() {
        Frame mf = new Frame("Java AWT Examples");
        mf.setSize(600, 400);
        mf.setLayout(new GridLayout(1, 5));
        mf.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        Checkbox cb1 = new Checkbox();
        Checkbox cb2 = new Checkbox("CheckBox 2");
        Checkbox cb3 = new Checkbox("CheckBox 3", true);
        CheckboxGroup cg = new CheckboxGroup();
        Checkbox cb4 = new Checkbox("CheckBox 4", true, cg);
        Checkbox cb5 = new Checkbox("CheckBox 5", cg, false);

        cb1.setLabel("Checkbox 1");
        cb3.setState(false);

        mf.add(cb1);
        mf.add(cb2);
        mf.add(cb3);
        mf.add(cb4);
        mf.add(cb5);
        mf.setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBoxDemo03();
    }
}
