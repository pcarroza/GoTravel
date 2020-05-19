package gotravel.models;

public class Formulario {

    private Direccion direccion;
    
    private Telefono telefono;
    
    private Email email;

    public Formulario() {
        direccion = new Direccion();
        email = new Email();
    }

    public void ingresarDireccion(String[] formulario) {
        direccion.ingresarDireccion(formulario);
    }
    
    public void ingresarTelefono(Telefono telefono) {
        this.telefono = telefono;
    } 
    
    public void ingresarEmail(String email) {
        this.email.setEmail(email);
    }
    
    public void showFormInformation() {
        direccion.showAddressInformation();
        telefono.showPhoneInformation();
        email.showEmailInformation();
    }
}
