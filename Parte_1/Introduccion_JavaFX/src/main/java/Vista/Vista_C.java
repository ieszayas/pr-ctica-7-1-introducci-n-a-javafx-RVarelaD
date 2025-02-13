package Vista;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Vista_C {
    private VBox layout;
    private Label saludo;
    private Button botonSalir;

    public Vista_C() {
        saludo = new Label("¿Hola, qué tal?");
        saludo.setStyle("-fx-font-size: 24px;");

        botonSalir = new Button("Salir");
        layout = new VBox(20, saludo, botonSalir);
        layout.setStyle("-fx-padding: 50px; -fx-alignment: center;");
    }

    public VBox getLayout() {
        return layout;
    }

    public Button getBotonSalir() {
        return botonSalir;
    }
}
