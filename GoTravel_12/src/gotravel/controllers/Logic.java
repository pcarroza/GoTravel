package gotravel.controllers;

import gotravel.models.ListaPropietario;
import gotravel.terminal.DialogoIntegerLimitado;

public class Logic {

    private ArrayControlles arrayControllers;
    
    private ListaPropietario listaPropietario;
    
    private int index = 0; 
    
    public Logic() {
        listaPropietario = new ListaPropietario();
        arrayControllers = new ArrayControlles(Constant.NUMBER_OF_CONTROLLERS);
        arrayControllers.append(new AppendController(listaPropietario));
        arrayControllers.append(new SearchController(listaPropietario));
        arrayControllers.append(new DeleteController(listaPropietario));
        arrayControllers.append(new UpdateController(listaPropietario));
        arrayControllers.append(new ListController(listaPropietario));
    }

    public Controller getController() {
        index = new DialogoIntegerLimitado("Ingrese opcion ", 
                Constant.LIMIT_MINIMUN_OF_OPTIONS, Constant.LIMIT_MAXIMUN_OF_OPTIONS).read();
        if (index != 6) {
            return arrayControllers.getController(index); 
        }
        return null;
    }
}
