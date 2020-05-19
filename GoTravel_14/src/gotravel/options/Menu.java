package gotravel.options;

import gotravel.models.Telefono;
import gotravel.terminal.Terminal;
import gotravel.utils.LimitedIntegerDialog;

public class Menu {

    private Option[] arregloOpciones;
    
    private final int LIMITE_INFERIOR = 1;
    
    private final int LIMITE_SUPERIOR = 2;
    
    private final int NUMERO_DE_OPCIONES = 2;
    
    private int index = 0;
    
    public Menu() {
        arregloOpciones = new Option[NUMERO_DE_OPCIONES];
    }

    public void mostrarOpcionesMenu() {
        for (Option opcion : arregloOpciones) {
            opcion.mostrarOpciones();
        }
    }

    public void agregarOpcion(Option opcion) {
        assert opcion != null; 
        arregloOpciones[index] = opcion;
        index++;
        if (index > LIMITE_SUPERIOR - 1) {
            index = 0; 
        }
    }

    public Telefono getOpcion() {
        int index = new LimitedIntegerDialog("Ingrese Opción: ", LIMITE_INFERIOR, LIMITE_SUPERIOR).read();
        return arregloOpciones[index - 1].getPhone();
    }

    public void showMenu() {
        Terminal gestorIO = new Terminal();
        gestorIO.showMessageln(" ");
        gestorIO.showMessageln("-------------------------------------------");
        gestorIO.showMessageln("-------------------------------------------");
        gestorIO.showMessageln("[1] INGRESAR PROPIETARIO");
        gestorIO.showMessageln("[2] BUSCAR PROPIETARIO");
        gestorIO.showMessageln("[3] ELIMINAR PROPIETARIO");
        gestorIO.showMessageln("[4] ACTUALIZAR PROPIETARIO");
        gestorIO.showMessageln("[5] LISTAR TODOS LOS PROPIETARIO");
        gestorIO.showMessageln("[6] SALIR");
        gestorIO.showMessageln("-------------------------------------------");
        gestorIO.showMessageln("-------------------------------------------");
        gestorIO.showMessageln(" ");
    }
}
