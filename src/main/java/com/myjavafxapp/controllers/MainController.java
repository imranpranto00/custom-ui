package com.myjavafxapp.controllers;

import com.myjavafxapp.CustomButton;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class MainController {

    @FXML
    private VBox container; // Ensure this matches the fx:id in the FXML

    public void initialize() {
        // Create and add the custom button to the VBox container
        CustomButton customButton = new CustomButton("Click Me");
        container.getChildren().add(customButton); // Adds the button to the VBox
    }
}
