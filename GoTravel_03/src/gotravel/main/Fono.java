package gotravel.main;

public class Fono {

    public String fonoResidencial;
    public String celular;
    
    public Fono() {
    
    }
    
    public String getFonoResidencial() {
        return fonoResidencial;
    }

    public void setFonoResidencial(String fonoResidencial) {
        this.fonoResidencial = fonoResidencial;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public boolean verificarFono(String fonoResidencial) {
        return this.fonoResidencial.equals(fonoResidencial); 
    }
    
    public boolean celular(String telefono_3) {
       
        if (this.celular.equals(telefono_3)) {
            return true; 
        }
        return false;
        
    }

}
