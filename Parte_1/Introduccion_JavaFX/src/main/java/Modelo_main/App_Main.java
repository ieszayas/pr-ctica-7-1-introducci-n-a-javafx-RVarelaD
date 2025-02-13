package Modelo_main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Vista.Vista_C;
import Controlador.Controlador_C;

public class App_Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Vista_C vista = new Vista_C();
        Controlador_C controlador = new Controlador_C(vista);

        primaryStage.setScene(new Scene(vista.getLayout(), 400, 200));
        primaryStage.setTitle("Saludo JavaFX");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
