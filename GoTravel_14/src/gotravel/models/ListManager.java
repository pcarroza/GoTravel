package gotravel.models;

import gotravel.terminal.Terminal;

public class ListManager extends OwnerManager {

    public ListManager() {
        super();
    }

    public void showInformacionPropietario(String rut) {
        if (listaDepropietario.isEmpty()) {
            this.showMessage("REGISTRO VACIO");
        } else {
            for (Propietario propietario : listaDepropietario) {
                if (propietario.isEquals(rut)) {
                    propietario.showInformacionPropietario();
                } else {
                    this.showMessage("NO EXISTE INFORMACIÓN DEL PROPIETARIO");
                }
            }
        }
    }

    public void listarPropietarios() {
        if (listaDepropietario.isEmpty()) {
            this.showMessage("REGISTRO VACIO");
        } else {
            for (Propietario propietario : listaDepropietario) {
                propietario.showInformacionPropietario();
            }
        }
    }

    private void showMessage(String title) {
        Terminal gestorIO = new Terminal();
        gestorIO.showMessageln("-------------------------------------------");
        gestorIO.showMessageln(title);
        gestorIO.showMessageln("-------------------------------------------");
    }
}
