package com.example.ms3_group34_ms3version1_tollplaza_sec4_2310269_2312021_2310905_2420525;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class LoginPageController
{
    @javafx.fxml.FXML
    private TextField userIdTF;

    @javafx.fxml.FXML
    private TextField passwordTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void loginBtn(ActionEvent actionEvent) {

        String userId = userIdTF.getText();
        String password = passwordTF.getText();

        if (userId.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Login Error");
            alert.setHeaderText(null);
            alert.setContentText("Please enter your User ID.");
            alert.showAndWait();
            return;
        }

        // Check if Password is empty
        if (password.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Login Error");
            alert.setHeaderText(null);
            alert.setContentText("Please enter your password.");
            alert.showAndWait();
            return;
        }

        // Example Accountant login
        if (userId.equals("3001") && password.equals("1234")) {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Login Successful");
            alert.setHeaderText(null);
            alert.setContentText("Welcome, Accountant!");
            alert.showAndWait();
        }

        else if (userId.equals("4001") && password.equals("1234")) {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Login Successful");
            alert.setHeaderText(null);
            alert.setContentText("Welcome, Traffic Monitoring Officer!");
            alert.showAndWait();
        }

        else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Login Failed");
            alert.setHeaderText(null);
            alert.setContentText("Incorrect User ID or Password.");
            alert.showAndWait();

            passwordTF.clear();
        }
    }

    @javafx.fxml.FXML
    public void createAccBtn(ActionEvent actionEvent) {

        userIdTF.clear();
        passwordTF.clear();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Create Account");
        alert.setHeaderText(null);
        alert.setContentText("Create Account button clicked.");
        alert.showAndWait();
    }
}