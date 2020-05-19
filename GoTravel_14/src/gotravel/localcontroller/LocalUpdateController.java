package gotravel.localcontroller;

import gotravel.controllers.UpdateController;
import gotravel.models.OwnerManager;
import gotravel.view.View;

public class LocalUpdateController extends LocalController implements UpdateController {

    private OwnerManager ownerManager;
    
    public LocalUpdateController(OwnerManager ownerManager) {
        this.ownerManager = ownerManager;
    }

    @Override
    public void acept(View travelReservationView) {
        travelReservationView.visit(this);
    }
}
