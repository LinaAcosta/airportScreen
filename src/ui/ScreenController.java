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
    	screen = new Screen();
    	int num = Integer.parseInt(number.getText());
    	screen.generateRandomFlights(num);
    	screen.sortByGate();
    }
    @FXML
    void ahead(ActionEvent event) {

    }
    @FXML
    void behind(ActionEvent event) {

    }
    @FXML
    void sortByAirline(ActionEvent event) {
    	screen = new Screen();
    	int num = Integer.parseInt(number.getText());
    	screen.generateRandomFlights(num);
    	screen.sortByAirline();
    }

    @FXML
    void sortByDestination(ActionEvent event) {
    	screen = new Screen();
    	int num = Integer.parseInt(number.getText());
    	screen.generateRandomFlights(num);
    	screen.sortByDestination();
    }

    @FXML
    void sortByNumber(ActionEvent event) {
    	screen = new Screen();
    	int num = Integer.parseInt(number.getText());
    	screen.generateRandomFlights(num);
    	screen.sortByNumber();
    }

    @FXML
    void sortNormally(ActionEvent event) {
    	screen = new Screen();
    	int num = Integer.parseInt(number.getText());
    	screen.generateRandomFlights(num);
    	//screen.sortNormally();


    }
    @FXML
    void show(ActionEvent event) {
    	label.setText(screen.getMessage());

    }

}

