package com.myjavafxapp;

import javafx.animation.ScaleTransition;
import javafx.beans.binding.Bindings;
import javafx.scene.control.Button;
import javafx.util.Duration;

public class CustomButton extends Button {

    // Default constructor required by JavaFX for FXML instantiation
    public CustomButton() {
        super();
        initButton();
    }

    // Constructor with a text parameter, used in the MainController
    public CustomButton(String text) {
        super(text);
        initButton();
    }

    // Initialize button customization (hover effect, width binding)
    private void initButton() {
        // Custom hover effect using scale transition
        setStyle("-fx-font-size: 16px; -fx-background-color: #4CAF50; -fx-text-fill: white;");

        // Scale animation on mouse hover
        setOnMouseEntered(event -> {
            ScaleTransition scale = new ScaleTransition(Duration.millis(150), this);
            scale.setToX(1.1);
            scale.setToY(1.1);
            scale.play();
        });

        setOnMouseExited(event -> {
            ScaleTransition scale = new ScaleTransition(Duration.millis(150), this);
            scale.setToX(1.0);
            scale.setToY(1.0);
            scale.play();
        });

        // Binding button width to the text length
        prefWidthProperty().bind(Bindings.createDoubleBinding(() -> {
            double textWidth = getText().length() * 10; // Rough calculation for text width
            return Math.max(textWidth, 100); // Minimum width of 100px
        }, textProperty()));
    }
}
