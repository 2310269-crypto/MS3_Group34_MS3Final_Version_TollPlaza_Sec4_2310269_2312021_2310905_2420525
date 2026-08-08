package com.example.ms3_group34_ms3version1_tollplaza_sec4_2310269_2312021_2310905_2420525.TrafficMonitoringOfficer.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class TrafficLiveMonitor
{
    @javafx.fxml.FXML
    private TableColumn laneStatusColumn;
    @javafx.fxml.FXML
    private TableView trafficFlowTableView;
    @javafx.fxml.FXML
    private TableColumn waitingTimeColumn;
    @javafx.fxml.FXML
    private TableColumn queueLengthColumn;
    @javafx.fxml.FXML
    private TableColumn throughputColumn;
    @javafx.fxml.FXML
    private Label lastUpdatedLabel;
    @javafx.fxml.FXML
    private Label congestionAlertLabel;
    @javafx.fxml.FXML
    private TableColumn laneIdColumn;
    @javafx.fxml.FXML
    private TableColumn vehicleCountColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void logoutBtnOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backBtnOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void refreshTrafficButton(ActionEvent actionEvent) {
    }
}