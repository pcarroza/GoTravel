package gotravel.models;

import gotravel.terminal.Terminal;

public abstract class Telefono {

    protected String anexo;
    
    protected Telefono() {
        anexo = "+56";
    }
    
    public void ingresarNumeroTelefono() {
        Terminal gestorIO = new Terminal();
        gestorIO.showMessageln("9) Ingrese Numero de Telefono: ");
        setFono(gestorIO.inputString());
    }
    
    public abstract void setFono(String numeroTelefono);
    
    public abstract void showPhoneInformation();
}
