package gotravel.view;

import gotravel.models.Telefono;
import gotravel.options.Menu;
import gotravel.options.OpcionTelefonoFijo;
import gotravel.options.OpcionTelefonoMovil;
import gotravel.terminal.Terminal;

public class TelefonoView {

    private Terminal gestorIO = new Terminal(); 
    private Menu menu;

    public TelefonoView() {
        menu = new Menu();
    }

    public Telefono getPhone() {
        return this.elegirTelefono();
    }

    private Telefono elegirTelefono() {
        menu.agregarOpcion(new OpcionTelefonoFijo());
        menu.agregarOpcion(new OpcionTelefonoMovil());
        menu.mostrarOpcionesMenu();
        return menu.getOpcion();
    }

    public String getNumberPhone() {
        String numero; 
        gestorIO.showMessageln("Ingrese numero de telefono: ");
        return numero = gestorIO.inputString(); 
    }
}
