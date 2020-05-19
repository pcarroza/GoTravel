package gotravel.models;

import gotravel.terminal.Terminal;

public class Email {

    private String email;

    private String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    public boolean esValidoEmail(String email) {
        return getEmail().equals(email); 
    }

    public void ingresarInformacion() {
        Terminal gestorIO = new Terminal(); 
        gestorIO.showMessageln("11) Ingrese Email: ");
        setEmail(gestorIO.inputString());
    }

    public void showEmailInformation() {
        Terminal gestorIO = new Terminal();
        gestorIO.showMessageln("Email            :" + email);
        gestorIO.showMessageln("-------------------------------------------");
        gestorIO.showMessageln("-------------------------------------------");
    }
}

