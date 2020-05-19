package gotravel.controller;

import gotravel.models.ListaPropietario;
import gotravel.models.Propietario;
import gotravel.terminal.Terminal;

public class Administrador {

    private ListaPropietario listaPropieatrio;

    public Administrador() {
        listaPropieatrio = new ListaPropietario();
    }

    public void agregar() {
        Propietario propietario = new Propietario();
        propietario.ingresarInformacionPropietario();
        listaPropieatrio.agregar(propietario);
    }

    public void buscar() {
        listaPropieatrio.showInformacionPropietario(this.inputRut());
    }

    public void eliminar() {
        listaPropieatrio.delete(this.inputRut());
    }

    public void actualizar() {
        listaPropieatrio.update(this.inputRut());
    }

    private String inputRut() {
        Terminal gestorIO = new Terminal();
        gestorIO.showMessageln("-------------------------------------------");
        gestorIO.showMessageln("Ingresar Rut: ");
        gestorIO.showMessageln("-------------------------------------------");
        return new Terminal().inputString();
    }

    public void listarInformacionPropietario() {
        listaPropieatrio.listarPropietarios();
    }
}

