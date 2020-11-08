package ehu.isad.controller.ui;

import ehu.isad.Main;
import ehu.isad.controller.db.DBKudeatzaile;
import ehu.isad.controller.db.EzarpenakDBKud;
import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MenuKud {

    private Main mainApp;
    public void setMainApp(Main main) {
        this.mainApp = main;
    }
        @FXML
        private Button OKBotoia;

    @FXML
    private ComboBox<String> herrialdeakComb;

    @FXML
    private Label labelInfo;

    @FXML
    private ImageView eurobiImage;

    @FXML
        public void onClickOk(ActionEvent event) {
            mainApp.errorea();
    }


    public void lortuHerrialdeIzenak() throws SQLException {
        EzarpenakDBKud ezarp=  EzarpenakDBKud.getInstantzia();
        ObservableList<String> emaitza;
        emaitza = ezarp.herrialdeIzenakLortu();
        comboGehituHerrialdeak(emaitza);
    }

    public void comboGehituHerrialdeak(ObservableList<String> izenak){
        herrialdeakComb.setItems(izenak);
    }

}
