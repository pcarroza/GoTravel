package gotravel.models;

import gotravel.terminal.Terminal;

public class TelefonoFijo extends Phone {

    private String numeroTelefonoFijo;

    public TelefonoFijo() {
        super("9) Ingrese Numero de Telefono: ");
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
