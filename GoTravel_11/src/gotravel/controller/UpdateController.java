package gotravel.controller;

import gotravel.models.ListaPropietario;
import gotravel.terminal.Terminal;

public class UpdateController extends Controller {

    private ListaPropietario listaPropietario;

    public UpdateController(ListaPropietario listaPropietario) {
        assert listaPropietario != null;
        this.listaPropietario = listaPropietario;
    }

    @Override
    public void control() {
         listaPropietario.update(this.inputRut());
    }
    
    private String inputRut() {
        new Terminal().showMessageln("Ingresar Rut: ");
        return new Terminal().inputString();
    }
}
