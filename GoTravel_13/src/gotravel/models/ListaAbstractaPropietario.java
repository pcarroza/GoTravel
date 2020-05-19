package gotravel.models;

import java.util.ArrayList;

import gotravel.terminal.Terminal;

public abstract class ListaAbstractaPropietario {

    protected ArrayList<Propietario> listaDepropietario;

    protected ListaAbstractaPropietario() {
        listaDepropietario = new ArrayList<>();
    }

    public void agregar(Propietario propietario) {
        listaDepropietario.add(propietario);
    }

    public void showInformacionPropietario(String rut) {
        this.search(rut);
    }

    public void search(String rut) {
        if (listaDepropietario.isEmpty()) {
            this.showMessage("REGISTRO VACIO");
        } else {
            this.searchPropietario(rut);
        }
    }
    
    protected abstract void searchPropietario(String rut);

    public void delete(String rut) {
        if (listaDepropietario.isEmpty()) {
            this.showMessage("REGISTRO VACIO");
        } else {
            this.deletePropietario(rut);
        }
    }
    
    protected abstract void deletePropietario(String rut);

    public void update(String rut) {
        if (listaDepropietario.isEmpty()) {
            this.showMessage("REGISTRO VACIO");
        } else {
            this.updatePropietario(rut);
        }
    }
    
    protected abstract void updatePropietario(String rut);

    public void listarPropietarios() {
        if (listaDepropietario.isEmpty()) {
            this.showMessage("REGISTRO VACIO");
        } else {
            for (Propietario propietario : listaDepropietario) {
                propietario.showInformacionPropietario();
            }
        }
    }

    protected void showMessage(String title) {
        Terminal gestorIO = new Terminal();
        gestorIO.showMessageln("-------------------------------------------");
        gestorIO.showMessageln(title);
        gestorIO.showMessageln("-------------------------------------------");
    }
}
