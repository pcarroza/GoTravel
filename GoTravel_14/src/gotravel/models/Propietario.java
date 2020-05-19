package gotravel.models;

public class Propietario extends Persona {
    
    private Formulario formulario;

    public Propietario() {
        formulario = new Formulario();
    }
    
    public void ingresarInformacionPropietario(String[] ownerInformation) {
        this.setOwnerInformation(ownerInformation);
    }
    
    public void ingresarInformacionDireccion(String[] formulario) {
        this.formulario.ingresarDireccion(formulario);
    }
    
    public void ingresarNumeroTelefono(Telefono telefono) {
        formulario.ingresarTelefono(telefono);
    }

    public void ingresarEmail(String email) {
        formulario.ingresarEmail(email);
    }
    
    public void update() {
    }

    public boolean isEquals(String rut) {
        return this.getRut().equals(rut); 
    }
    
    public void showInformacionPropietario() {
        this.showPersonInformation();
        formulario.showFormInformation();
    }
}
