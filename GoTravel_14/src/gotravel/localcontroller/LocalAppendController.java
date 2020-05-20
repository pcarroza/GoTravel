package gotravel.localcontroller;

import gotravel.controllers.AppendController;
import gotravel.models.OwnerManager;
import gotravel.models.Owner;
import gotravel.models.Phone;
import gotravel.view.TelefonoView;
import gotravel.view.View;

public class LocalAppendController extends LocalController implements AppendController {

    private Owner owner;
    
    private OwnerManager ownerManager;

    public LocalAppendController(OwnerManager ownerManager) {
        this.ownerManager = ownerManager;
    }

    @Override
    public void setNewOwner(Owner owner) {
        assert owner != null;
        this.owner = owner;
    }

    @Override
    public void appendOwnerInformation(String[] ownerInformation) {
        assert ownerInformation != null;
        owner.ingresarInformacionPropietario(ownerInformation);
    }

    @Override
    public void appendOwnerAddress(String[] ownerAddress) {
        assert ownerAddress != null;
        owner.ingresarInformacionDireccion(ownerAddress);
    }

    @Override
    public void appendOwnerPhone(Phone phone) {
        assert phone != null;
        phone.setFono(new TelefonoView().getNumberPhone());
        owner.ingresarNumeroTelefono(phone);
    }

    @Override
    public void appendOwnerEmail(String email) {
        assert email != null;
        owner.ingresarEmail(email);
    }

    @Override
    public void appendOwnerList() {
        this.ownerManager.append(owner);
    }

    @Override
    public void acept(View view) {
        assert view != null;
        view.visit(this);
    }
}
