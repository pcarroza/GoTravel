package gotravel.main;

public class Sepultura {

    private String[] codigoSepultura;
    private String[] nombredelcliente;
    
    public Sepultura() {
        codigoSepultura = new String[3];
        nombredelcliente = new String[3];
    }

    public void agregarSepultura() {
        GestorIO gestorIO = new GestorIO();
        for (int i = 0; i < codigoSepultura.length; i++) {
            gestorIO.showMessageln("Ingrese código de la sepultura: ");
            codigoSepultura[i] = gestorIO.inputString();
            System.out.println("Ingrese nombre del dueño:  ");
            nombredelcliente[i] = gestorIO.inputString();
        }
    }
}
