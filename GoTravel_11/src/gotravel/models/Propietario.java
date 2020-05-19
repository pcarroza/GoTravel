package gotravel.models;

public class Propietario extends Persona {
    
    private Formulario formulario;

    public Propietario() {
        formulario = new Formulario();
    }
    
    public void ingresarInformacionPropietario() {
        this.ingresarInformacion();
        formulario.ingresarInformacionPropietario();
    }
    
    public void showInformacionPropietario() {
        this.showPersonInformation();
        formulario.showFormInformation();
    }
    
    public void update() {
        this.ingresarInformacionPropietario();
    }

    public boolean isEquals(String rut) {
        return this.getRut().equals(rut); 
    }
}
