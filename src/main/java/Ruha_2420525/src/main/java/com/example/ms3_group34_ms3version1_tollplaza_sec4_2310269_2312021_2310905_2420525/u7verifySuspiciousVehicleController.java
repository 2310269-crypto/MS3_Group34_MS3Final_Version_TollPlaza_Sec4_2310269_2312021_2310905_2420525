package com.example.ms3_group34_ms3version1_tollplaza_sec4_2310269_2312021_2310905_2420525;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class u7verifySuspiciousVehicleController {
    public void setDriverNameTF(TextField driverNameTF) {
        this.driverNameTF = driverNameTF;
    }

    public void setVehicleTypeTF(TextField vehicleTypeTF) {
        this.vehicleTypeTF = vehicleTypeTF;
    }

    public void setVehicleLicenseNoTF(TextField vehicleLicenseNoTF) {
        this.vehicleLicenseNoTF = vehicleLicenseNoTF;
    }

    public void setDriverLicenseNoTF(TextField driverLicenseNoTF) {
        this.driverLicenseNoTF = driverLicenseNoTF;
    }

    @javafx.fxml.FXML
    private TextField driverNameTF;
    @javafx.fxml.FXML
    private Label blacklistVehicleLabel;

    public u7verifySuspiciousVehicleController(TextField driverLicenseNoTF, TextField vehicleTypeTF, TextField vehicleLicenseNoTF, TextField driverNameTF, Label blacklistVehicleLabel) {
        this.driverLicenseNoTF = driverLicenseNoTF;
        this.vehicleTypeTF = vehicleTypeTF;
        this.vehicleLicenseNoTF = vehicleLicenseNoTF;
        this.driverNameTF = driverNameTF;
        this.blacklistVehicleLabel = blacklistVehicleLabel;
    }

    @javafx.fxml.FXML
    private TextField driverLicenseNoTF;
    @javafx.fxml.FXML
    private TextField vehicleTypeTF;
    @javafx.fxml.FXML
    private TextField vehicleLicenseNoTF;

    @javafx.fxml.FXML
    public void backToMP3BOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("user7MainPage.fxml"));
        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Suspicious Vehicle");
        stage.show();
    }
}
