package gotravel.main;

public class TelefonoMovil extends Telefono {

    private String numeroTelefonoMovil;

    public TelefonoMovil() {
    }
    
    private void setCelular(String numeroTelefonoMovil) {
        this.numeroTelefonoMovil = numeroTelefonoMovil;
    }
    
    public void ingresarNumeroTelefonoMovil() {
        GestorIO gestorIO = new GestorIO();
        gestorIO.showMessageln("9) Ingrese Numero de Celular: ");
        setCelular(gestorIO.inputString());
    }
}
