/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateless;
import jpa.Fahrzeug;
import jpa.Leihvertrag;

@Stateless
public class LeihvertragBean extends EntityBean<Leihvertrag, Long> {
    
    public LeihvertragBean() {
        super(Leihvertrag.class);
    }
    
    
}
