package TollPlazaBoothOperator;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ReportMalfunctionViewController
{
    @javafx.fxml.FXML
    private ComboBox<String> SelectBrokenHardwareCB;
    @javafx.fxml.FXML
    private CheckBox FlagCriticalIssueCB;
    @javafx.fxml.FXML
    private TextField TypeProblrmSpecificsTF;
    @javafx.fxml.FXML
    private Label Select;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void TransmitSystemAlertButtonOA(ActionEvent actionEvent) {
    }
}