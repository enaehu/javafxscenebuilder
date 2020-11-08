package ehu.isad.controller.ui;
import ehu.isad.Main;
import ehu.isad.Utils.Utils;
import ehu.isad.model.Ezarpena;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import static java.lang.System.getProperty;

public class BozkatuKud {
    private Main mainApp;
    public void setMainApp(Main main) {
        this.mainApp = main;
    }

        @FXML
        private Button BozkatuBotoia;

    @FXML
    private ImageView eurobiIrudia;


    @FXML
        void onClickBozk(ActionEvent event) {
            mainApp.bozkatu();


    }


    public void labelEguneraketa() throws FileNotFoundException {
        Properties properties = Utils.lortuEzarpenak();
        Image image = new Image(new FileInputStream(properties.getProperty("imagePathindice.png")));
        eurobiIrudia.setImage(image);
    }

}
