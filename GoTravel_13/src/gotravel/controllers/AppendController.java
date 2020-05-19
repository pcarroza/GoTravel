package gotravel.controllers;

import gotravel.models.ListaPropietario;
import gotravel.models.Propietario;
import gotravel.models.Telefono;
import gotravel.view.TelefonoView;
import gotravel.view.View;

public class AppendController extends Controller {

    private Propietario owner; 
        
    public AppendController(ListaPropietario listaPropietario) {
        super(listaPropietario);
    }
   
    public void setNewOwner(Propietario newOwner) {
        owner = newOwner;
    }
    
    public void appendOwnerInformation(String[] ownerInformation) {
        assert ownerInformation != null; 
        owner.ingresarInformacionPropietario(ownerInformation);
    }
    
    public void appendOwnerAddress(String[] ownerAddress) {
        assert ownerAddress != null;
        owner.ingresarInformacionDireccion(ownerAddress);
    }
    
    public void appendOwnerPhone(Telefono phone) {
        assert phone != null;
        phone.setFono(new TelefonoView().getNumberPhone());
        owner.ingresarNumeroTelefono(phone);
    }
    
    public void appendOwnerEmail(String email) {
        assert email != null; 
        owner.ingresarEmail(email);
    }
    
    public void appendOwnerList() {
        listaPropietario.agregar(owner);
    }
    
    @Override
    public void acept(View trevalReservationView) {
        trevalReservationView.visit(this);
    }
}
