package ch2;

import java.awt.*;
import java.awt.event.*;

public class CardLayoutDemo13 {
    public CardLayoutDemo13() {
        Frame frame = new Frame("CardLayout Example");
        CardLayout cardLayout = new CardLayout();  // Initialize CardLayout
        frame.setLayout(cardLayout);    // Set the layout of the frame to CardLayout

        // Create two panels (cards)
        Panel card1 = new Panel();
        card1.add(new Label("This is the First Card"));
        Button nextButton1 = new Button("Next");
        card1.add(nextButton1);

        Panel card2 = new Panel();
        card2.add(new Label("This is the Second Card"));
        Button nextButton2 = new Button("Back");
        card2.add(nextButton2);

        // Add the panels to the frame
        frame.add(card1, "Card 1");
        frame.add(card2, "Card 2");

        // Set size and visibility
        frame.setSize(300, 200);
        frame.setVisible(true);

        // Action listener for the buttons to switch between cards
        nextButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(frame);  // Switch to the next card (Card 2)
            }
        });

        nextButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.previous(frame);  // Switch back to the previous card (Card 1)
            }
        });
    }

    public static void main(String[] args) {
        new CardLayoutDemo13();  // Create and run the CardLayout demo
    }
}

