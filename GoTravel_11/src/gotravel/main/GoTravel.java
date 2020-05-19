package gotravel.main;

import gotravel.controller.AppendController;
import gotravel.controller.Controller;
import gotravel.controller.DeleteController;
import gotravel.controller.ListController;
import gotravel.controller.SearchController;
import gotravel.controller.UpdateController;
import gotravel.models.ListaPropietario;
import gotravel.options.Menu;
import gotravel.terminal.DialogoIntegerLimitado;

public class GoTravel {

    private Controller[] controllers;
    
    private ListaPropietario listaPropietario;
    
    private static final int LIMIT_MINIMUN = 1;
    
    private static final int LIMIT_MAXIMUN = 6;
    
    private static final int NUMBER_OF_CONTROLLERS = LIMIT_MAXIMUN - 1;

    public GoTravel() {
        listaPropietario = new ListaPropietario();
        controllers = new Controller[NUMBER_OF_CONTROLLERS];
        controllers[0] = new AppendController(listaPropietario);
        controllers[1] = new SearchController(listaPropietario);
        controllers[2] = new DeleteController(listaPropietario);
        controllers[3] = new UpdateController(listaPropietario);
        controllers[4] = new ListController(listaPropietario);
    }

    public void ejecutar() {
        boolean finished = false;
        int index;
        do {
            new Menu().showMenu();
            index = new DialogoIntegerLimitado("Ingrese opcion ", LIMIT_MINIMUN, LIMIT_MAXIMUN).read();
            if (index != 6) {
                controllers[index - 1].control();
            } else {
                finished = true;
            }
        } while (!finished);
    }

    public static void main(String[] args) {
        new GoTravel().ejecutar();
    }
}
