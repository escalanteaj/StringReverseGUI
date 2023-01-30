package com.example.reversestringapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ReverseStringAppController {

    ReverseStringApp app = new ReverseStringApp();

    @FXML
    private TextField textField;
    @FXML
    private Button reverseButton;
    @FXML
    private Label resultLabel;

    public void reversePress(ActionEvent event) {

        String string = textField.getText().toString();
        String reversedString = app.reverseString(string);

        resultLabel.setText(reversedString);
    }

}