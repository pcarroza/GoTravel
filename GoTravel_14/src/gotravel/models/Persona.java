package gotravel.models;

import gotravel.terminal.Terminal;

public class Persona {

    private String nombre;
    
    private String apellidoMaterno;
    
    private String apellidoPaterno;
    
    private String rut;

    public String getRut() {
        return rut;
    }

    public void setOwnerInformation(String[] ownerInformation) {
        nombre = ownerInformation[0];
        apellidoMaterno = ownerInformation[1];
        apellidoPaterno = ownerInformation[2];
        rut = ownerInformation[3];
    }
    
    public void showPersonInformation() {
        Terminal gestorIO = new Terminal();
        gestorIO.showMessageln(" ");
        gestorIO.showMessageln("-------------------------------------------");
        gestorIO.showMessageln("-------------------------------------------");
        gestorIO.showMessageln("Nombre           :" + nombre);
        gestorIO.showMessageln("Apellido Materno :" + apellidoMaterno);
        gestorIO.showMessageln("Apellido Paterno :" + apellidoPaterno);
        gestorIO.showMessageln("Rut              :" + rut);
    }
}
