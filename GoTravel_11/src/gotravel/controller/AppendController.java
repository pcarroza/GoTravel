package gotravel.controller;

import gotravel.models.ListaPropietario;
import gotravel.models.Propietario;

public class AppendController extends Controller {

    private ListaPropietario listaPropietario;

    public AppendController(ListaPropietario listaPropietario) {
        assert listaPropietario != null;
        this.listaPropietario = listaPropietario;
    }

    @Override
    public void control() {
        Propietario propietario = new Propietario();
        propietario.ingresarInformacionPropietario();
        listaPropietario.agregar(propietario);
    }
}
