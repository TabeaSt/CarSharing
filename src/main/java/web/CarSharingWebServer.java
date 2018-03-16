/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import ejb.FahrzeugBean;
import ejb.FahrzeugvergebenException;
import ejb.FahrzeugzeitraumException;
import ejb.LeihvertragBean;
import java.util.Date;
import java.util.List;
import javax.ejb.*;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import jpa.Fahrzeug;
import jpa.Kunde;
import jpa.Leihvertrag;


@WebService(serviceName = "CarSharingWebServer")
public class CarSharingWebServer {

    @EJB
    FahrzeugBean fahrzeugbean;
    
    
   @EJB 
   KundenBean kundenbean;

   
   @EJB
   LeihvertragBean leihvertragbean;
    
    
    //neues Fahrzeug anlegen
    @WebMethod
    @WebResult(name = "fahrzeug")
    public Fahrzeug createNewStation(@WebParam(name = "fahrzeg") Fahrzeug fahrzeug) {
        return fahrzeugbean.saveNew(fahrzeug);
    }
    
    //alle Fahrzeuge auflisten
    @WebMethod
    @WebResult(name = "fahrzeug")
    public List<Fahrzeug> findAllFahrzeuge() {
        return fahrzeugbean.findAll();
    }
    
    
    //Fahrzeug ausleihen
    //TODO
     @WebMethod
    @WebResult(name = "leihvertrag")
    public Leihvertrag ausleihen(@WebParam(name = "startDate") Date  startDate,@WebParam(name = "endDate") Date  endDate,@WebParam(name = "fahrzeugid") long  fahrzeugid  ) throws FahrzeugvergebenException, FahrzeugzeitraumException {
        return leihvertragbean.ausleihen(startDate, endDate, fahrzeugid);
    }
    
    
    //Neuer Kundensatz
      @WebMethod
    @WebResult(name = "kunde")
    public Kunde createNewKunde(@WebParam(name = "kunde") Kunde Kunde) {
        return kundenbean.saveNew(kunde);
    }
    //Auflisten aller Leihverträge eines kunden
 
    
    
}
