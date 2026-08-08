package com.example.ms3_group34_ms3version1_tollplaza_sec4_2310269_2312021_2310905_2420525;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class u8lostReceiptController {
    @javafx.fxml.FXML
    private TextField u8lostReceiptPayIDTF;
    @javafx.fxml.FXML
    private TextField u8lostReceiptDateTF;
    @javafx.fxml.FXML
    private AnchorPane u8lostReceiptCnumberTF;
    @javafx.fxml.FXML
    private TextField u8lostReceiptVehicleIDTF;
    @javafx.fxml.FXML
    private TextField u8lostReceiptCnameTF;

    @javafx.fxml.FXML
    public void u8lostReceiptSearchBOA(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void u8lostReceiptMainPageBOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("user8MainPage.fxml"));
        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Customer complaints");
        stage.show();
    }
}

