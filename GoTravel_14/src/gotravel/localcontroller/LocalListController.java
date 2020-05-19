package gotravel.localcontroller;

import gotravel.controllers.ListController;
import gotravel.models.OwnerManager;
import gotravel.view.View;

public class LocalListController extends LocalController implements ListController {
    
    private OwnerManager ownerManager;

    public LocalListController(OwnerManager ownerManager) {
        this.ownerManager = ownerManager;
    }

    @Override
    public void acept(View travelReservationView) {
        travelReservationView.visit(this);
    }
}
