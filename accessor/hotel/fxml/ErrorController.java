/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accessor.hotel.fxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ErrorController implements Controller {

    @FXML
    private Label journalNameLabel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    public void setJournalName(String name) {
        journalNameLabel.setText("Номер журнала: " + name);
    }
    
    @FXML
    private void closeAction(ActionEvent event) {
        journalNameLabel.getScene().getWindow().hide();
    }

    @Override
    public void update() {
    }
}
