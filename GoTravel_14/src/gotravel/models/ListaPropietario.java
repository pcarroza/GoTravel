package gotravel.models;

import java.util.ArrayList;

import gotravel.terminal.Terminal;

public class ListaPropietario extends AbstractListOwner {

    public ListaPropietario(ArrayList<Owner> listaDepropietario) {
        super(listaDepropietario);
    }

    public void add(Owner propietario) {
        ownerList.add(propietario);
    }
    
    public void search(String rut) {
        this.showInformacionPropietario(rut);
    }
   
    @Override
    public void showMenssageVoid(ArrayList<Owner> listaPropietario) {
        if (ownerList.isEmpty()) {
            this.showMessage("REGISTRO VACIO");
        }
    }
    
    private void showMessage(String title) {
        Terminal gestorIO = new Terminal();
        gestorIO.showMessageln("-------------------------------------------");
        gestorIO.showMessageln(title);
        gestorIO.showMessageln("-------------------------------------------");
    }
}
