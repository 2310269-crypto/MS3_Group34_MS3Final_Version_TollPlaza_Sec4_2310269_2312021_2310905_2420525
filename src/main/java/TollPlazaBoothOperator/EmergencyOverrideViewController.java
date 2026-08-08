package TollPlazaBoothOperator;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class EmergencyOverrideViewController
{
    @javafx.fxml.FXML
    private Label VehicleLicenseNumberTF;
    @javafx.fxml.FXML
    private ComboBox<String> SelectAuthorizedAgencyCB;
    @javafx.fxml.FXML
    private TextField AgencyBadgeTF;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void AuthorizeNonPaidPassButtonOA(ActionEvent actionEvent) {
    }
}