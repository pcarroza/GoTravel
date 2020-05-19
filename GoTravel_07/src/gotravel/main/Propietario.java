package gotravel.main;

public class Propietario extends Persona {

    private Direccion direccion;
    private Telefono telefono;
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
        new Terminal().showMessageln(" ");
    }

    private void elegirTelefono() {
        Terminal gestorIO = new Terminal();
        gestorIO.showMessageln("1) Telefono Fijo");
        gestorIO.showMessageln("2) Telefono Celular");
        int opcion = new DialogoIntegerLimitado("Ingrese opciones 1 o 2", 1, 2).read();
        switch (opcion) {
            case 1:
                telefono = new TelefonoFijo();
                telefono.ingresarNumeroTelefono();
                break; 
            case 2:
                telefono = new TelefonoMovil();
                telefono.ingresarNumeroTelefono();
                break;
        }
    }
}
