package gotravel.view;

import gotravel.terminal.Terminal;

public class EmailView {
    
    private Terminal gestorIO = new Terminal();
    
    public String getEmail() {
        gestorIO.showMessageln("11) Ingrese Email: ");
        return gestorIO.inputString();
    }
}
