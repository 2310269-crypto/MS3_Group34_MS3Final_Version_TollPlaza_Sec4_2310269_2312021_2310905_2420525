package com.example.ms3_group34_ms3version1_tollplaza_sec4_2310269_2312021_2310905_2420525;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class CreateAccountController
{
    @javafx.fxml.FXML
    private TextField phoneTF;
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private TextField emailTF;
    @javafx.fxml.FXML
    private TextField nidTF;
    @javafx.fxml.FXML
    private DatePicker dobDP;
    @javafx.fxml.FXML
    private TextField passTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void createAccBtn(ActionEvent actionEvent) {

        String name = nameTF.getText().trim();
        String phone = phoneTF.getText().trim();
        String email = emailTF.getText().trim();
        String nid = nidTF.getText().trim();
        String password = passTF.getText();
        LocalDate dob = dobDP.getValue();

        // Check if any field is empty
        if (name.isEmpty() ||
                phone.isEmpty() ||
                email.isEmpty() ||
                nid.isEmpty() ||
                password.isEmpty() ||
                dob == null) {

            showAlert(
                    Alert.AlertType.ERROR,
                    "Invalid Input",
                    "Please fill in all fields."
            );
            return;
        }

        // Validate name
        if (!name.matches("[a-zA-Z ]+")) {
            showAlert(
                    Alert.AlertType.ERROR,
                    "Invalid Name",
                    "Name should contain only letters."
            );
            return;
        }

        // Validate phone number
        if (!phone.matches("\\d{11}")) {
            showAlert(
                    Alert.AlertType.ERROR,
                    "Invalid Phone Number",
                    "Phone number must contain exactly 11 digits."
            );
            return;
        }

        if (!email.contains("@") || !email.contains(".")) {
            showAlert(
                    Alert.AlertType.ERROR,
                    "Invalid Email",
                    "Please enter a valid email address."
            );
            return;
        }

        if (!nid.matches("\\d+")) {
            showAlert(
                    Alert.AlertType.ERROR,
                    "Invalid NID",
                    "NID must contain only numbers."
            );
            return;
        }

        if (dob.isAfter(LocalDate.now())) {
            showAlert(
                    Alert.AlertType.ERROR,
                    "Invalid Date of Birth",
                    "Date of birth cannot be in the future."
            );
            return;
        }

        if (password.length() < 6) {
            showAlert(
                    Alert.AlertType.ERROR,
                    "Invalid Password",
                    "Password must contain at least 6 characters."
            );
            return;
        }

        showAlert(
                Alert.AlertType.INFORMATION,
                "Account Created",
                "Account created successfully!"
        );

        nameTF.clear();
        phoneTF.clear();
        emailTF.clear();
        nidTF.clear();
        passTF.clear();
        dobDP.setValue(null);
    }

    private void showAlert(
            Alert.AlertType type,
            String title,
            String message) {

        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}