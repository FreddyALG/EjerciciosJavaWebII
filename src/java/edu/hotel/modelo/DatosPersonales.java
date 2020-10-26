
package edu.hotel.modelo;


public class DatosPersonales {
    
    private String nombre = "";
    private String direccion = "";
    private String profesion = "";
    private String EstadoCivil = "";
    
    public DatosPersonales(){
        
    }
    
    public DatosPersonales(String nombre, String direccion, String profesion, String EstadoCivil){
        this.nombre = nombre;
        this.direccion = direccion;
        this.profesion = profesion;
        this.EstadoCivil = EstadoCivil;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }
    
    
    
}
