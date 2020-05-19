package gotravel.main;

public class Propietario extends Persona {
    
    private String codigoPropietario; 
    private Direccion direccion;
    private Fono fono;
    private Email email;
    private Sepultura sepultura;

    public Propietario() {
        direccion = new Direccion();
        fono = new Fono();
        email = new Email();
        sepultura = new Sepultura();
    }

    public String getCodigoPropietario() {
        return codigoPropietario;
    }

    public void setCodigoPropietario(String codigoPropietario) {
        this.codigoPropietario = codigoPropietario;
    }

    public boolean validarCodigoPropietario(String codigoPropietario) {
        return this.codigoPropietario.equals(codigoPropietario);
    }

    public void agregarSepultura() {
        this.sepultura.agregarSepultura();
    }

    public boolean validarCorreo(String email) {
        return this.email.validarEmail(email);
    }

    public void ingresarInformacionPropietario() {
        this.ingresarInformacion();
        direccion.ingresarInformacion();
        fono.ingresarInformacion();
        email.ingresarInformacion();
        new GestorIO().showMessageln(" ");
    }
}
