package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
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
    void SortByGate(ActionEvent event) {
    	screen = new Screen();
    	int num = Integer.parseInt(number.getText());
    	screen.generateRandomFlights(num);
    	screen.sortByGate();
    	screen.getMessage();

    }

    @FXML
    void ahead(ActionEvent event) {

    }

    @FXML
    void behind(ActionEvent event) {

    }

    @FXML
    void searchByAirline(ActionEvent event) {

    }

    @FXML
    void searchByDate(ActionEvent event) {

    }

    @FXML
    void searchByDestination(ActionEvent event) {

    }

    @FXML
    void searchByGate(ActionEvent event) {

    }

    @FXML
    void searchByNumber(ActionEvent event) {

    }

    @FXML
    void sortByAirline(ActionEvent event) {
    	screen = new Screen();
    	int num = Integer.parseInt(number.getText());
    	screen.generateRandomFlights(num);
    	screen.sortByAirline();
    	screen.getMessage();

    }

    @FXML
    void sortByDestination(ActionEvent event) {
    	screen = new Screen();
    	int num = Integer.parseInt(number.getText());
    	screen.generateRandomFlights(num);
    	screen.sortByDestination();
    	screen.getMessage();

    }

    @FXML
    void sortByNumber(ActionEvent event) {
    	screen = new Screen();
    	int num = Integer.parseInt(number.getText());
    	screen.generateRandomFlights(num);
    	screen.sortByNumber();
    	screen.getMessage();
    }

    @FXML
    void sortNormally(ActionEvent event) {
    	screen = new Screen();
    	int num = Integer.parseInt(number.getText());
    	screen.generateRandomFlights(num);
    	screen.sortNormally();
    	screen.getMessage();

    }

}

