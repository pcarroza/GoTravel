package gotravel.main;

public class Propietario extends Persona {

    private String codigoPropietario;
    private Direccion direccion = new Direccion();
    private Fono fono = new Fono();
    private Email email = new Email();

    String[] codigoSepultura = new String[3];
    int cantidadSepulturas;
    String[] nombredelcliente = new String[3];

    public Propietario(String codigoPropietario, String nombre, String apellidoMaterno, String apellidoPaterno, String rut, String direccion, String numeroDomicilio, String comuna,
            String fonoResidencial, String celular, String email) {
        this.codigoPropietario = codigoPropietario;
        this.nombre = nombre;
        this.apellidoMaterno = apellidoMaterno;
        this.apellidoPaterno = apellidoPaterno;
        this.rut = rut;
    }
    
    public Propietario() {
    }

    public String getCodigoPropietario() {
        return codigoPropietario;
    }

    public void setCodigoPropietario(String codigoPropietario) {
        this.codigoPropietario = codigoPropietario;
    }

    public boolean validarCodigoPropietario(String codigoPropietario) {
        if (this.codigoPropietario.equals(codigoPropietario)) {
            return true;
        } else {
            return false;
        }
    }

    public void agregarSepultura() {
        GestorIO gestorIO = new GestorIO();
        for (int i = 0; i < codigoSepultura.length; i++) {
            gestorIO.showMessageln("Ingrese código de la sepultura: ");
            codigoSepultura[i] = gestorIO.inputString();
        }
        for (int i = 0; i < nombredelcliente.length; i++) {
            System.out.println("Ingrese nombre del dueño:  ");
            codigoSepultura[i] = gestorIO.inputString();
        }
    }

    public boolean validarCorreo(String email) {
        return this.email.validarEmail(email); 
    }
    
 

}
