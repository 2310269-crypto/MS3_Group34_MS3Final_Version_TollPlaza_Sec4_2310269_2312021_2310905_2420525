package TollPlazaManager;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class IncidentManagementViewController
{
    @javafx.fxml.FXML
    private ComboBox<String> UpdtaeStatusCB;
    @javafx.fxml.FXML
    private ComboBox<String> selectPriorityLevelCB;
    @javafx.fxml.FXML
    private TextField IncidentTitleTF;
    @javafx.fxml.FXML
    private TableView TableView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void CloseIncidentandSaveLogButtonOA(ActionEvent actionEvent) {
    }
}