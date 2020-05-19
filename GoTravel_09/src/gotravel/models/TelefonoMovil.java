package gotravel.models;

import gotravel.terminal.Terminal;

public class TelefonoMovil extends Telefono {

    private String numeroTelefonoMovil;

    public TelefonoMovil() {
    }

    @Override
    public void setFono(String numeroTelefono) {
        this.numeroTelefonoMovil = numeroTelefono;

    }
    
    @Override
    public void showPhoneInformation() {
        new Terminal().showMessageln("Teléfono Celular :" + numeroTelefonoMovil);
    }
}
