package gotravel.main;

public class Email {

    public String email;

    public Email() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean validarEmail(String email_2) {
        if (email.equals(email_2)) {
            return true;
        } else {
            return false;
        }
    }
}
