package gotravel.controllers;

import gotravel.models.ListaPropietario;
import gotravel.models.Propietario;

public class AppendController extends Controller {

    public AppendController(ListaPropietario listaPropietario) {
        super(listaPropietario);
    }

    @Override
    public void control() {
        Propietario propietario = new Propietario();
        propietario.ingresarInformacionPropietario();
        listaPropietario.agregar(propietario);
    }
}
