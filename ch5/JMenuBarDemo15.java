package ch5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JMenuBarDemo15 extends JFrame {
    private JMenuBar menuBar;
    private JMenu fileMenu, editMenu, viewMenu;
    private JMenuItem newItem, openItem, saveItem, saveAsItem, exitItem;
    private JCheckBoxMenuItem copyItem, cutItem;
    private JRadioButtonMenuItem fullScreenItem, halfScreenItem;
    private JSeparator separator;
    private JTextArea textArea;

    public JMenuBarDemo15() {
        // Frame setup
        setTitle("Swing Menu Demo");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);

        // Initialize menu bar
        menuBar = new JMenuBar();

        // Initialize menus
        fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + F
        editMenu = new JMenu("Edit");
        editMenu.setMnemonic(KeyEvent.VK_E); // Alt + E
        viewMenu = new JMenu("View");
        viewMenu.setMnemonic(KeyEvent.VK_V); // Alt + V

        // Initialize menu items for File menu
        newItem = new JMenuItem("New");
        newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK)); // Ctrl + N

        openItem = new JMenuItem("Open");
        openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK)); // Ctrl + O

        saveItem = new JMenuItem("Save");
        saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK)); // Ctrl + S

        saveAsItem = new JMenuItem("Save As");

        exitItem = new JMenuItem("Exit");
        exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK)); // Ctrl + Q

        // Initialize separator
        separator = new JSeparator();

        // Add menu items to File menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(saveAsItem);
        fileMenu.add(separator);
        fileMenu.add(exitItem);

        // Initialize checkbox menu items for Edit menu
        copyItem = new JCheckBoxMenuItem("Copy");
        cutItem = new JCheckBoxMenuItem("Cut");

        // Add checkbox menu items to Edit menu
        editMenu.add(copyItem);
        editMenu.add(cutItem);

        // Initialize radio button menu items for View menu
        fullScreenItem = new JRadioButtonMenuItem("Full Screen");
        halfScreenItem = new JRadioButtonMenuItem("Half Screen");

        // Group the radio button menu items to ensure mutual exclusivity
        ButtonGroup viewGroup = new ButtonGroup();
        viewGroup.add(fullScreenItem);
        viewGroup.add(halfScreenItem);

        // Add radio button menu items to View menu
        viewMenu.add(fullScreenItem);
        viewMenu.add(halfScreenItem);

        // Add menus to menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);

        // Set the menu bar to the frame
        setJMenuBar(menuBar);

        // Initialize text area and add it to the frame
        textArea = new JTextArea();
        textArea.setComponentPopupMenu(createPopupMenu()); // Attach popup menu
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Register action listeners for File menu items
        newItem.addActionListener(e -> JOptionPane.showMessageDialog(this, "New File Created!"));
        openItem.addActionListener(e -> JOptionPane.showMessageDialog(this, "Open File Dialog"));
        saveItem.addActionListener(e -> JOptionPane.showMessageDialog(this, "File Saved!"));
        saveAsItem.addActionListener(e -> JOptionPane.showMessageDialog(this, "Save As Dialog"));
        exitItem.addActionListener(e -> System.exit(0));

        // Register item listeners for Edit menu items
        copyItem.addItemListener(e -> {
            if (copyItem.isSelected()) {
                JOptionPane.showMessageDialog(this, "Copy Enabled");
            } else {
                JOptionPane.showMessageDialog(this, "Copy Disabled");
            }
        });

        cutItem.addItemListener(e -> {
            if (cutItem.isSelected()) {
                JOptionPane.showMessageDialog(this, "Cut Enabled");
            } else {
                JOptionPane.showMessageDialog(this, "Cut Disabled");
            }
        });

        // Register action listeners for View menu items
        fullScreenItem.addActionListener(e -> {
            if (fullScreenItem.isSelected()) {
                dispose(); // Dispose current frame
                setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize the frame
                setVisible(true);
            }
        });

        halfScreenItem.addActionListener(e -> {
            if (halfScreenItem.isSelected()) {
                dispose();
                setExtendedState(JFrame.NORMAL);
                setSize(800, 600); // Set to half-screen size
                setLocationRelativeTo(null);
                setVisible(true);
            }
        });
    }

    /**
     * Creates and returns a JPopupMenu with custom menu items.
     *
     * @return JPopupMenu instance
     */
    private JPopupMenu createPopupMenu() {
        JPopupMenu popup = new JPopupMenu();

        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");
        JMenuItem selectAll = new JMenuItem("Select All");

        // Add menu items to popup menu
        popup.add(copy);
        popup.add(paste);
        popup.add(selectAll);
        
        // Add action listeners for popup menu items
        copy.addActionListener(e -> {
            textArea.copy();
        });

        paste.addActionListener(e -> {
            textArea.paste();
        });

        selectAll.addActionListener(e -> {
            textArea.selectAll();
        });

        return popup;
    }

    public static void main(String[] args) {
        // Set Look and Feel to system default for better UI consistency
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Create and display the GUI on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> new JMenuBarDemo15());
    }
}

