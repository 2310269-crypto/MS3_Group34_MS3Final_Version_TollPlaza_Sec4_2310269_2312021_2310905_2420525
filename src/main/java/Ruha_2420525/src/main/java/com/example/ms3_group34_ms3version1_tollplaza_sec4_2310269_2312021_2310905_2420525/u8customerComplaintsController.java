package com.example.ms3_group34_ms3version1_tollplaza_sec4_2310269_2312021_2310905_2420525;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class u8customerComplaintsController {
    @javafx.fxml.FXML
    private TextField u8complaintdateTF;
    @javafx.fxml.FXML
    private TextField u8complaintDetailsTF;
    @javafx.fxml.FXML
    private TextField u8complaintNumberTF;
    @javafx.fxml.FXML
    private TextField u8complaintNameTF;
    @javafx.fxml.FXML
    private TextField u8complaintTollTranIDTF;


        private static final String COMPLAINTS_FILE = "complaints_data.txt";

        @FXML
        public void u8submitComplaintBOA(ActionEvent actionEvent) {
            String name = u8complaintNameTF.getText();
            String number = u8complaintNumberTF.getText();
            String tollTranID = u8complaintTollTranIDTF.getText();
            String details = u8complaintDetailsTF.getText();
            String date = u8complaintdateTF.getText();


            if (name.isBlank() || number.isBlank() || details.isBlank() || date.isBlank()) {
                Alert alert = new Alert(Alert.AlertType.WARNING, "Please complete all required fields");
                alert.showAndWait();
                return;
            }


            u8Complaint newComplaint = new u8Complaint(name, number, tollTranID, details, date);


            appendToTxt(newComplaint);

            clearFields();
        }

        private void appendToTxt(u8Complaint c) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(COMPLAINTS_FILE, true))) {

                writer.write(c.getName() + "," + c.getNumber() + "," + c.getTollTransactionID()
                        + "," + c.getDetails() + "," + c.getDate());
                writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void clearFields() {
            u8complaintNameTF.clear();
            u8complaintNumberTF.clear();
            u8complaintTollTranIDTF.clear();
            u8complaintDetailsTF.clear();
            u8complaintdateTF.clear();
        }

    @FXML
    public void u8sComplaintMainPageBOA(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("user8MainPage.fxml"));
        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Customer complaints");
        stage.show();
    }
}

