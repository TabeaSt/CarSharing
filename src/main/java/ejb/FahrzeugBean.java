
package ejb;

import javax.ejb.Stateless;
import jpa.Fahrzeug;


@Stateless
public class FahrzeugBean extends EntityBean<Fahrzeug, Long> {

    public FahrzeugBean() {
        super(Fahrzeug.class);
    }
    
    
    
}
