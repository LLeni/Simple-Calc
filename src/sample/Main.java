package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Main extends Application {
    private final int WIDTH_STAGE = 200;
    private final int HEIGHT_STAGE = 225;


    TextField textField;
    Button buttonOne;   Button buttonTwo;   Button buttonThree; Button buttonDivide;
    Button buttonFour;  Button buttonFive;  Button buttonSix;   Button buttonMulti;
    Button buttonSeven; Button buttonEight; Button buttonNine;  Button buttonMinus;
    Button buttonDot; Button buttonZero;  Button buttonEqual; Button buttonPlus;

    Group group;

    @Override
    public void start(Stage primaryStage) throws Exception{
        textField = new TextField();
        buttonOne = new Button("1"); buttonTwo = new Button("2"); buttonThree = new Button("3"); buttonDivide = new Button("/");
        buttonFour= new Button("4"); buttonFive = new Button("5"); buttonSix = new Button("6"); buttonMulti = new Button("*");
        buttonSeven = new Button("7"); buttonEight = new Button("8"); buttonNine = new Button("9"); buttonMinus = new Button("-");
        buttonDot = new Button("."); buttonZero = new Button("0"); buttonEqual = new Button("="); buttonPlus = new Button("+");
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Simple Calc");
        primaryStage.setScene(new       Scene(root, WIDTH_STAGE, HEIGHT_STAGE));
        primaryStage.setMinWidth(WIDTH_STAGE);
        primaryStage.setMaxWidth(WIDTH_STAGE);
        primaryStage.setMinHeight(HEIGHT_STAGE);
        primaryStage.setMaxHeight(HEIGHT_STAGE);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
