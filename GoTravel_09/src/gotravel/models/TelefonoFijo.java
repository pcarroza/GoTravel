package gotravel.models;

import gotravel.terminal.Terminal;

public class TelefonoFijo extends Telefono {

    private String numeroTelefonoFijo;

    public TelefonoFijo() {
    }
    
    @Override
    public void setFono(String numeroTelefono) {
        this.numeroTelefonoFijo = numeroTelefono;
    }
    
    @Override
    public void showPhoneInformation() {
        new Terminal().showMessageln("Teléfono Fijo    :" + numeroTelefonoFijo);
    }
}
