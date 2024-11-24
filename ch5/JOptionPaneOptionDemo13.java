package ch5;

import javax.swing.JOptionPane;

public class JOptionPaneOptionDemo13 {
    public JOptionPaneOptionDemo13() {
        // Define custom options
        Object[] options = {"Save", "Don't Save", "Cancel"};
        
        // Display an option dialog
        int choice = JOptionPane.showOptionDialog(null, "Do you want to save changes before exiting?", "Save Confirmation",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        // Handle the user's choice
        switch (choice) {
            case 0:
                JOptionPane.showMessageDialog(null, "Changes saved.", "Info", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Changes not saved.", "Info", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Exit canceled.", "Info", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "No option selected.", "Info", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }

    public static void main(String[] args) {
        new JOptionPaneOptionDemo13();
    }
}

