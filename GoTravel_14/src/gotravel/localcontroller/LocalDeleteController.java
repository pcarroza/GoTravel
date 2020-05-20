package gotravel.localcontroller;

import gotravel.controllers.DeleteController;
import gotravel.models.OwnerManager;
import gotravel.view.View;

public class LocalDeleteController extends LocalController implements DeleteController {

    private OwnerManager ownerManager;

    public LocalDeleteController(OwnerManager ownerManager) {
        this.ownerManager = ownerManager;
    }

    @Override
    public void acept(View view) {
        view.visit(this);
    }
}

