package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class controller {
	
    @FXML
    private Button convertButton;

    @FXML
    private TextField kilometerTextField;

    @FXML
    private Label outputLabel;

    @FXML
    private Label promptLabel;
       
    public void convertButtonHandler() {
    	double km = Double.parseDouble(kilometerTextField.getText());
    	double mi = km * 0.621371;
    	outputLabel.setText(km + "km is " + mi + "miles");
    }
}
