package gotravel.models;

public class Assembler extends OwnerManager {

    public void append(Owner owner) {
        assert owner != null;
        listaDepropietario.add(owner);
    }
}
