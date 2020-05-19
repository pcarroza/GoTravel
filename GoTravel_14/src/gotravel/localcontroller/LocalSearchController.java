package gotravel.localcontroller;

import gotravel.controllers.SearchController;
import gotravel.models.OwnerManager;
import gotravel.view.View;

public class LocalSearchController extends LocalController implements SearchController {

    private OwnerManager ownerManager;
    
    public LocalSearchController(OwnerManager ownerManager) {
        this.ownerManager = ownerManager;
    }

    @Override
    public void acept(View trevalReservationView) {
        trevalReservationView.visit(this);
    }
}
