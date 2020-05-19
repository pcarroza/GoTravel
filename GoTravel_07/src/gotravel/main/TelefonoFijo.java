package gotravel.main;

public class TelefonoFijo extends Telefono {

    private String numeroTelefonoFijo;

    public TelefonoFijo() {
    }
    
    @Override
    public void setFono(String numeroTelefono) {
        this.numeroTelefonoFijo = numeroTelefono;
    }
}
