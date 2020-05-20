package gotravel.models;

import gotravel.terminal.Terminal;

public class Person {

    private String name;
    
    private String maternalSurName;
    
    private String lastName;
    
    private String RUT;

    public String getRUT() {
        return RUT;
    }

    public void setOwnerInformation(String[] ownerInformation) {
        name = ownerInformation[0];
        maternalSurName = ownerInformation[1];
        lastName = ownerInformation[2];
        RUT = ownerInformation[3];
    }
    
    public void showPersonInformation() {
        Terminal gestorIO = new Terminal();
        gestorIO.showMessageln(" ");
        gestorIO.showMessageln("-------------------------------------------");
        gestorIO.showMessageln("-------------------------------------------");
        gestorIO.showMessageln("Nombre           :" + name);
        gestorIO.showMessageln("Apellido Materno :" + maternalSurName);
        gestorIO.showMessageln("Apellido Paterno :" + lastName);
        gestorIO.showMessageln("Rut              :" + RUT);
    }
}
