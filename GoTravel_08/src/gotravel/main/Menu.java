package gotravel.main;

import gotravel.utils.DialogoIntegerLimitado;

public class Menu {

    private Opcion[] arregloOpciones;
    private int index = 0;
    private final int LIMITE_INFERIOR = 1;
    private final int LIMITE_SUPERIOR = 2;
    private final int NUMERO_DE_OPCIONES = 2;

    public Menu() {
        arregloOpciones = new Opcion[NUMERO_DE_OPCIONES];
    }

    public void mostrarOpcionesMenu() {
        for (Opcion opcion : arregloOpciones) {
            opcion.mostrarOpciones();
        }
        this.index = 0;
    }

    public void agregarOpcion(Opcion opcion) {
        arregloOpciones[index] = opcion;
        index++;
    }

    public Opcion getOpcion() {
        int index = new DialogoIntegerLimitado("Ingrese Opción: ", LIMITE_INFERIOR, LIMITE_SUPERIOR).read();
        return arregloOpciones[index - 1];
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
