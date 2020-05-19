package gotravel.controllers;

import gotravel.models.ListaPropietario;
import gotravel.view.View;

public class ListController extends Controller {

    public ListController(ListaPropietario listaPropietario) {
        super(listaPropietario);
    }

    @Override
    public void acept(View travelReservationView) {
        travelReservationView.visit(this);
        
    }
}
