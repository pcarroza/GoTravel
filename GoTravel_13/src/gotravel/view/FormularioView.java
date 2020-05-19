package gotravel.view;

import gotravel.models.Telefono;

public class FormularioView {
    
    private DireccionView direccionView;
    private TelefonoView telefonoView;
    private EmailView emailView;
    
    public FormularioView() {
        direccionView = new DireccionView(); 
        telefonoView = new TelefonoView();
        emailView = new EmailView();
    }

    public String[] getAddress() {
        return direccionView.getAddress();
    }

    public Telefono getPhone() {
        return telefonoView.getPhone(); 
    }

    public String getEmail() {
        return emailView.getEmail(); 
    }
}