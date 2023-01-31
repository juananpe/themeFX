package eus.ehu.theme;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class AppController {

    @FXML
    private ToggleGroup themes;
    private Application main;


    @FXML
    void applyClick(ActionEvent event) {
        RadioButton selectedToggle = (RadioButton) themes.getSelectedToggle();
        main.applyTheme(selectedToggle.getText());
    }

    @FXML
    void initialize() {

    }

    public void setMain(Application application) {
        this.main = application;
    }
}
