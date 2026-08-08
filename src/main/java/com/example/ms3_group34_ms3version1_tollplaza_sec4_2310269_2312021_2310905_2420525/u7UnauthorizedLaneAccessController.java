package com.example.ms3_group34_ms3version1_tollplaza_sec4_2310269_2312021_2310905_2420525;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class u7UnauthorizedLaneAccessController {
    public void setUnauthorizedLaneNumberTF(TextField unauthorizedLaneNumberTF) {
        this.unauthorizedLaneNumberTF = unauthorizedLaneNumberTF;
    }

    public void setDateOfUnauthorizedLaneTF(TextField dateOfUnauthorizedLaneTF) {
        this.dateOfUnauthorizedLaneTF = dateOfUnauthorizedLaneTF;
    }

    @javafx.fxml.FXML
    private TextField unauthorizedLaneNumberTF;

    public u7UnauthorizedLaneAccessController(TextField dateOfUnauthorizedLaneTF, TextField unauthorizedLaneNumberTF) {
        this.dateOfUnauthorizedLaneTF = dateOfUnauthorizedLaneTF;
        this.unauthorizedLaneNumberTF = unauthorizedLaneNumberTF;
    }

    @javafx.fxml.FXML
    private TextField dateOfUnauthorizedLaneTF;

    @javafx.fxml.FXML
    public void backToMP6BOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("user7MainPage.fxml"));
        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Unauthorized Lane");
        stage.show();
    }
}
