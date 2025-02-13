package Main;

import Controlador.ControladorOperacion;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main_App extends Application {
    @Override
    public void start(Stage primaryStage) {
        new ControladorOperacion(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
