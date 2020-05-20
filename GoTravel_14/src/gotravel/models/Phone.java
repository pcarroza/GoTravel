package gotravel.models;

import gotravel.terminal.Terminal;

public abstract class Phone {

    protected String anexo;
    
    protected String title;

    protected Phone(String title) {
        this.title = title;
        anexo = "+56";
    }

    public void ingresarNumeroTelefono() {
        Terminal gestorIO = new Terminal();
        gestorIO.showMessageln(title);
        setFono(gestorIO.inputString());
    }

    public abstract void setFono(String numeroTelefono);

    public abstract void showPhoneInformation();

    void ingresarNumeroTelefono(String numeroTelefono) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
