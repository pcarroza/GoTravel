package gotravel.view;

import gotravel.controllers.AppendController;
import gotravel.controllers.Controller;
import gotravel.controllers.DeleteController;
import gotravel.controllers.ListController;
import gotravel.controllers.SearchController;
import gotravel.controllers.UpdateController;
import gotravel.localcontroller.Constant;
import gotravel.options.Menu;
import gotravel.utils.LimitedIntegerDialog;

public class View {

    public void interact(Controller controller) {
        assert controller != null;
        controller.acept(this);
    }

    public void visit(AppendController appendController) {
        assert appendController != null;
        new PropietarioView(appendController).appendInformationOwner();
    }

    public void visit(DeleteController deleteController) {
        assert deleteController != null;
        new DeleteView(deleteController).deleteOwner();
    }

    public void visit(ListController listController) {
        assert listController != null;
        new ListOwnersView(listController).showOnwer();
    }

    public void visit(SearchController searchController) {
        assert searchController != null;
        new SearchView(searchController).searchOwner();
    }

    public void visit(UpdateController updateController) {
        assert updateController != null;
        new UpdateView(updateController).updateOwner();
    }

    public int getIndex() {
        return new LimitedIntegerDialog("Ingrese Opcion: ", Constant.LIMIT_MAXIMUN_OF_OPTIONS).read();
    }

    public void showMenu() {
        new Menu().showMenu();
    }
}
