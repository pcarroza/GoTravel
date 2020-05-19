package gotravel.controllers;

import gotravel.models.ListaPropietario;
import gotravel.terminal.Terminal;

public class UpdateController extends Controller {

    public UpdateController(ListaPropietario listaPropietario) {
        super(listaPropietario);
    }

    @Override
    public void control() {
         this.listaPropietario.update(this.inputRut());
    }
    
    private String inputRut() {
        new Terminal().showMessageln("Ingresar Rut: ");
        return new Terminal().inputString();
    }
}
