package gotravel.view;

import gotravel.terminal.Terminal;

public class DireccionView {

    Terminal gestorIO = new Terminal();
    private String[] arrayAddress;

    public DireccionView() {
        arrayAddress = new String[4];
    }

    public String[] getAddress() {
        gestorIO.showMessageln("5) Ingresar nombre de la calle: ");
        arrayAddress[0] = gestorIO.inputString();
        gestorIO.showMessageln("6) Ingresar Número de Casa: ");
        arrayAddress[1] = gestorIO.inputString();
        gestorIO.showMessageln("7) Ingresar Comuna: ");
        arrayAddress[2] = gestorIO.inputString();
        gestorIO.showMessageln("8) Ingresar Ciudad: ");
        arrayAddress[3] = gestorIO.inputString();
        return arrayAddress; 
    }
}
