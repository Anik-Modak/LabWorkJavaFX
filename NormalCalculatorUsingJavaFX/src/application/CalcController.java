package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalcController implements Initializable {

	double number, number2, answer;
	int calculation, check=0;

	@FXML
	private Button buttonOne;

	@FXML
	private Button buttonTwo;

	@FXML
	private Button buttonThree;

	@FXML
	private Button buttonFour;

	@FXML
	private Button buttonfive;

	@FXML
	private Button buttonSix;

	@FXML
	private Button buttonSeven;

	@FXML
	private Button buttonEight;

	@FXML
	private Button buttonNine;

	@FXML
	private Button buttonDot;
	
	@FXML
	private Button buttonAdd;

	@FXML
	private Button buttonSub;

	@FXML
	private Button buttonMul;

	@FXML
	private Button buttonReset;

	@FXML
	private Button buttonEqual;

	@FXML
	private Button buttonZero;

	@FXML
	private Button buttonDiv;
	
	@FXML
	private Button buttonSqrt;
	
	@FXML
	private Button buttonDel;

	@FXML
	private TextField display;


	@FXML
	void doOperation()
	{
		check=1;
		switch (calculation) {
		case 1:
			answer = number +  Double.parseDouble(display.getText());
			if (Double.toString(answer).endsWith(".0")) {
				display.setText(Double.toString(answer).replace(".0", ""));
			} else {
				display.setText(Double.toString(answer));
			}
			//display.setText("");
			break;
		case 2:
			answer = number - Double.parseDouble(display.getText());
			if (Double.toString(answer).endsWith(".0")) {
				display.setText(Double.toString(answer).replace(".0", ""));
			} else {
				display.setText(Double.toString(answer));
			}
			//display.setText("");
			break;
		case 3:
			answer = number * Double.parseDouble(display.getText());
			if (Double.toString(answer).endsWith(".0")) {
				display.setText(Double.toString(answer).replace(".0", ""));
			} else {
				display.setText(Double.toString(answer));
			}
			//display.setText("");
			break;
		case 4:
			answer = number / Double.parseDouble(display.getText());
			if (Double.toString(answer).endsWith(".0")) {
				display.setText(Double.toString(answer).replace(".0", ""));
			} else {
				display.setText(Double.toString(answer));
			}
			//display.setText("");
			break;
		case 5:
			number = Double.parseDouble(display.getText());
			answer = Math.sqrt(number);
			if (Double.toString(answer).endsWith(".0")) {
				display.setText(Double.toString(answer).replace(".0", ""));
			} else {
				display.setText(Double.toString(answer));
			}
			//display.setText("");
			break;
		}
	}

	@FXML
	void handleButtonAction(ActionEvent event) 
	{
		if(event.getSource() == buttonAdd){
			number = Double.parseDouble(display.getText());
			display.setText("");
			calculation = 1;
		}
		else if(event.getSource() == buttonSub){
			number = Double.parseDouble(display.getText());
			display.setText("");
			calculation = 2;
		}
		else if (event.getSource() == buttonMul) {
			number = Double.parseDouble(display.getText());
			display.setText("");
			calculation = 3;
		}
		else if (event.getSource() == buttonDiv) {
			number = Double.parseDouble(display.getText());
			display.setText("");
			calculation = 4;
		}
		else if (event.getSource() == buttonSqrt) {
			display.setText("");
			calculation = 5;
		}
	
		if(check==1){
			display.setText("");
			check=0;
		}
		
		if(event.getSource() == buttonOne){
			display.setText(display.getText() + "1");
		}
		else if(event.getSource() == buttonTwo){
			display.setText(display.getText() + "2");
		}
		else if(event.getSource() == buttonThree){
			display.setText(display.getText() + "3");
		}
		else if(event.getSource() == buttonFour){
			display.setText(display.getText() + "4");
		}
		else if(event.getSource() == buttonfive){
			display.setText(display.getText() + "5");
		}
		else if(event.getSource() == buttonSix){
			display.setText(display.getText() + "6");
		}
		else if(event.getSource() == buttonSeven){
			display.setText(display.getText() + "7");
		}
		else if(event.getSource() == buttonEight){
			display.setText(display.getText() + "8");
		}
		else if(event.getSource() == buttonNine){
			display.setText(display.getText() + "9");
		}
		else if(event.getSource() == buttonZero){
			display.setText(display.getText() + "0");
		}
		else if (event.getSource() == buttonDot) {
			display.setText(display.getText() + ".");
		}
		else if(event.getSource() == buttonReset){
			display.setText("");
		}
		else if(event.getSource() == buttonDel){
			String str = display.getText();
			str = str.substring(0,str.length()-1);
			display.setText(str);
		}
		else if (event.getSource() == buttonEqual) {
			doOperation();
		}
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1)
	{
		// TODO Auto-generated method stub

	}

}
