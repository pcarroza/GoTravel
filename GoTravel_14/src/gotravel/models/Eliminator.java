package gotravel.models;

import gotravel.terminal.Terminal;

public class Eliminator extends OwnerManager {

    public Eliminator() {
        super();
    }
    
    public void delete(String rut) {
        if (listaDepropietario.isEmpty()) {
            this.showMessage("REGISTRO VACIO");
        } else {
            for (Propietario propietario : listaDepropietario) {
                if (propietario.isEquals(rut)) {
                    listaDepropietario.remove(propietario);
                    this.showMessage("EL REGISTRO HA SIDO ELIMINADO EXITOSAMENTE");
                    break; 
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
