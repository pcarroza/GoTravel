package gotravel.controller;

import gotravel.models.ListaPropietario;
import gotravel.terminal.Terminal;

public class UpdateController {

    private ListaPropietario listaPropietario;

    public UpdateController(ListaPropietario listaPropietario) {
        assert listaPropietario != null;
        this.listaPropietario = listaPropietario;
    }

    public void update() {
        listaPropietario.update(this.inputRut());
    }

    private String inputRut() {
        new Terminal().showMessageln("Ingresar Rut: ");
        return new Terminal().inputString();
    }
}
