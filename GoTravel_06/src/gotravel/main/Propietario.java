package gotravel.main;

public class Propietario extends Persona {

    private Direccion direccion;
    private TelefonoFijo telefonoFijo;
    private TelefonoMovil telefonoMovil;
    private Email email;
    private Sepultura sepultura;

    public Propietario() {
        direccion = new Direccion();
        email = new Email();
        sepultura = new Sepultura();
    }

    public void agregarSepultura() {
        this.sepultura.agregarSepultura();
    }

    public boolean validarCorreo(String email) {
        return this.email.esValidoEmail(email);
    }

    public void ingresarInformacionPropietario() {
        this.ingresarInformacion();
        direccion.ingresarInformacion();
        this.elegirTelefono();
        email.ingresarInformacion();
        new GestorIO().showMessageln(" ");
    }

    private void elegirTelefono() {
        GestorIO gestorIO = new GestorIO();
        gestorIO.showMessageln("1) Telefono Fijo");
        gestorIO.showMessageln("2) Telefono Celular");
        int opcion;
        boolean ok = false; 
        do {
            opcion = gestorIO.inputInteger();
            if (opcion < 1 || opcion > 2) {
                gestorIO.showMessageln("ERROR. LA OPCION DEBE SER 1) O 2)");
            } else {
                ok = true; 
            }
        } while (!ok);
        if (opcion == 1) {
            telefonoFijo = new TelefonoFijo();
            telefonoFijo.ingresarNumeroTelefonoFijo();
        } else if (opcion == 2) {
            telefonoMovil = new TelefonoMovil();
            telefonoMovil.ingresarNumeroTelefonoMovil();
        }
    }
}
