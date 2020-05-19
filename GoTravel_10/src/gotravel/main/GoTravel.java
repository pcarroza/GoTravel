package gotravel.main;

import gotravel.controller.AppendController;
import gotravel.controller.DeleteController;
import gotravel.controller.ListController;
import gotravel.controller.SearchController;
import gotravel.controller.UpdateController;
import gotravel.models.ListaPropietario;
import gotravel.options.Menu;
import gotravel.terminal.DialogoIntegerLimitado;
import gotravel.terminal.Terminal;

public class GoTravel {
    
    private ListaPropietario listaPropietario; 
    
    private SearchController  searchController;
    
    private AppendController appendController;
    
    private UpdateController updateController;
    
    private DeleteController deleteController;
    
    private ListController listarController;
    
    private static final int LIMIT_MINIMUN = 1;
    
    private static final int LIMIT_MAXIMUN = 6;

    public GoTravel() {
        listaPropietario = new ListaPropietario();
        searchController = new SearchController(listaPropietario);
        appendController = new AppendController(listaPropietario);
        updateController = new UpdateController(listaPropietario); 
        deleteController = new DeleteController(listaPropietario); 
        listarController = new ListController(listaPropietario); 
    }

    public void run() {
        boolean finished = false;
        int opcion;
        do {
            new Menu().showMenu();
            opcion = new DialogoIntegerLimitado("Ingrese opcionn ", LIMIT_MINIMUN, LIMIT_MAXIMUN).read();
            switch (opcion) {
                case 1:
                    appendController.append();
                    break;
                case 2:
                    searchController.search();
                    break;
                case 3:
                    deleteController.delete();
                    break;
                case 4:
                    updateController.update();
                    break;
                case 5:
                    listarController.listOwnerInformation();
                    break;
                case 6:
                    finished = true;
                    break;
                default:
                    new Terminal().showMessageln("ERROR. OPCION NO EXISTENTE");
            }
        } while (!finished);
    }

    public static void main(String[] args) {
        new GoTravel().run();
    }
}
