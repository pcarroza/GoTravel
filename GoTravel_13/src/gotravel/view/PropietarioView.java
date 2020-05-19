package gotravel.view;

import gotravel.models.Telefono;

public class PropietarioView {
    
    private PersonaView personaView; 
    private FormularioView formularioView; 
    
    public PropietarioView() {
        personaView = new PersonaView();
        formularioView = new FormularioView(); 
    }

    public String[] getOwnerInformation() {
        return personaView.getOwnerInformation(); 
    }
    
    public String[] getOwnerAddress() {
        return formularioView.getAddress();
    }

    public Telefono getOwnerPhone() {
        return formularioView.getPhone(); 
    }
    public String getEmail() {
        return formularioView.getEmail(); 
    }
}
