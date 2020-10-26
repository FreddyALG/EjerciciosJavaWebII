
package edu.hotel.controlador;

import edu.hotel.modelo.DatosPersonales;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;


@Named(value = "registroDatos")
@SessionScoped
public class RegistroDatos implements Serializable {

    private DatosPersonales objDa = new DatosPersonales();
    
    public RegistroDatos() {
    }
    
    public void Nombre(){
        objDa.setNombre("nombre");
    }
    
    public void Direccion(){
        objDa.setDireccion("direccion");
    }
    
    public void Profesion(){
        objDa.setProfesion("profesion");
    }
    
    public void EstadoCivil(){
        objDa.setEstadoCivil("EstadoCivil");
    }
    
    public DatosPersonales getObjDa() {
        return objDa;
    }

    public void setObjDa(DatosPersonales objDa) {
        this.objDa = objDa;
    }

    

    
    
    
}
