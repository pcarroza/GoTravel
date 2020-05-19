package gotravel.models;

import java.util.ArrayList;

import gotravel.terminal.Terminal;

public class ListaPropietario {

    private ArrayList<Propietario> listaDepropietario;
    
    private boolean salir = false;

    public ListaPropietario() {
        listaDepropietario = new ArrayList<>();
    }

    public void agregar(Propietario propietario) {
        listaDepropietario.add(propietario);
    }

    public Propietario getPropietario(String rut) {
        for (Propietario propietario : listaDepropietario) {
            if (propietario.isEquals(rut)) {
                return propietario;
            }
        }
        return null;
    }

    public void showInformacionPropietario(String rut) {
        if (listaDepropietario.isEmpty()) {
            this.showMessage("REGISTRO VACIO");
        }
        for (Propietario propietario : listaDepropietario) {
            if (propietario.isEquals(rut)) {
                propietario.showInformacionPropietario();
            } else {
                this.showMessage("NO EXISTE INFORMACIÓN DEL PROPIETARIO");
            }
        }
    }

    public void delete(String rut) {
        if (listaDepropietario.isEmpty()) {
            this.showMessage("REGISTRO VACIO");
        }
        for (int i = 0; i < listaDepropietario.size(); i++) {
            if (listaDepropietario.get(i).isEquals(rut)) {
                listaDepropietario.remove(i);
                this.showMessage("EL REGISTRO HA SIDO ELIMINADO EXITOSAMENTE");
            } else {
                this.showMessage("NO EXISTE INFORMACIÓN DEL PROPIETARIO");
            }
        }
    }

    public void update(String rut) {
        if (listaDepropietario.isEmpty()) {
            this.showMessage("REGISTRO VACIO");
        }
        for (Propietario propietario : listaDepropietario) {
            if (propietario.isEquals(rut)) {
                propietario.update();
            } else {
                this.showMessage("NO EXISTE INFORMACIÓN DEL PROPIETARIO");
            }
        }
    }

    public void listarPropietarios() {
        if (listaDepropietario.isEmpty()) {
            this.showMessage("REGISTRO VACIO");
        }
        for (Propietario propietario : listaDepropietario) {
            propietario.showInformacionPropietario();
        }
    }

    private void showMessage(String title) {
        Terminal gestorIO = new Terminal();
        gestorIO.showMessageln("-------------------------------------------");
        gestorIO.showMessageln(title);
        gestorIO.showMessageln("-------------------------------------------");
    }
}
