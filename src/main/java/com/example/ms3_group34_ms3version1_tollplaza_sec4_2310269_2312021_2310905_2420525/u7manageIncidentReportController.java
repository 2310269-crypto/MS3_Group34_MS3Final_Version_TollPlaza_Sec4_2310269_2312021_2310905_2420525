package com.example.ms3_group34_ms3version1_tollplaza_sec4_2310269_2312021_2310905_2420525;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class u7manageIncidentReportController {
    @javafx.fxml.FXML
    private TextField locationTF;
    @javafx.fxml.FXML
    private TextField incidentTypeTF;
    @javafx.fxml.FXML
    private TextField timeTF;
    @javafx.fxml.FXML
    private TextField involvedVehicleRegTF;
    @javafx.fxml.FXML
    private TextArea descriptionTF;

    @javafx.fxml.FXML
    public void backToMP5BOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("user7MainPage.fxml"));
        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Incident Report");
        stage.show();
    }
}
