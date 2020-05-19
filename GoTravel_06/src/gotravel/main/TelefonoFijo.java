package gotravel.main;

public class TelefonoFijo extends Telefono {

    private String numeroTelefonoFijo;

    public TelefonoFijo() {
    }

    private void setFonoResidencial(String numeroTelefonoFijo) {
        this.numeroTelefonoFijo = numeroTelefonoFijo;
    }

    public void ingresarNumeroTelefonoFijo() {
        GestorIO gestorIO = new GestorIO();
        gestorIO.showMessageln("9) Ingrese Numero de Telefono: ");
        setFonoResidencial(gestorIO.inputString());
    }
}
