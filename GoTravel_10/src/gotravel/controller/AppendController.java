package gotravel.controller;

import gotravel.models.ListaPropietario;
import gotravel.models.Propietario;

public class AppendController {

    private ListaPropietario listaPropietario;

    public AppendController(ListaPropietario listaPropietario) {
        assert listaPropietario != null;
        this.listaPropietario = listaPropietario;
    }

    public void append() {
        Propietario propietario = new Propietario();
        propietario.ingresarInformacionPropietario();
        listaPropietario.agregar(propietario);
    }

}
