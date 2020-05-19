package gotravel.controllers;

import gotravel.models.Propietario;
import gotravel.models.Telefono;

public interface AppendController extends Controller {
    
    public void setNewOwner(Propietario newOwner);

    public void appendOwnerInformation(String[] ownerInformation);

    public void appendOwnerAddress(String[] ownerAddress);

    public void appendOwnerPhone(Telefono phone);
    
    public void appendOwnerEmail(String email);

    public void appendOwnerList();
}
