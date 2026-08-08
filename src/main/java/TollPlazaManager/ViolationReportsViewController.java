package TollPlazaManager;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;

public class ViolationReportsViewController
{
    @javafx.fxml.FXML
    private DatePicker SelectdateDp;
    @javafx.fxml.FXML
    private ComboBox<String> SelectActionCB;
    @javafx.fxml.FXML
    private ComboBox<String> VoilationTypeCB;
    @javafx.fxml.FXML
    private TableView TableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void FilterButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SubmitActionButtonOA(ActionEvent actionEvent) {
    }
}