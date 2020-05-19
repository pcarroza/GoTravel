package gotravel.main;

import gotravel.controller.Administrador;
import gotravel.controller.Menu;
import gotravel.terminal.DialogoIntegerLimitado;
import gotravel.terminal.Terminal;

public class GoTravel {

    private Administrador administrador;
    
    private static final int LIMIT_MINIMUN = 1;
    
    private static final int LIMIT_MAXIMUN = 6;

    public GoTravel() {
        administrador = new Administrador();
    }

    public void ejecutar() {
        boolean right = false;
        int opcion;
        do {
            new Menu().showMenu();
            opcion = new DialogoIntegerLimitado("Ingrese Opción ", LIMIT_MINIMUN, LIMIT_MAXIMUN).read();
            switch (opcion) {
                case 1:
                    administrador.agregar();
                    break;
                case 2:
                    administrador.buscar();
                    break;
                case 3:
                    administrador.eliminar();
                    break;
                case 4:
                    administrador.actualizar();
                    break;
                case 5:
                    administrador.listarInformacionPropietario();
                    break;
                case 6:
                    right = true;
                    break;
                default:
                    new Terminal().showMessageln("ERROR. OPCION NO EXISTENTE");
            }
        } while (!right);
    }

    public static void main(String[] args) {
        new GoTravel().ejecutar();
    }
}
