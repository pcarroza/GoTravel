package gotravel.main;

import java.util.ArrayList;

public class ListaPropietario {

    private ArrayList<Propietario> listaDePropietario;
    
    public ListaPropietario() {
        listaDePropietario = new ArrayList<>();
    }

    public void agregar(Propietario propietario) {
        assert propietario != null;
        listaDePropietario.add(propietario);
    }

    public void showInformacionPropietario(String rut) {
        if (listaDePropietario.isEmpty()) {
            this.showMessage("REGISTRO VACIO");
        }
        for (Propietario propietario : listaDePropietario) {
            if (propietario.isEquals(rut)) {
                propietario.showInformacionPropietario();
            } else {
                this.showMessage("NO EXISTE INFORMACIÓN DEL PROPIETARIO");
            }
        }
    }

    public void delete(String rut) {
        if (listaDePropietario.isEmpty()) {
            this.showMessage("REGISTRO VACIO");
        }
        for (Propietario propietario : listaDePropietario) {
            if (propietario.isEquals(rut)) {
                listaDePropietario.remove(propietario);
                this.showMessage("EL REGISTRO HA SIDO ELIMINADO EXITOSAMENTE");
                break; 
            } else {
                this.showMessage("NO EXISTE INFORMACIÓN DEL PROPIETARIO");
            }
        }
    }

    public void update(String rut) {
        if (listaDePropietario.isEmpty()) {
            this.showMessage("REGISTRO VACIO");
        }
        for (Propietario propietario : listaDePropietario) {
            if (propietario.isEquals(rut)) {
                propietario.update();
            } else {
                this.showMessage("NO EXISTE INFORMACIÓN DEL PROPIETARIO");
            }
        }
    }

    public void listarPropietarios() {
        if (listaDePropietario.isEmpty()) {
            this.showMessage("REGISTRO VACIO");
        }
        for (Propietario propietario : listaDePropietario) {
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
