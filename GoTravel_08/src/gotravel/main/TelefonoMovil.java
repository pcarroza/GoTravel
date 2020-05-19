package gotravel.main;

public class TelefonoMovil extends Telefono {

    private String numeroTelefonoMovil;

    public TelefonoMovil() {
        super("9) Ingrese Numero de Celular: ");
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
