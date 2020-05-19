package gotravel.models;

import java.util.ArrayList;

import gotravel.terminal.Terminal;

public class ListaPropietario {

    private ArrayList<Propietario> listaDepropietario;

    public ListaPropietario() {
        listaDepropietario = new ArrayList<>();
    }

    public void agregar(Propietario propietario) {
        listaDepropietario.add(propietario);
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

    public void search(String rut) {
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
