package ehu.isad;

import ehu.isad.controller.ui.NagusiaKud;
import ehu.isad.controller.ui.EzarpenakKud;
import ehu.isad.controller.ui.StudentsController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

  private Parent studentUI;

  private Stage stage;

  private StudentsController studentKud;


  @Override
  public void start(Stage primaryStage) throws Exception {

    stage = primaryStage;
    pantailakKargatu();

    stage.setTitle("Ezarpenak lortu");
    stage.setScene(new Scene(studentUI, 450, 275));
    stage.show();
  }

  private void pantailakKargatu() throws IOException {

    FXMLLoader loaderKautotu = new FXMLLoader(getClass().getResource("/taula.fxml"));
    studentUI = (Parent) loaderKautotu.load();
    studentKud = loaderKautotu.getController();
    studentKud.setMainApp(this);
  }


  public static void main(String[] args) {
    launch(args);
  }

}
