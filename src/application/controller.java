package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import model.ConversionResult;

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
    private ListView<ConversionResult> historyView;
    
    @FXML
    private Button convertMassButton;

    @FXML
    private RadioButton gramsRadioButton;
    
    @FXML
    private RadioButton newtonsRadioButton;

    @FXML
    private TextField kgTextBox;
       
    public void convertButtonHandler() throws Exception {
    	double km = Double.parseDouble(kilometerTextField.getText());
    	
    	ConversionResult result;
    	if (milesRadioButton.isSelected()) {
    		result = new ConversionResult("km", "miles", km, km * 0.621371);
    	}
    	else if (metersRadioButton.isSelected()) {
    		result = new ConversionResult("km", "meters", km, km * 1000);
    	}
    	else
    	{
    		throw new Exception("must select miles or meters");
    	}
    	
    	outputLabel.setText(result.toString());
    	
    	historyView.getItems().add(result);
    }
    
    public void convertMassButtonHandler() throws Exception {
    	double kg = Double.parseDouble(kgTextBox.getText());
    	
    	ConversionResult result;
    	if (gramsRadioButton.isSelected()) {
    		result = new ConversionResult("kg", "g", kg, kg*1000);
    	}
    	else if (newtonsRadioButton.isSelected()) {
    		result = new ConversionResult("kg", "N", kg, kg*9.81);
    	}
    	else
    	{
    		throw new Exception("must select grams or newtons");
    	}
    	
    	outputLabel.setText(result.toString());
    	
    	historyView.getItems().add(result);
    }
    
    public void clearHistoryButtonHandler() {
    	historyView.getItems().clear();
    }
    
    public void clearSelectedButtonHandler() {
    	ConversionResult selected = historyView.getSelectionModel().getSelectedItem();
    	historyView.getItems().remove(selected);
    }
}
