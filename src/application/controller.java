package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class controller {
		
    @FXML
    private Button convertButton;
    
    @FXML
    private Button clearHistoryButton;
    
    @FXML
    private Button clearSelectedButton;

    @FXML
    private TextField kilometerTextField;

    @FXML
    private Label outputLabel;

    @FXML
    private Label promptLabel;
    
    @FXML
    private RadioButton metersRadioButton;

    @FXML
    private RadioButton milesRadioButton;
    
    @FXML
    private ListView<String> historyView;
       
    public void convertButtonHandler() throws Exception {
    	double km = Double.parseDouble(kilometerTextField.getText());
    	
    	double scale;
    	String result;
    	if (milesRadioButton.isSelected()) {
    		scale = 0.621371;
        	result = km + "km is " + (km * scale) + "miles";
    	}
    	else if (metersRadioButton.isSelected()) {
    		scale = 1000;
    		result = km + "km is " + (km * scale) + "meters";
    	}
    	else
    	{
    		throw new Exception("must select miles or meters");
    	}
    	
    	
    	outputLabel.setText(result);
    	
    	historyView.getItems().add(result);
    }
    
    public void clearHistoryButtonHandler() {
    	historyView.getItems().clear();
    }
    
    public void clearSelectedButtonHandler() {
    	String selected = historyView.getSelectionModel().getSelectedItem();
    	historyView.getItems().remove(selected);
    }
}
