package ehu.isad.controller.ui;

import ehu.isad.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ErroreaKud {
    private Main mainApp;
    public void setMainApp(Main main) {
        this.mainApp = main;
    }
    @FXML
    private Button ErroreBotoia;

    @FXML
    void onClickErrore(ActionEvent event) {
        //System.exit(0);//HORI EGIN BEHARKO LUKE BAINA MOMENTUZ ESKEMA EGITEKO HURRENGO FXML-RA ERAMATEA ESANGO DIOGU
        mainApp.bozkatuPanela();
    }

}
