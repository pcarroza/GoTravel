package gotravel.controllers;

import gotravel.models.ListaPropietario;
import gotravel.utils.ClosedInterval;

public class Logic {

    private ArrayControlles arrayControllers;
    
    private ListaPropietario listaPropietario;
    
    public Logic() {
        listaPropietario = new ListaPropietario();
        arrayControllers = new ArrayControlles(Constant.NUMBER_OF_CONTROLLERS);
        arrayControllers.append(new AppendController(listaPropietario));
        arrayControllers.append(new SearchController(listaPropietario));
        arrayControllers.append(new DeleteController(listaPropietario));
        arrayControllers.append(new UpdateController(listaPropietario));
        arrayControllers.append(new ListController(listaPropietario));
    }

    public Controller getController(int index) {
        assert new ClosedInterval(Constant.LIMIT_MAXIMUN_OF_OPTIONS).isInclued(index);
        return index != Constant.LIMIT_MAXIMUN_OF_OPTIONS ? arrayControllers.getController(index) : null;
    }
}
