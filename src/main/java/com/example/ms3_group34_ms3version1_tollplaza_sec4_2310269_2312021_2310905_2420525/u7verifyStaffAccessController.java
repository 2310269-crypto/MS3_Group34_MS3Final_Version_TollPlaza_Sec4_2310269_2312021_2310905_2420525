package com.example.ms3_group34_ms3version1_tollplaza_sec4_2310269_2312021_2310905_2420525;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class u7verifyStaffAccessController {
    @javafx.fxml.FXML
    private Label u7staffAssignedRoleLabel;

    public void setU7staffIDLabel(Label u7staffIDLabel) {
        this.u7staffIDLabel = u7staffIDLabel;
    }

    public void setU7staffAssignedRoleLabel(Label u7staffAssignedRoleLabel) {
        this.u7staffAssignedRoleLabel = u7staffAssignedRoleLabel;
    }

    public void setU7staffIDNumberLabel(Label u7staffIDNumberLabel) {
        this.u7staffIDNumberLabel = u7staffIDNumberLabel;
    }

    public void setU7staffIDTF(TextField u7staffIDTF) {
        this.u7staffIDTF = u7staffIDTF;
    }

    public void setU7StaffNameLabel(Label u7StaffNameLabel) {
        this.u7StaffNameLabel = u7StaffNameLabel;
    }

    public void setU7staffNameTF(TextField u7staffNameTF) {
        this.u7staffNameTF = u7staffNameTF;
    }

    public void setU7staffShiftstatusLabel(Label u7staffShiftstatusLabel) {
        this.u7staffShiftstatusLabel = u7staffShiftstatusLabel;
    }

    @javafx.fxml.FXML
    private Label u7staffIDLabel;

    public u7verifyStaffAccessController(Label u7staffAssignedRoleLabel, Label u7staffIDLabel, Label u7staffIDNumberLabel, TextField u7staffIDTF, Label u7StaffNameLabel, TextField u7staffNameTF, Label u7staffShiftstatusLabel) {
        this.u7staffAssignedRoleLabel = u7staffAssignedRoleLabel;
        this.u7staffIDLabel = u7staffIDLabel;
        this.u7staffIDNumberLabel = u7staffIDNumberLabel;
        this.u7staffIDTF = u7staffIDTF;
        this.u7StaffNameLabel = u7StaffNameLabel;
        this.u7staffNameTF = u7staffNameTF;
        this.u7staffShiftstatusLabel = u7staffShiftstatusLabel;
    }

    @javafx.fxml.FXML
    private TextField u7staffIDTF;
    @javafx.fxml.FXML
    private Label u7StaffNameLabel;
    @javafx.fxml.FXML
    private Label u7staffShiftstatusLabel;
    @javafx.fxml.FXML
    private Label u7staffIDNumberLabel;
    @javafx.fxml.FXML
    private TextField u7staffNameTF;
}
