/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import jpa.Fahrzeug;
import jpa.Leihvertrag;

@Stateless
public class LeihvertragBean extends EntityBean<Leihvertrag, Long> {

    public LeihvertragBean() {
        super(Leihvertrag.class);
    }

    //TODO
    public Leihvertrag ausleihen(Date startDate, Date endDate, long fahrzeugid) throws FahrzeugvergebenException, FahrzeugzeitraumException {

        Leihvertrag leihvertrag = (Leihvertrag) em.createQuery("SELECT l FROM Leihvertrag l"
                + "    WHERE l.startTime >= :startTimeFrom"
                + "      AND l.endDate <= :startTimeTo"
        )
                .getSingleResult();

        if (leihvertrag == null) {
            throw new FahrzeugzeitraumException("In diesem Zeitraum steht kein Fahrzeug zur VErfügung");
        }
        if (fahrzeugid != leihvertrag.getFahrzeugId()) {
            this.saveNew(new leihvertrag( long kundenId, fahrzeugid,  startdate,  enddate));
            return leihvertrag;
        } else {
            throw new FahrzeugvergebenException("Das Fahrzeug steht nicht mehr zur Verfügung");
        }

    }

}
