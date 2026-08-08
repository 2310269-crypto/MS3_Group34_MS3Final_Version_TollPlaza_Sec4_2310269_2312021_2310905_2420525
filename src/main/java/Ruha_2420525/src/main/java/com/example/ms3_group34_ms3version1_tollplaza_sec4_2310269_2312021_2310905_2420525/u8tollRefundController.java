package com.example.ms3_group34_ms3version1_tollplaza_sec4_2310269_2312021_2310905_2420525;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class u8tollRefundController {
    @javafx.fxml.FXML
    private Label u8tollRefundHistoryLabel;
    @javafx.fxml.FXML
    private TextField u8tollRefundTranIDTF;
    @javafx.fxml.FXML
    private TextField u8tollRefundCnameTF;
    @javafx.fxml.FXML
    private TextField u8tollRefundCnumberTF;
    @javafx.fxml.FXML
    private TextField u8tollRefundDateTF;

    @javafx.fxml.FXML
    public void u8tollRefundSearchBOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void u8tollRefundMainPageBOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("user8MainPage.fxml"));
        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Customer complaints");
        stage.show();
    }
}
