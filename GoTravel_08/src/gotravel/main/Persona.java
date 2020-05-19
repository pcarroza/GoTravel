package gotravel.main;

public class Persona {

    protected String nombre;
    protected String apellidoMaterno;
    protected String apellidoPaterno;
    protected String rut;

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    protected String getName() {
        return nombre; 
    }
    
    protected boolean isEqualsNombre(String nombre) {
        return this.nombre.equals(nombre); 
    }

    private void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    private void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    private void setRut(String rut) {
        this.rut = rut;
    }
    
    protected String getRut() {
        return rut;
    }

    public void ingresarInformacion() {
        Terminal gestorIO = new Terminal();
        gestorIO.showMessageln("1) Ingrese Nombre: ");
        setNombre(gestorIO.inputString());
        gestorIO.showMessageln("2) Ingrese Apellido Materno: ");
        setApellidoMaterno(gestorIO.inputString());
        gestorIO.showMessageln("3) Ingrese Apellido Paterno: ");
        setApellidoPaterno(gestorIO.inputString());
        gestorIO.showMessageln("4) Ingrese Rut: ");
        setRut(gestorIO.inputString());
    }

    public void showPersonInformation() {
        Terminal gestorIO = new Terminal();
        gestorIO.showMessageln(" ");
        gestorIO.showMessageln("-------------------------------------------");
        gestorIO.showMessageln("|       INFORMACIÓN DE PROPIETARIO        |");
        gestorIO.showMessageln("-------------------------------------------");
        gestorIO.showMessageln("Nombre           :" + nombre);
        gestorIO.showMessageln("Apellido Materno :" + apellidoMaterno);
        gestorIO.showMessageln("Apellido Paterno :" + apellidoPaterno);
        gestorIO.showMessageln("Rut              :" + rut);
    }

}
