package gotravel.models;

public class Form {

    private HomeAddress homeAddress;
    
    private Phone phone;
    
    private Email email;

    public Form() {
        homeAddress = new HomeAddress();
        email = new Email();
    }

    public void appendAddress(String[] form) {
        homeAddress.ingresarDireccion(form);
    }
    
    public void appendPhone(Phone phone) {
        this.phone = phone;
    } 
    
    public void appendEmail(String email) {
        this.email.setEmail(email);
    }
    
    public void showFormInformation() {
        homeAddress.showAddressInformation();
        phone.showPhoneInformation();
        email.showEmailInformation();
    }
}
