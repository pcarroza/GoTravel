package gotravel.models;

public class Owner extends Person {
    
    private Form formulario;

    public Owner() {
        formulario = new Form();
    }
    
    public void ingresarInformacionPropietario(String[] ownerInformation) {
        this.setOwnerInformation(ownerInformation);
    }
    
    public void ingresarInformacionDireccion(String[] formulario) {
        this.formulario.appendAddress(formulario);
    }
    
    public void ingresarNumeroTelefono(Phone telefono) {
        formulario.appendPhone(telefono);
    }

    public void ingresarEmail(String email) {
        formulario.appendEmail(email);
    }
    
    public void update() {
    }

    public boolean isEquals(String rut) {
        return this.getRUT().equals(rut);
    }
    
    public void showInformacionPropietario() {
        this.showPersonInformation();
        formulario.showFormInformation();
    }
}
