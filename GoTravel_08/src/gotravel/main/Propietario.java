package gotravel.main;

public class Propietario extends Persona {

    private Formulario formulario;

    public Propietario() {
        formulario = new Formulario();
    }
    
    public Propietario(String nombre){
        this.nombre = nombre; 
    }

    public boolean validarCorreo(String email) {
        return formulario.esValidoEmail(email);
    }

    public void update() {
        this.ingresarInformacionPropietario();
    }

    public void ingresarInformacionPropietario() {
        this.ingresarInformacion();
        formulario.ingresarInformacionPropietario();
    }

    public void showInformacionPropietario() {
        this.showPersonInformation();
        formulario.showFormInformation();
    }

    public boolean isEquals(String rut) {
        return this.getRut().equals(rut);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((formulario == null) ? 0 : formulario.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }
        Propietario otherPropietario = (Propietario) object;
        if (this.hashCode() != otherPropietario.hashCode()) {
            return false;
        }
        return false;
    }
}
