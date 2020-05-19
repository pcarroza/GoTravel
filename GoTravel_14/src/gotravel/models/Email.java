package gotravel.models;

import gotravel.terminal.Terminal;

public class Email {

    private String email;

    private String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean esValidoEmail(String email) {
        return getEmail().equals(email); 
    }
    
    public void showEmailInformation() {
        Terminal gestorIO = new Terminal();
        gestorIO.showMessageln("Email            :" + email);
        gestorIO.showMessageln("-------------------------------------------");
        gestorIO.showMessageln("-------------------------------------------");
    }
}

