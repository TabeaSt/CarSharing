/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Fahrzeug implements Serializable {
   
   @Id
    @GeneratedValue(generator = "fahrzeug_id")
    @TableGenerator(name = "fahrzeug_id", initialValue = 0, allocationSize = 50)
    private long id=0L;
    
    
    private String hersteller="";
    private String modell="";
    private int baujahr;
    
    
//<editor-fold defaultstate="collapsed" desc="Konstruktor">
    public Fahrzeug(){}
    
    public Fahrzeug(long id,String hersteller, String modell, int baujahr) {
        this.id = id;
        this.hersteller=hersteller;
        this.modell=modell;
        this.baujahr = baujahr;
    }
//</editor-fold>
    
    
    
//<editor-fold defaultstate="collapsed" desc="Getter und Setter">
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public String getHersteller() {
        return hersteller;
    }
    
    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }
    
    public String getModell() {
        return modell;
    }
    
    public void setModell(String modell) {
        this.modell = modell;
    }
    
    public int getBaujahr() {
        return baujahr;
    }
    
    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }
//</editor-fold>
    
    
    
    
    
    
    
}
