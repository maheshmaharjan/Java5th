package ch5;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class JLabelTextDemo01 {
    public JLabelTextDemo01() {
        // Create the main frame
        JFrame frame = new JFrame("JLabel Text Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a JLabel with text
        JLabel textLabel = new JLabel("Swing is more powerful than AWT");
        
        textLabel.setFont(new Font("Arial", Font.BOLD, 16)); // Set custom font
        // textLabel.setHorizontalAlignment(SwingConstants.CENTER); // Center alignment

        // textLabel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Add padding around the label

        // Create a solid red border
        Border redBorder = BorderFactory.createLineBorder(Color.RED, 3);

        // Create padding
        Border padding = BorderFactory.createEmptyBorder(20, 20, 20, 20);

        // Combine padding and solid border
        Border compoundBorder = BorderFactory.createCompoundBorder(redBorder, padding);

         // Set the combined border to the label
         textLabel.setBorder(compoundBorder);
        
        // Add the label to the frame's content pane
        frame.add(textLabel, BorderLayout.CENTER);
        
        frame.pack(); // Adjust frame size based on content
        frame.setLocationRelativeTo(null); // Center the frame on screen
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        // Ensure GUI creation runs on the Event Dispatch Thread
        SwingUtilities.invokeLater(JLabelTextDemo01::new);

        // new JLabelTextDemo01();
    }
}

// SwingUtilities.invokeLater(JLabelTextDemo::new);
// plays a crucial role in ensuring that your Swing application's user interface (UI) is created and updated in a thread-safe manner. 

// SwingUtilities.invokeLater is a static method provided by the Swing framework in Java. It schedules a task (a piece of code) to be executed on the Event Dispatch Thread (EDT).

// Purpose: Swing is not thread-safe, meaning that its components should only be created, modified, or queried on a single, dedicated thread known as the Event Dispatch Thread (EDT). Performing these operations on other threads can lead to unpredictable behavior, race conditions, and hard-to-debug issues.

// JLabelTextDemo::new is a method reference in Java, introduced in Java 8. Specifically, it's a reference to the constructor of the JLabelTextDemo class. 
// Equivalent Lambda Expression:: () -> new JLabelTextDemo()

// Purpose: By using JLabelTextDemo::new, you're creating a Runnable that, when executed, will instantiate a new JLabelTextDemo object. This effectively runs the constructor of JLabelTextDemo on the EDT.

// Event Dispatch Thread (EDT)
// The Event Dispatch Thread (EDT) is a special thread in Java responsible for handling all event-driven tasks in Swing applications. These tasks include:

// Processing User Input: Handling actions like button clicks, mouse movements, and keyboard inputs.
// Updating the UI: Rendering components, repainting the interface, and modifying UI elements.
// Executing Runnable Tasks: Running code that interacts with Swing components.

// How Does the EDT Work?
// When you create a Swing application, the Java Runtime Environment (JRE) initializes the EDT. Here's how it operates:

// Initialization: The EDT starts running when the first Swing component is created or when SwingUtilities.invokeLater is called.
// Event Loop: The EDT enters an event loop, continuously waiting for events (like user actions or system triggers) and dispatching them to appropriate handlers.
// Task Execution: When an event occurs, the EDT executes the associated event handler (e.g., actionPerformed for a button click) on the same thread, ensuring that UI updates happen sequentially.