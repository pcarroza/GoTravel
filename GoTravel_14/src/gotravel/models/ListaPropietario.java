package gotravel.models;

import java.util.ArrayList;

import gotravel.terminal.Terminal;

public class ListaPropietario extends AbstractListOwner {

    public ListaPropietario(ArrayList<Propietario> listaDepropietario) {
        super(listaDepropietario);
    }

    public void add(Propietario propietario) {
        listaDepropietario.add(propietario);
    }
    
    public void search(String rut) {
        this.showInformacionPropietario(rut);
    }
   
    @Override
    public void showMenssageVoid(ArrayList<Propietario> listaPropietario) {
        if (listaDepropietario.isEmpty()) {
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
