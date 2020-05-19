package gotravel.models;

import java.util.ArrayList;

import gotravel.terminal.Terminal;

public abstract class AbstractListOwner {

    protected ArrayList<Propietario> listaDepropietario;

    protected AbstractListOwner(ArrayList<Propietario> listaDepropietario) {
        this.listaDepropietario = listaDepropietario;
    }

    public void showInformacionPropietario(String rut) {
        showMenssageVoid(listaDepropietario);
        listaDepropietario.forEach((propietario) -> {
            if (propietario.isEquals(rut)) {
                propietario.showInformacionPropietario();
            } else {
                this.showMessage("NO EXISTE INFORMACIÓN DEL PROPIETARIO");
            }
        });
    }

    public void delete(String rut) {
        showMenssageVoid(listaDepropietario);
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

    public void update(String rut) {
        showMenssageVoid(listaDepropietario);
        listaDepropietario.forEach((propietario) -> {
            if (propietario.isEquals(rut)) {
                propietario.update();
            } else {
                this.showMessage("NO EXISTE INFORMACIÓN DEL PROPIETARIO");
            }
        });
    }

    public void listarPropietarios() {
        showMenssageVoid(listaDepropietario);
        listaDepropietario.forEach((propietario) -> propietario.showInformacionPropietario());
    }

    public abstract void showMenssageVoid(ArrayList<Propietario> listaPropietario);

    private void showMessage(String title) {
        Terminal gestorIO = new Terminal();
        gestorIO.showMessageln("-------------------------------------------");
        gestorIO.showMessageln(title);
        gestorIO.showMessageln("-------------------------------------------");
    }

}
