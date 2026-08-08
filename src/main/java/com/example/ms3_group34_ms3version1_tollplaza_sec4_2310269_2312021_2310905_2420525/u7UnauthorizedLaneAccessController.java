package com.example.ms3_group34_ms3version1_tollplaza_sec4_2310269_2312021_2310905_2420525;

import javafx.scene.control.TextField;

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
}
