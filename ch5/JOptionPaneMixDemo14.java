package ch5;

import javax.swing.JOptionPane;

public class JOptionPaneMixDemo14 {
    public JOptionPaneMixDemo14() {
        // Step 1: Welcome Message
        JOptionPane.showMessageDialog(null, "Welcome to the Comprehensive JOptionPane Demo!", "Welcome", JOptionPane.INFORMATION_MESSAGE);

        // Step 2: Input Dialog to get user's age
        String ageInput = JOptionPane.showInputDialog(null, "Enter your age:", "Age Input", JOptionPane.QUESTION_MESSAGE);
        if (ageInput == null) {
            JOptionPane.showMessageDialog(null, "Age input canceled.", "Canceled", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Validate age input
        int age;
        try {
            age = Integer.parseInt(ageInput.trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid age entered.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Step 3: Confirmation Dialog based on age
        if (age >= 18) {
            int confirm = JOptionPane.showConfirmDialog(null, "You are eligible to vote. Do you want to continue?", "Eligibility Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (confirm == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Thank you for confirming.", "Thank You", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Process canceled.", "Canceled", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "You are not eligible to vote.", "Eligibility Status", JOptionPane.INFORMATION_MESSAGE);
        }

        // Step 4: Option Dialog for feedback
        Object[] feedbackOptions = {"Good", "Average", "Bad"};
        int feedbackChoice = JOptionPane.showOptionDialog(null, "How was your experience with this demo?", "Feedback",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, feedbackOptions, feedbackOptions[0]);

        // Handle feedback
        if (feedbackChoice >= 0 && feedbackChoice < feedbackOptions.length) {
            JOptionPane.showMessageDialog(null, "Thank you for your feedback: " + feedbackOptions[feedbackChoice], "Feedback Received", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No feedback received.", "Info", JOptionPane.INFORMATION_MESSAGE);
        }

        // Step 5: Exit Message
        JOptionPane.showMessageDialog(null, "Goodbye!", "Exit", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new JOptionPaneMixDemo14();
    }
}

