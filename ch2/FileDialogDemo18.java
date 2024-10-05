package ch2;

import java.awt.*;
import java.awt.event.*;

public class FileDialogDemo18 {
    public FileDialogDemo18() {
        Frame f = new Frame("File Dialog Demo");
        f.setLayout(new FlowLayout());
        f.setSize(300, 200);
        f.setVisible(true);

        Button b = new Button("Select File");
        f.add(b);
        
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                FileDialog fd = new FileDialog(f, "Select a file", FileDialog.LOAD);
                fd.setVisible(true);
                String directory = fd.getDirectory();
                String filename = fd.getFile();
                System.out.println("Selected file: " + directory + filename);
            }
        });

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new FileDialogDemo18();
    }
}

