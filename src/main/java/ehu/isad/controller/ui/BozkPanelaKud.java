package ehu.isad.controller.ui;
import ehu.isad.Main;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
public class BozkPanelaKud {
    private Main mainApp;
    public void setMainApp(Main main) {
        this.mainApp = main;
    }

    @FXML
    private TableView<?> bozkPanelaTaula;

    @FXML
    private TableColumn<?, ?> irudiaZutabe;

    @FXML
    private TableColumn<?, ?> HerrialdeZutabe;

    @FXML
    private TableColumn<?, ?> ArtistaZutabe;

    @FXML
    private TableColumn<?, ?> AbestiaZutabe;

    @FXML
    private TableColumn<?, ?> PuntuakZutabe;

}
