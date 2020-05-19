package gotravel.models;

public class Propietario extends Persona {
    
    private Formulario formulario;
    
    private Sepultura sepultura;

    public Propietario() {
        sepultura = new Sepultura();
        formulario = new Formulario();
    }

    public void agregarSepultura() {
        sepultura.agregarSepultura();
    }

    public boolean validarCorreo(String email) {
        return formulario.esValidoEmail(email);
    }

    public void ingresarInformacionPropietario() {
        this.ingresarInformacion();
        formulario.ingresarInformacionPropietario();
    }

    public boolean isEquals(String rut) {
        return this.getRut().equals(rut);
    }

    public void showInformacionPropietario() {
        this.showPersonInformation();
        formulario.showFormInformation();
    }

    public void update() {
        this.ingresarInformacion();
        formulario.ingresarInformacionPropietario();
    }
}
