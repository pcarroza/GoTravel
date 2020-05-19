package gotravel.view;

import gotravel.controllers.AppendController;
import gotravel.controllers.Constant;
import gotravel.controllers.Controller;
import gotravel.controllers.DeleteController;
import gotravel.controllers.ListController;
import gotravel.controllers.SearchController;
import gotravel.controllers.UpdateController;
import gotravel.models.Propietario;
import gotravel.options.Menu;
import gotravel.terminal.DialogoIntegerLimitado;

public class View {

    public void interact(Controller controller) {
        assert controller != null; 
        controller.acept(this);
    }

    public void showMenu() {
        new Menu().showMenu();
    }

    public void visit(AppendController appendController) {
        assert appendController != null; 
        PropietarioView propietarioView = new PropietarioView();
        appendController.setNewOwner(new Propietario());
        appendController.appendOwnerInformation(propietarioView.getOwnerInformation());
        appendController.appendOwnerAddress(propietarioView.getOwnerAddress());
        appendController.appendOwnerPhone(propietarioView.getOwnerPhone());
        appendController.appendOwnerEmail(propietarioView.getEmail());
        appendController.appendOwnerList();
    }
    
    public void visit(DeleteController deleteController) {
       // deleteController.control();
    }

    public void visit(ListController listController) {
    }
    
    public void visit(SearchController searchController) {
    }
    
    public void visit(UpdateController updateController) {
    }

    public int getIndex() {
        return new DialogoIntegerLimitado("Ingrese Opcion: ",Constant.LIMIT_MAXIMUN_OF_OPTIONS).read(); 
    }
}
