package gotravel.models;

import gotravel.options.Menu;
import gotravel.options.OpcionTelefonoFijo;
import gotravel.options.OpcionTelefonoMovil;
import gotravel.terminal.Terminal;

public class Formulario {

    private Direccion direccion;
    
    private Telefono telefono;
    
    private Email email;
    
    private Menu menu;

    public Formulario() {
        direccion = new Direccion();
        email = new Email();
        menu = new Menu();
    }

    public void ingresarInformacionPropietario() {
        direccion.ingresarInformacion();
        this.elegirTelefono();
        email.ingresarInformacion();
        new Terminal().showMessageln(" ");
    }

    private void elegirTelefono() {
        menu.agregarOpcion(new OpcionTelefonoFijo());
        menu.agregarOpcion(new OpcionTelefonoMovil());
        menu.mostrarOpcionesMenu();
        telefono = menu.getOpcion().ejecutar();
    }

    public void showFormInformation() {
        direccion.showAddressInformation();
        telefono.showPhoneInformation();
        email.showEmailInformation();
    }
}
