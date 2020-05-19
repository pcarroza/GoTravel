package gotravel.models;

import gotravel.terminal.Terminal;

public class Restorer extends OwnerManager {
    
    public Restorer() {
        super();
    }

    public void update(String rut) {
        if (listaDepropietario.isEmpty()) {
            this.showMessage("REGISTRO VACIO");
        } else {
            for (Propietario propietario : listaDepropietario) {
                if (propietario.isEquals(rut)) {
                    propietario.update();
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
