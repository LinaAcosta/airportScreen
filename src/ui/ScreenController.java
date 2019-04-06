package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Screen;

public class ScreenController {

    @FXML
    private ComboBox<?> comboBox;

    @FXML
    private TextField number;

    @FXML
    private Label label;
    
    @FXML
    private AnchorPane ap;
    private Screen screen;

    @FXML
    void ahead(ActionEvent event) {

    }

    @FXML
    void behind(ActionEvent event) {

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
