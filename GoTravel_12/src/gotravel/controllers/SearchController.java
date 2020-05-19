package gotravel.controllers;

import gotravel.models.ListaPropietario;
import gotravel.terminal.Terminal;

public class SearchController extends Controller {

    public SearchController(ListaPropietario listaPropietario) {
        super(listaPropietario);
    }

    @Override
    public void control() {
        this.listaPropietario.search(this.inputRut());
    }
    
    private String inputRut() {
        new Terminal().showMessageln("Ingresar Rut: ");
        return new Terminal().inputString();
    }
}
