module com.myjavafxapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    exports com.myjavafxapp;
    opens com.myjavafxapp.controllers to javafx.fxml;  // This line allows FXML to access the controller
}
