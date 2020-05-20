package gotravel.controllers;

import gotravel.models.Owner;
import gotravel.models.Phone;

public interface AppendController extends Controller {
    
    public void setNewOwner(Owner owner);

    public void appendOwnerInformation(String[] ownerInformation);

    public void appendOwnerAddress(String[] ownerAddress);

    public void appendOwnerPhone(Phone phone);
    
    public void appendOwnerEmail(String email);

    public void appendOwnerList();
}
