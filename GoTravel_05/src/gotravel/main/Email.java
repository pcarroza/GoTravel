package gotravel.main;

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
        GestorIO gestorIO = new GestorIO(); 
        gestorIO.showMessageln("11) Ingrese Email: ");
        setEmail(gestorIO.inputString());
    }
}

