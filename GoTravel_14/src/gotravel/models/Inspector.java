package gotravel.models;

import gotravel.terminal.Terminal;

public class Inspector extends OwnerManager {

    public Inspector() {
        super();
    }

    public void search(String rut) {
        if (this.listaDepropietario.isEmpty()) {
            this.showMessage("REGISTRO VACIO");
        } else {
            for (Owner propietario : listaDepropietario) {
                if (propietario.isEquals(rut)) {
                    propietario.showInformacionPropietario();
                } else {
                    this.showMessage("NO EXISTE INFORMACIÓN DEL PROPIETARIO");
                }
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
