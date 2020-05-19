package gotravel.main;

public class Direccion {

    public String nombreDeLaCalle;
    public String numeroCasa;
    public String comuna;
    public String ciudad;

    private void setNombreDeLaCalle(String nombreDeLaCalle) {
        this.nombreDeLaCalle = nombreDeLaCalle;
    }

    private void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    private void setComuna(String comuna) {
        this.comuna = comuna;
    }
    
    private void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void ingresarInformacion() {
        GestorIO gestorIO = new GestorIO();
        gestorIO.showMessageln("5) Ingresar nombre de la calle: ");
        setNombreDeLaCalle(gestorIO.inputString());
        gestorIO.showMessageln("6) Ingresar Número de Casa: ");
        setNumeroCasa(gestorIO.inputString());
        gestorIO.showMessageln("7) Ingresar Comuna: ");
        setComuna(gestorIO.inputString());
        gestorIO.showMessageln("8) Ingresar Ciudad: ");
        setCiudad(gestorIO.inputString());
    }
}