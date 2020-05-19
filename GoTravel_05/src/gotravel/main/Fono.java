package gotravel.main;

public class Fono {

    private String fonoResidencial;
    private String celular;

    private void setFonoResidencial(String fonoResidencial) {
        this.fonoResidencial = fonoResidencial;
    }

    private void setCelular(String celular) {
        this.celular = celular;
    }

    public void ingresarInformacion() {
        GestorIO gestorIO = new GestorIO();
        gestorIO.showMessageln("9) Ingrese Numero de Telefono: ");
        setFonoResidencial(gestorIO.inputString());
        gestorIO.showMessageln("10) Ingrese Numero de Celular: ");
        setCelular(gestorIO.inputString());
    }

}
