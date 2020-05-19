package gotravel.view;

import gotravel.terminal.Terminal;

public class PersonaView {

    private Terminal gestorIO;
    private String[] ownerInformation;
    
    public PersonaView() {
        gestorIO = new Terminal();
        ownerInformation = new String[4];
    }

    public String[] getOwnerInformation() {
        gestorIO.showMessageln("1) Ingrese Nombre: ");
        ownerInformation[0] = gestorIO.inputString();
        gestorIO.showMessageln("2) Ingrese Apellido Materno: ");
        ownerInformation[1] = gestorIO.inputString();
        gestorIO.showMessageln("3) Ingrese Apellido Paterno: ");
        ownerInformation[2] = gestorIO.inputString();
        gestorIO.showMessageln("4) Ingrese Rut: ");
        ownerInformation[3] = gestorIO.inputString();
        return ownerInformation;
    }

}
