/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
public class Leihvertrag {
    
    @Id
    private long id = 0;
    
    @ManyToOne
    @NotNull(message = "Der Leihvertrag muss einem Benutzer zugeordnet sein.")
    private long kundenId = 0;
    
    @ManyToOne
    @NotNull(message = "Der Leihvertrag muss einem Fahrzeug zugeordnet sein.")
    private long fahrzeugId = 0;
    
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date startdate = new Date();
    
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date enddate = new Date();
    
    
    public Leihvertrag() {
    
    }
    
    public Leihvertrag( long kundenId, long fahrzeugId, Date startdate, Date enddate) {
        
       
        this.kundenId = kundenId;
        this.fahrzeugId = fahrzeugId;
        this.startdate = startdate;
        this.enddate = enddate;
                
    
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getKundenId() {
        return kundenId;
    }

    public void setKundenId(long kundenId) {
        this.kundenId = kundenId;
    }

    public long getFahrzeugId() {
        return fahrzeugId;
    }

    public void setFahrzeugId(long fahrzeugId) {
        this.fahrzeugId = fahrzeugId;
    }

    public Date getStarttime() {
        return startdate;
    }

    public void setStarttime(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEndtime() {
        return enddate;
    }

    public void setEndtime(Date enddate) {
        this.enddate = enddate;
    }
    
    
    
    
    
}