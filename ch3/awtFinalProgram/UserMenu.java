package ch3.awtFinalProgram;

import java.awt.*;
import java.awt.event.*;

public class UserMenu {
    private Menu userMenu;
    private AWTFinalProgram mainApp;
    private Panel userPanel;

    public UserMenu(AWTFinalProgram app) {
        this.mainApp = app;
        userMenu = new Menu("User");

        MenuItem userItem = new MenuItem("Go to User Form");
        userMenu.add(userItem);

        userItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainApp.updateHeader("User Form");
                mainApp.showUserForm();
            }
        });

        // Initialize User Panel
        userPanel = new Panel();
        userPanel.setLayout(new GridLayout(7, 2, 5, 5));

        // Firstname
        Label firstNameLabel = new Label("First Name:");
        TextField firstNameField = new TextField(20);
        firstNameField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                String firstName = firstNameField.getText().trim();
                if (!firstName.isEmpty()) {
                    mainApp.updateHeader("Hello " + firstName);
                }
            }
        });

        // Lastname
        Label lastNameLabel = new Label("Last Name:");
        TextField lastNameField = new TextField(20);

        // Gender
        Label genderLabel = new Label("Gender:");
        Panel genderPanel = new Panel(new FlowLayout());
        CheckboxGroup genderGroup = new CheckboxGroup();
        Checkbox maleCheckbox = new Checkbox("Male", genderGroup, false);
        Checkbox femaleCheckbox = new Checkbox("Female", genderGroup, false);
        genderPanel.add(maleCheckbox);
        genderPanel.add(femaleCheckbox);

        // Hobbies
        Label hobbiesLabel = new Label("Hobbies:");
        Panel hobbiesPanel = new Panel(new FlowLayout());
        Checkbox readingCheckbox = new Checkbox("Reading");
        Checkbox travelingCheckbox = new Checkbox("Traveling");
        Checkbox codingCheckbox = new Checkbox("Coding");
        hobbiesPanel.add(readingCheckbox);
        hobbiesPanel.add(travelingCheckbox);
        hobbiesPanel.add(codingCheckbox);

        // Country
        Label countryLabel = new Label("Country:");
        Choice countryChoice = new Choice();
        countryChoice.add("USA");
        countryChoice.add("Canada");
        countryChoice.add("UK");
        countryChoice.add("Australia");
        countryChoice.add("Other");

        // Remarks
        Label remarksLabel = new Label("Remarks:");
        TextArea remarksArea = new TextArea(3, 20);

        // Submit Button
        Button submitButton = new Button("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = firstNameField.getText().trim();
                String lastName = lastNameField.getText().trim();
                String gender = genderGroup.getSelectedCheckbox() != null ? genderGroup.getSelectedCheckbox().getLabel() : "Not selected";
                String hobbies = "";
                if (readingCheckbox.getState()) hobbies += "Reading ";
                if (travelingCheckbox.getState()) hobbies += "Traveling ";
                if (codingCheckbox.getState()) hobbies += "Coding ";
                String country = countryChoice.getSelectedItem();
                String remarks = remarksArea.getText().trim();

                String userInfo = "<html>"
                        + "First Name: " + firstName + "<br>"
                        + "Last Name: " + lastName + "<br>"
                        + "Gender: " + gender + "<br>"
                        + "Hobbies: " + hobbies + "<br>"
                        + "Country: " + country + "<br>"
                        + "Remarks: " + remarks
                        + "</html>";

                mainApp.updateStatus(userInfo);
            }
        });

        // Add components to userPanel
        userPanel.add(firstNameLabel);
        userPanel.add(firstNameField);
        userPanel.add(lastNameLabel);
        userPanel.add(lastNameField);
        userPanel.add(genderLabel);
        userPanel.add(genderPanel);
        userPanel.add(hobbiesLabel);
        userPanel.add(hobbiesPanel);
        userPanel.add(countryLabel);
        userPanel.add(countryChoice);
        userPanel.add(remarksLabel);
        userPanel.add(remarksArea);
        userPanel.add(new Label()); // Empty label for spacing
        userPanel.add(submitButton);

        mainApp.addComponentToMainPanel(userPanel, "User");
    }

    public Menu getMenu() {
        return userMenu;
    }
}

