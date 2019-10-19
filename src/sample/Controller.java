package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField fieldInput;
    @FXML
    Button buttonOne, buttonTwo, buttonThree, buttonDivide;
    @FXML
    Button buttonFour, buttonFive, buttonSix, buttonMulti;
    @FXML
    Button buttonSeven, buttonEight, buttonNine, buttonMinus;
    @FXML
    Button buttonDot, buttonZero, buttonEqual, buttonPlus;

    public void solve(){
        char[] equation = fieldInput.getText().toCharArray();
        String firstValueStr = null;
        String secondValueStr = null;
        String preparation = null;
        char operation;
        for (char c:
             equation) {
           if(true) {

                if (String.valueOf(c).matches("/d")) {
                    firstValueStr += c;
                } else {
                    operation = c;
                }
            } else {
                if (String.valueOf(c).matches("/d")) {
                    firstValueStr += c;
                } else {
                    firstValueStr = doSubOperation(Double.valueOf(firstValueStr), Double.valueOf(secondValueStr), operation);
                    operation += c;
                }
            }
        }
        System.out.println("Ddd");
    }

    private double doSubOperation(double first, double second, String operation){
        switch (operation){
            case "+":
                  return Operation.PLUS.eval(first,second);
                break;
            case "-":
                return Operation.MINUS.eval(first,second);
            break;
            case "*":
                return Operation.MINUS.eval(first,second);
            break;
            case "/":
                return Operation.DIVIDE.eval(first,second);
            break;
        }
    }

    @FXML
    public void initialize(){
        buttonOne.setOnAction(e -> fieldInput.setText(fieldInput.getText() + "1"));
        buttonTwo.setOnAction(e -> fieldInput.setText(fieldInput.getText() + "2"));
        buttonThree.setOnAction(e -> fieldInput.setText(fieldInput.getText() + "3"));
        buttonFour.setOnAction(e -> fieldInput.setText(fieldInput.getText() + "4"));
        buttonFive.setOnAction(e -> fieldInput.setText(fieldInput.getText() + "5"));
        buttonSix.setOnAction(e -> fieldInput.setText(fieldInput.getText() + "6"));
        buttonSeven.setOnAction(e -> fieldInput.setText(fieldInput.getText() + "7"));
        buttonEight.setOnAction(e -> fieldInput.setText(fieldInput.getText() + "8"));
        buttonNine.setOnAction(e -> fieldInput.setText(fieldInput.getText() + "9"));
        buttonZero.setOnAction(e -> fieldInput.setText(fieldInput.getText() + "0"));
        buttonDot.setOnAction(e -> fieldInput.setText(fieldInput.getText() + "."));
        buttonPlus.setOnAction(e -> fieldInput.setText(fieldInput.getText() + "+"));
        buttonMinus.setOnAction(e -> fieldInput.setText(fieldInput.getText() + "-"));
        buttonMulti.setOnAction(e -> fieldInput.setText(fieldInput.getText() + "*"));
        buttonDivide.setOnAction(e -> fieldInput.setText(fieldInput.getText() + "/"));

    }
}
