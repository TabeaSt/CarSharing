/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.TableGenerator;
import javax.validation.constraints.NotNull;


@Entity
public class Kunde implements Serializable{
   
    @Id
    @GeneratedValue(generator = "customer_ids")
    @TableGenerator(name = "customer_ids", initialValue = 0, allocationSize = 50)
    private long id;
    
    @Column(name = "firstName", length = 64)
    @NotNull
    private String firstName;
    
    @Column(name = "lastName", length = 64)
    @NotNull
    private String lastName;
    
    @Column(name = "road", length =64)
    private String road;
    
    @Column(name = "roadNumber", length =64)
    private int roadNumber ;
    
    @Column(name = "plz", length =64)
    private int plz;
    
     @Column(name = "place", length =64)
    private String place;
    
     @Column(name = "contry", length =64)
    private String contry;

     //<editor-fold defaultstate="collapsed" desc="Konstruktor">
     public Kunde( String firstName, String lastName, String road, int roadNumber, int plz, String place, String contry) {
       
         this.firstName = firstName;
         this.lastName = lastName;
         this.road = road;
         this.roadNumber = roadNumber;
         this.plz = plz;
         this.place = place;
         this.contry = contry;
     }
    //</editor-fold>
     
    //<editor-fold defaultstate="collapsed" desc="getter und setter Methoden">
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getRoad() {
        return road;
    }
    
    public void setRoad(String road) {
        this.road = road;
    }
    
    public int getRoadNumber() {
        return roadNumber;
    }
    
    public void setRoadNumber(int roadNumber) {
        this.roadNumber = roadNumber;
    }
    
    public int getPlz() {
        return plz;
    }
    
    public void setPlz(int plz) {
        this.plz = plz;
    }
    
    public String getPlace() {
        return place;
    }
    
    public void setPlace(String place) {
        this.place = place;
    }
    
    public String getContry() {
        return contry;
    }
    
    public void setContry(String contry) {
        this.contry = contry;
    }
    
//</editor-fold>
     
    
   
}
