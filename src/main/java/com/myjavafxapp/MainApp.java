package com.myjavafxapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox; // Import VBox instead of AnchorPane
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML layout
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/myjavafxapp/main.fxml"));
        
        // Load the FXML file as VBox instead of AnchorPane
        VBox root = loader.load();

        // Set up the scene
        Scene scene = new Scene(root, 600, 400);
        scene.getStylesheets().add(getClass().getResource("/com/myjavafxapp/styles/styles.css").toExternalForm());
        
        primaryStage.setTitle("Custom JavaFX Control Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
