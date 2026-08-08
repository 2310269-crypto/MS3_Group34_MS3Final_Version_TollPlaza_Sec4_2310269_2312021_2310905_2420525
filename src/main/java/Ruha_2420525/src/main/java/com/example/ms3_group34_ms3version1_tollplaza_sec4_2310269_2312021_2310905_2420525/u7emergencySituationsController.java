package com.example.ms3_group34_ms3version1_tollplaza_sec4_2310269_2312021_2310905_2420525;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class u7emergencySituationsController {
    @javafx.fxml.FXML
    private ComboBox StatusTF;
    @javafx.fxml.FXML
    private TextField emergencyTypeTF;
    @javafx.fxml.FXML
    private TextField emergencyLocationTF;
    @javafx.fxml.FXML
    private ComboBox priorityLevelTF;

    @javafx.fxml.FXML
    public void alertLane2BOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void alertLane1BOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void alertLane4BOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void alertLane3BOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logResponseBOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backToMP2BOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("user7MainPage.fxml"));
        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Emergency");
        stage.show();
    }
}
