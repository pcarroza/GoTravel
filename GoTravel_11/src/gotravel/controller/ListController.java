package gotravel.controller;

import gotravel.models.ListaPropietario;

public class ListController extends Controller {

    private ListaPropietario listaPropietario;

    public ListController(ListaPropietario listaPropietario) {
        assert listaPropietario != null;
        this.listaPropietario = listaPropietario;
    }

    @Override
    public void control() {
        listaPropietario.listarPropietarios();
    }
}
