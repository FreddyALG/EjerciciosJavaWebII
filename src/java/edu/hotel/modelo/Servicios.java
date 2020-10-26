
package edu.hotel.modelo;

import java.util.Date;


public class Servicios {
    
    private Date alarma;
    private String desayuno = "";
    
    public Servicios(){
        
    }

    public Date getAlarma() {
        return alarma;
    }

    public void setAlarma(Date alarma) {
        this.alarma = alarma;
    }

    public String getDesayuno() {
        return desayuno;
    }

    public void setDesayuno(String desayuno) {
        this.desayuno = desayuno;
    }
    
    
    
}
