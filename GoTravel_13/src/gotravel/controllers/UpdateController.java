package gotravel.controllers;

import gotravel.models.ListaPropietario;
import gotravel.view.View;

public class UpdateController extends Controller {

    public UpdateController(ListaPropietario listaPropietario) {
        super(listaPropietario);
    }

    @Override
    public void acept(View travelReservationView) {
        travelReservationView.visit(this);
    }
}
