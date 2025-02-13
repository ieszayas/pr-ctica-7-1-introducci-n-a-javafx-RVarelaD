package Vista;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Vista_C {
    private BorderPane layout;
    private Label saludo;
    private Button botonSalir;
    private Button botonAccion;
    private CheckBox check1, check2, check3;
    private DatePicker datePicker;
    private ComboBox<String> comboBox;
    private Slider slider;
    private TextArea textArea;

    public Vista_C(Stage primaryStage) {
        // Configurar tamaño fijo de la ventana
        primaryStage.setWidth(800);
        primaryStage.setHeight(500);
        primaryStage.setResizable(false); // Evitar redimensionamiento

        // Label de saludo
        saludo = new Label("¿Hola, qué tal?");
        saludo.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");

        // CheckBoxes
        check1 = new CheckBox("Selección");
        check2 = new CheckBox("Selección");
        check3 = new CheckBox("Selección");
        VBox checkBoxGroup = new VBox(10, check1, check2, check3);
        checkBoxGroup.setPadding(new Insets(10));
        checkBoxGroup.setStyle("-fx-background-color: #D3D3D3;");

        // DatePicker
        datePicker = new DatePicker();

        // ComboBox
        comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Opción 1", "Opción 2", "Opción 3");

        // Slider
        slider = new Slider(0, 100, 50);
        slider.setShowTickMarks(true);
        slider.setShowTickLabels(true);

        // TextArea
        textArea = new TextArea();
        textArea.setPrefSize(400, 100); // Tamaño fijo

        // Botón de acción
        botonAccion = new Button("Press");

        // Botón salir
        botonSalir = new Button("Salir");

        // Layout superior con el saludo
        HBox topBar = new HBox(saludo);
        topBar.setAlignment(Pos.CENTER_LEFT);
        topBar.setPadding(new Insets(10));

        // Layout izquierdo con CheckBoxes y TextArea
        VBox leftPanel = new VBox(10, checkBoxGroup, textArea);
        leftPanel.setPadding(new Insets(10));

        // Layout derecho con DatePicker, ComboBox y Slider
        VBox rightPanel = new VBox(10, datePicker, comboBox, slider, botonAccion);
        rightPanel.setAlignment(Pos.TOP_CENTER);
        rightPanel.setPadding(new Insets(10));

        // Layout inferior con el botón de salir
        HBox bottomBar = new HBox(botonSalir);
        bottomBar.setAlignment(Pos.CENTER);
        bottomBar.setPadding(new Insets(10));

        // Layout principal
        layout = new BorderPane();
        layout.setTop(topBar);
        layout.setLeft(leftPanel);
        layout.setRight(rightPanel);
        layout.setBottom(bottomBar);

        // Configurar la escena
        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
    }

    public BorderPane getLayout() {
        return layout;
    }

    public Button getBotonSalir() {
        return botonSalir;
    }
}
