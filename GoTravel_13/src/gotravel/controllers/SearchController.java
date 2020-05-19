package gotravel.controllers;

import gotravel.models.ListaPropietario;
import gotravel.view.View;

public class SearchController extends Controller {

    public SearchController(ListaPropietario listaPropietario) {
        super(listaPropietario);
    }

    @Override
    public void acept(View trevalReservationView) {
        trevalReservationView.visit(this);
    }
}
