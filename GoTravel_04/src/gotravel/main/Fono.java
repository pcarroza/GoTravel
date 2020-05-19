package gotravel.main;

public class Fono {

    public String fonoResidencial;
    public String celular;

    public String getFonoResidencial() {
        return fonoResidencial;
    }

    public void setFonoResidencial(String fonoResidencial) {
        this.fonoResidencial = fonoResidencial;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public boolean verificarFono(String fonoResidencial) {
        return this.fonoResidencial.equals(fonoResidencial);
    }

    public boolean celular(String telefono) {
        return this.celular.equals(telefono);
    }

    public void ingresarInformacion() {
        GestorIO gestorIO = new GestorIO(); 
        gestorIO.showMessageln("9) Ingrese Numero de Telefono: ");
        setFonoResidencial(gestorIO.inputString());
        gestorIO.showMessageln("10) Ingrese Numero de Celular: ");
        setCelular(gestorIO.inputString());
    }

}
