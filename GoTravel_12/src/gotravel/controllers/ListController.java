package gotravel.controllers;

import gotravel.models.ListaPropietario;

public class ListController extends Controller {

    public ListController(ListaPropietario listaPropietario) {
        super(listaPropietario);
    }

    @Override
    public void control() {
        listaPropietario.listarPropietarios();
    }
}
