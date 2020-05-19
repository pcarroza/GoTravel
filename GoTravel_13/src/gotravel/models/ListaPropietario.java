package gotravel.models;

public class ListaPropietario extends ListaAbstractaPropietario {

    @Override
    public void searchPropietario(String rut) {
        assert rut != null;
        for (Propietario propietario : listaDepropietario) {
            if (propietario.isEquals(rut)) {
                propietario.showInformacionPropietario();
            } else {
                this.showMessage("NO EXISTE INFORMACIÓN DEL PROPIETARIO");
            }
        }
    }

    @Override
    public void deletePropietario(String rut) {
        assert rut != null;
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

    @Override
    public void updatePropietario(String rut) {
        for (Propietario propietario : listaDepropietario) {
            if (propietario.isEquals(rut)) {
                propietario.update();
            } else {
                this.showMessage("NO EXISTE INFORMACIÓN DEL PROPIETARIO");
            }
        }
    }
}
