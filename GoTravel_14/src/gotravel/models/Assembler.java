package gotravel.models;

public class Assembler extends OwnerManager {

    public void append(Propietario owner) {
        assert owner != null;
        listaDepropietario.add(owner);
    }
}
