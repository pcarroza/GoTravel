package gotravel.controller;

import gotravel.models.ListaPropietario;

public class ListController {

    private ListaPropietario listaPropietario;

    public ListController(ListaPropietario listaPropietario) {
        assert listaPropietario != null;
        this.listaPropietario = listaPropietario;
    }

    public void listOwnerInformation() {
        listaPropietario.listarPropietarios();
    }
}
