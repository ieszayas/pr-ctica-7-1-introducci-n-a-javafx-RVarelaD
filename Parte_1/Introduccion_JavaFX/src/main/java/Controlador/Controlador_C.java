package Controlador;

import Vista.Vista_C;

public class Controlador_C {
    public Controlador_C(Vista_C vista) {
        vista.getBotonSalir().setOnAction(e -> System.exit(0));
    }
}