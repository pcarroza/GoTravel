package gotravel.controller;

import gotravel.models.ListaPropietario;
import gotravel.terminal.Terminal;

public class DeleteController {

    private ListaPropietario listaPropietario;

    public DeleteController(ListaPropietario listaPropietario) {
        assert listaPropietario != null;
        this.listaPropietario = listaPropietario;
    }

    public void delete() {
        listaPropietario.delete(this.inputRut());
    }

    private String inputRut() {
        new Terminal().showMessageln("Ingresar Rut: ");
        return new Terminal().inputString();
    }
}
