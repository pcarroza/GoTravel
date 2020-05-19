package gotravel.models;

import gotravel.terminal.Terminal;

public class Direccion {

    public String nombreDeLaCalle;
    
    public String numeroCasa;
    
    public String comuna;
    
    public String ciudad;

    public void ingresarDireccion(String[] formulario) {
        nombreDeLaCalle = formulario[0];
        numeroCasa = formulario[1];
        comuna = formulario[2];
        ciudad = formulario[3];
    }
    
    public void showAddressInformation() {
        Terminal gestorIO = new Terminal();
        gestorIO.showMessageln("Calle            :" + nombreDeLaCalle);
        gestorIO.showMessageln("Número de Casa   :" + numeroCasa);
        gestorIO.showMessageln("Comuna           :" + comuna);
        gestorIO.showMessageln("Ciudad           :" + ciudad);
    }
}
