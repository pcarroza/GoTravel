package gotravel.main;

public class Direccion {

    public String nombreDeLaCalle;
    public String numeroCasa;
    public String comuna;
    public String ciudad;

    public String getNombreDeLaCalle() {
        return nombreDeLaCalle;
    }

    public void setNombreDeLaCalle(String nombreDeLaCalle) {
        this.nombreDeLaCalle = nombreDeLaCalle;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    void ingresarInformacion() {
        GestorIO gestorIO = new GestorIO();
        gestorIO.showMessageln("5) Ingresar nombre de la calle: ");
        setNombreDeLaCalle(gestorIO.inputString());
        gestorIO.showMessageln("6) Ingresar Número de Casa: ");
        setNumeroCasa(gestorIO.inputString());
        gestorIO.showMessageln("7) Ingresar Comuna: ");
        setCiudad(gestorIO.inputString());
        gestorIO.showMessageln("8) Ingresar Ciudad: ");
        setCiudad(gestorIO.inputString());
    }

}
