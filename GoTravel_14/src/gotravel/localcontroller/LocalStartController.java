package gotravel.localcontroller;

import gotravel.controllers.Controller;
import gotravel.controllers.StartController;
import gotravel.models.Assembler;
import gotravel.models.Eliminator;
import gotravel.models.Inspector;
import gotravel.models.ListManager;
import gotravel.view.View;

public class LocalStartController implements StartController {

    private ArrayControlles arrayControllers;

    public LocalStartController() {
        arrayControllers = new ArrayControlles(Constant.NUMBER_OF_CONTROLLERS);
        arrayControllers.append(new LocalAppendController(new Assembler()));
        arrayControllers.append(new LocalSearchController(new Inspector()));
        arrayControllers.append(new LocalDeleteController(new Eliminator()));
        arrayControllers.append(new LocalUpdateController(new Inspector()));
        arrayControllers.append(new LocalListController(new ListManager()));
    }

    public Controller getController(int index) {
        if (index < Constant.LIMIT_MAXIMUN_OF_OPTIONS) {
            return arrayControllers.getController(index);
        }
        return null;
    }

    @Override
    public void acept(View view) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
