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
    	screen.getMessage();
    	long time = System.currentTimeMillis();
    	System.out.println("time: " + time);

    }

    @FXML
    void ahead(ActionEvent event) {

    }

    @FXML
    void behind(ActionEvent event) {

    }

    @FXML
    void searchByAirline(ActionEvent event) {
    	screen = new Screen();
    	int num = Integer.parseInt(number.getText());
    	screen.generateRandomFlights(num);
    	String airline = input.getText();
    	screen.searchByAirLine(airline);
    	long time = System.currentTimeMillis();
    	System.out.println("time: " + time);

    }

    @FXML
    void searchByDate(ActionEvent event) {
    	screen = new Screen();
    	int num = Integer.parseInt(number.getText());
    	screen.generateRandomFlights(num);
    	String ln = input.getText();
    	while(ln != null) {
    		String[] parts = ln.split("/");
        	int year = Integer.parseInt(parts[0]);
        	int month = Integer.parseInt(parts[1]);
        	int day = Integer.parseInt(parts[2]);
        	Date date = new Date(0,month,year,0,day,0);
        	screen.searchByDate(date);   	
    	}
    	long time = System.currentTimeMillis();
    	System.out.println("time: " + time);
    }

    @FXML
    void searchByDestination(ActionEvent event) {
    	screen = new Screen();
    	int num = Integer.parseInt(number.getText());
    	screen.generateRandomFlights(num);
    	String destination = input.getText();
    	screen.searchByDestination(destination);
    	long time = System.currentTimeMillis();
    	System.out.println("time: " + time);

    }

    @FXML
    void searchByGate(ActionEvent event) {
    	screen = new Screen();
    	int num = Integer.parseInt(number.getText());
    	screen.generateRandomFlights(num);
    	int gate = Integer.parseInt(input.getText());
    	screen.searchByGate(gate);
    	long time = System.currentTimeMillis();
    	System.out.println("time: " + time);

    }

    @FXML
    void searchByNumber(ActionEvent event) {
    	screen = new Screen();
    	int num = Integer.parseInt(number.getText());
    	screen.generateRandomFlights(num);
    	int number = Integer.parseInt(input.getText());
    	screen.searchByNumber(number);
    	long time = System.currentTimeMillis();
    	System.out.println("time: " + time);

    }

    @FXML
    void sortByAirline(ActionEvent event) {
    	screen = new Screen();
    	int num = Integer.parseInt(number.getText());
    	screen.generateRandomFlights(num);
    	screen.sortByAirline();
    	screen.getMessage();
    	long time = System.currentTimeMillis();
    	System.out.println("time: " + time);

    }

    @FXML
    void sortByDestination(ActionEvent event) {
    	screen = new Screen();
    	int num = Integer.parseInt(number.getText());
    	screen.generateRandomFlights(num);
    	screen.sortByDestination();
    	screen.getMessage();
    	long time = System.currentTimeMillis();
    	System.out.println("time: " + time);

    }

    @FXML
    void sortByNumber(ActionEvent event) {
    	screen = new Screen();
    	int num = Integer.parseInt(number.getText());
    	screen.generateRandomFlights(num);
    	screen.sortByNumber();
    	screen.getMessage();
    	long time = System.currentTimeMillis();
    	System.out.println("time: " + time);
    }

    @FXML
    void sortNormally(ActionEvent event) {
    	screen = new Screen();
    	int num = Integer.parseInt(number.getText());
    	screen.generateRandomFlights(num);
    	screen.sortNormally();
    	screen.getMessage();
    	long time = System.currentTimeMillis();
    	System.out.println("time: " + time);

    }

}

