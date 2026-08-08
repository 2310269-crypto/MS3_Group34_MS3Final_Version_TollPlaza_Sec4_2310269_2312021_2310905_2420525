package TollPlazaManager;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class MISReportViewController
{
    @javafx.fxml.FXML
    private ComboBox destinationCodeCB;
    @javafx.fxml.FXML
    private AnchorPane StartDateDP;
    @javafx.fxml.FXML
    private DatePicker travelDateDP;
    @javafx.fxml.FXML
    private DatePicker EndDateDP;
    @javafx.fxml.FXML
    private TableView TableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void GenerateButtonOA(ActionEvent actionEvent) {
    }
}