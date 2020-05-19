package gotravel.main;

public class GoTravel {

    private ArregloPropietario arregloPropieatrio;

    public GoTravel() {
        arregloPropieatrio = new ArregloPropietario();
    }

    public void ejecutar() {
        do {
            Propietario propietario = new Propietario();
            propietario.ingresarInformacionPropietario();
            arregloPropieatrio.agregarPropietario(propietario);
        } while (!arregloPropieatrio.isComplete());
    }

    public static void main(String[] args) {
        new GoTravel().ejecutar();
    }
}
