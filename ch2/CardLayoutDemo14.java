package ch2;

import java.awt.*;
import java.awt.event.*;

public class CardLayoutDemo14 implements ActionListener {
    CardLayout card;  
    Frame f;  
    
    public CardLayoutDemo14() {  
        f = new Frame("CardLayout Example");  
        card = new CardLayout();  
        f.setLayout(card); // Setting CardLayout as the layout for the frame

        // Creating buttons for different panels (cards)
        Button b1 = new Button("Card 1");
        Button b2 = new Button("Card 2");
        Button b3 = new Button("Card 3");

        // Creating individual panels for each card
        Panel p1 = new Panel();
        p1.add(b1); // Adding Button to panel 1
        
        Panel p2 = new Panel();
        p2.add(b2); // Adding Button to panel 2
        
        Panel p3 = new Panel();
        p3.add(b3); // Adding Button to panel 3
        
        // Adding panels to the frame with a name for each card
        f.add(p1, "Card 1");
        f.add(p2, "Card 2");
        f.add(p3, "Card 3");

        b1.addActionListener(this);  
        b2.addActionListener(this);  
        b3.addActionListener(this);  
        
        f.setSize(400, 400);  
        f.setVisible(true);  
    }  
    
    public void actionPerformed(ActionEvent e) {  
        card.next(f); // Switch to the next card when any button is clicked
    }  
    
    public static void main(String[] args) {  
        new CardLayoutDemo14();  
    }  
}
