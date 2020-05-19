package gotravel.controllers;

import gotravel.models.ListaPropietario;
import gotravel.view.View;

public class DeleteController extends Controller {

    public DeleteController(ListaPropietario listaPropietario) {
        super(listaPropietario);
    }

    @Override
    public void acept(View trevalReservationView) {
        trevalReservationView.visit(this);
    }
}
