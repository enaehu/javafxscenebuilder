package ehu.isad;

import ehu.isad.controller.ui.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class Main extends Application {

  private Parent menuUI;
  private Parent bozkatuUI;
  private Parent erroreUI;
  private Parent bozPanelaUI;
  private Parent topUI;


  private Stage stage;

  private BozkPanelaKud bozkPanelaKud;
  private MenuKud menuKud;
  private BozkatuKud bozkatuKud;
  private ErroreaKud erroreaKud;
  private TopKud topKud;


  @Override
  public void start(Stage primaryStage) throws Exception {

    stage = primaryStage;
    pantailakKargatu();

    stage.setTitle("EUROBISIOA");
    stage.setScene(new Scene(bozkatuUI, 225, 135));
    stage.show();
  }

  private void pantailakKargatu() throws IOException, SQLException {

    FXMLLoader loaderBozk = new FXMLLoader(getClass().getResource("/bozkatu.fxml"));
    bozkatuUI = (Parent) loaderBozk.load();
    bozkatuKud = loaderBozk.getController();
    bozkatuKud.setMainApp(this);
   // bozkatuKud.labelEguneraketa();

    FXMLLoader loaderKautotu = new FXMLLoader(getClass().getResource("/menu1.fxml"));
    menuUI = (Parent) loaderKautotu.load();
    menuKud = loaderKautotu.getController();
    menuKud.setMainApp(this);
    menuKud.lortuHerrialdeIzenak();

    FXMLLoader loaderErrorea = new FXMLLoader(getClass().getResource("/errorea.fxml"));
    erroreUI = (Parent) loaderErrorea.load();
    erroreaKud = loaderErrorea.getController();
    erroreaKud.setMainApp(this);

    FXMLLoader loaderBozkPanela = new FXMLLoader(getClass().getResource("/bozPanela.fxml"));
    bozPanelaUI = (Parent) loaderBozkPanela.load();
    bozkPanelaKud = loaderBozkPanela.getController();
    bozkPanelaKud.setMainApp(this);

    FXMLLoader loaderTop = new FXMLLoader(getClass().getResource("/Top.fxml"));
    topUI = (Parent) loaderTop.load();
    topKud = loaderTop.getController();
    topKud.setMainApp(this);

  }
  public void bozkatu() {
    stage.setTitle("Informazioaren Eguneraketa");
    stage.setScene(new Scene(menuUI, 450, 400));
    stage.show();
  }
  public void errorea() {
    stage.setTitle("Errorea");
    stage.setScene(new Scene(erroreUI, 450, 400));
    stage.show();
  }

  public void bozkatuPanela(){
    stage.setTitle("Bozkaketa Panela");
    stage.setScene(new Scene(bozPanelaUI, 600, 400));
    stage.show();
  }


  public static void main(String[] args) {
    launch(args);
  }

}
