package gotravel.view;

import gotravel.controllers.AppendController;
import gotravel.models.Owner;

public class PropietarioView {
    
    private PersonaView personaView; 
    
    private FormularioView formularioView;
    
    private AppendController appendController;
    
    public PropietarioView(AppendController appendController) {
        personaView = new PersonaView();
        formularioView = new FormularioView(); 
        this.appendController = appendController;
    }
    
    public void appendInformationOwner() {
        appendController.setNewOwner(new Owner());
        appendController.appendOwnerInformation(personaView.getOwnerInformation());
        appendController.appendOwnerAddress(formularioView.getAddress());
        appendController.appendOwnerPhone(formularioView.getPhone());
        appendController.appendOwnerEmail(formularioView.getEmail());
        appendController.appendOwnerList();
    }
}
