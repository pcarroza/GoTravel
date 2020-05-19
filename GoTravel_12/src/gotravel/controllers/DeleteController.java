package gotravel.controllers;

import gotravel.models.ListaPropietario;
import gotravel.terminal.Terminal;

public class DeleteController extends Controller {

    public DeleteController(ListaPropietario listaPropietario) {
        super(listaPropietario);
    }

    @Override
    public void control() {
        listaPropietario.delete(this.inputRut());
    }
    
    private String inputRut() {
        new Terminal().showMessageln("Ingresar Rut: ");
        return new Terminal().inputString();
    }
}
