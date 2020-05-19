package gotravel.controller;

import gotravel.models.ListaPropietario;
import gotravel.terminal.Terminal;

public class SearchController extends Controller {

    private ListaPropietario listaPropietario;

    public SearchController(ListaPropietario listaPropietario) {
        assert listaPropietario != null;
        this.listaPropietario = listaPropietario;
    }

    @Override
    public void control() {
        listaPropietario.search(this.inputRut());
    }
    
    private String inputRut() {
        new Terminal().showMessageln("Ingresar Rut: ");
        return new Terminal().inputString();
    }
}
