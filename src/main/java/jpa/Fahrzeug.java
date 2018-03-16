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

/**
 *
 * @author ta_st
 */

@Entity
public class Fahrzeug implements Serializable {
   
    @Id
    @NotNull
    @Size(min=1)
    private long id;
    
    
    private String hersteller="";
    private String modell="";
    private int baujahr;
    
}
