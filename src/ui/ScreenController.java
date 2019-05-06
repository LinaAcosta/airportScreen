package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Date;
import model.Screen;

public class ScreenController {

    @FXML
    private AnchorPane ap;

    @FXML
    private TextField number;

    @FXML
    private Label label;
    private Screen screen;
    @FXML
    private TextField input;


    @FXML
    void SortByGate(ActionEvent event) {
    	long starttime = System.currentTimeMillis();
    	screen = new Screen();
    	int num = Integer.parseInt(number.getText());
    	screen.generateRandomFlights(num);
    	screen.sortByGate();
    	//screen.getMessage();
    	long time = (System.currentTimeMillis() - starttime);
    	label.setText("time: " + time + "ms");

    }


    @FXML
    void ahead(ActionEvent event) {

    }

    @FXML
    void behind(ActionEvent event) {

    }
    @FXML
    void sortByAirline(ActionEvent event) {
    	long starttime = System.currentTimeMillis();
    	screen = new Screen();
    	int num = Integer.parseInt(number.getText());
    	screen.generateRandomFlights(num);
    	screen.sortByAirline();
    	//screen.getMessage();
    	long time = (System.currentTimeMillis() - starttime);
    	label.setText("time: " + time + "ms");


    }

    @FXML
    void sortByDestination(ActionEvent event) {
    	long starttime = System.currentTimeMillis();
    	screen = new Screen();
    	int num = Integer.parseInt(number.getText());
    	screen.generateRandomFlights(num);
    	screen.sortByDestination();
    	//screen.getMessage();
    	long time = (System.currentTimeMillis() - starttime);
    	label.setText("time: " + time + "ms");


    }

    @FXML
    void sortByNumber(ActionEvent event) {
    	//long starttime = System.currentTimeMillis();
    	screen = new Screen();
    	int num = Integer.parseInt(number.getText());
    	screen.generateRandomFlights(num);
    	screen.sortByNumber();
       // screen.getMessage();
    	//long time = (System.currentTimeMillis() - starttime);
    	//label.setText("time: " + time + "ms");

    }

    @FXML
    void sortNormally(ActionEvent event) {
    	long starttime = System.currentTimeMillis();
    	screen = new Screen();
    	int num = Integer.parseInt(number.getText());
    	screen.generateRandomFlights(num);
    	//screen.sortNormally();
    	//screen.getMessage();
    	long time = (System.currentTimeMillis() - starttime);
    	label.setText("time: " + time + "ms");


    }
    @FXML
    void show(ActionEvent event) {
    	long starttime = System.currentTimeMillis();
    	long time = (System.currentTimeMillis() - starttime);
    	//label.setText(screen.getMessage() + "\n" + "time: " + time + "ms");

    }

}

