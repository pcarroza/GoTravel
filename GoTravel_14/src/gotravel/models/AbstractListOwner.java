package gotravel.models;

import java.util.ArrayList;

import gotravel.terminal.Terminal;

public abstract class AbstractListOwner {

    protected ArrayList<Owner> ownerList;

    protected AbstractListOwner(ArrayList<Owner> ownerList) {
        this.ownerList = ownerList;
    }

    public void showInformacionPropietario(String rut) {
        showMenssageVoid(ownerList);
        ownerList.forEach((propietario) -> {
            if (propietario.isEquals(rut)) {
                propietario.showInformacionPropietario();
            } else {
                this.showMessage("NO EXISTE INFORMACIÓN DEL PROPIETARIO");
            }
        });
    }

    public void delete(String rut) {
        showMenssageVoid(ownerList);
        for (Owner propietario : ownerList) {
            if (propietario.isEquals(rut)) {
                ownerList.remove(propietario);
                this.showMessage("EL REGISTRO HA SIDO ELIMINADO EXITOSAMENTE");
                break;
            } else {
                this.showMessage("NO EXISTE INFORMACIÓN DEL PROPIETARIO");
            }
        }
    }

    public void update(String rut) {
        showMenssageVoid(ownerList);
        ownerList.forEach((propietario) -> {
            if (propietario.isEquals(rut)) {
                propietario.update();
            } else {
                this.showMessage("NO EXISTE INFORMACIÓN DEL PROPIETARIO");
            }
        });
    }

    public void listarPropietarios() {
        showMenssageVoid(ownerList);
        ownerList.forEach((propietario) -> propietario.showInformacionPropietario());
    }

    public abstract void showMenssageVoid(ArrayList<Owner> listaPropietario);

    private void showMessage(String title) {
        Terminal gestorIO = new Terminal();
        gestorIO.showMessageln("-------------------------------------------");
        gestorIO.showMessageln(title);
        gestorIO.showMessageln("-------------------------------------------");
    }

}
