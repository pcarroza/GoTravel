package gotravel.main;

public abstract class Telefono {

    protected String anexo;
    protected String title;
    
    protected Telefono(String title) {
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
    
}
