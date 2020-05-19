package gotravel.main;

public class Email {

    public String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean validarEmail(String email) {
        return getEmail().equals(email); 
    }

    public void ingresarInformacion() {
        GestorIO gestorIO = new GestorIO(); 
        gestorIO.showMessageln("11) Ingrese Email: ");
        setEmail(gestorIO.inputString());
    }
}

