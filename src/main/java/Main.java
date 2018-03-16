
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import jpa.Fahrzeug;
import jpa.Kunde;
import jpa.Leihvertrag;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chmar
 */
public class Main {
    
  
    
    
    public static void main (String args[]){
        
        
        
        BufferedReader fromKeyboard = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
    
        snoopyPrint();
        hauptmenuePrint();
        
        
        try {
            input = fromKeyboard.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        input.toUpperCase();
        System.out.println("Deine Auswahl ist" + input);
        
        if(input.equals("K")){
            
            //Neuer Kunde anlegen
        
        }else if(input.equals("F")){
    
            //Neues Fahrzeug anlegen
    
        }else if(input.equals("A")){
    
            //Fahrzeug ausleihen
            
        }else if(input.equals("L")){
    
            //Leihverträge auflisten
    
        }else if(input.equals("E")){
            
            //Ende    
    
        }else if(input.equals("")){
    
    
        }else {
                
                System.out.println("Bitte wählen Sie einen gültigen Menüeintrag");
                
        }
               
    
        

        
        
    
    
    
    }


    public static void hauptmenuePrint(){
    
        System.out.println("=========");
        System.out.println("HAUPTMENÜ");
        System.out.println("=========");
        System.out.println("");
        System.out.println("[K] Kunde anlegen");
        System.out.println("[F] Fahrzeug anlegen");
        System.out.println("[A] Fahrzeug ausleihen");
        System.out.println("[L] Leihverträge auflisten");
        System.out.println("[E] Ende");
        System.out.println("");
        
        
        


    }
    
    public static void snoopyPrint(){
    
    
        System.out.println("         .----.");
        System.out.println("      _.'__    `.");
        System.out.println("  .--(#)(##)---/#\\");
        System.out.println(".' @          /###\\");
        System.out.println(" :         ,   #####");
        System.out.println(" `-..__.-' _.-\\###/");
        System.out.println("        `;_:    `\"'");
        System.out.println("     .'\"\"\"\"\"`.");
        System.out.println("    /,  TAC  ,\\");
        System.out.println("   //  COOL!  \\\\");
        System.out.println("   -Car Sharing-");
        System.out.println("   `-._______.-'");
        System.out.println("   ___`. | .'___");
        System.out.println("  (______|______)");
        System.out.println("");
    
    }
    
    public static void kundePrint (Kunde kunde){
    
        System.out.println("Vorname: " + kunde.getFirstName());
        System.out.println("Nachname: " + kunde.getLastName());
        System.out.println("Straße: " + kunde.getRoad());
        System.out.println("Hausnummer: ");
        System.out.println("Postleitzahl: " + kunde.getPlz());
        System.out.println("Ort: " + kunde.getPlace());
        System.out.println("Land: )" + kunde.getContry());
        System.out.println("");
        
    
        

        
    }
    
    public static void fahrzeugPrint (Fahrzeug fahrzeug){
    
        System.out.println("Main.kundePrint()");
        System.out.println("Main.kundePrint()");
        System.out.println("Main.kundePrint()");
        System.out.println("Main.kundePrint()");
        System.out.println("Main.kundePrint()");
        System.out.println("Main.kundePrint()");
        System.out.println("Main.kundePrint()");
        System.out.println("Main.kundePrint()");
       
        
        
    
    }
    
    public static void leihvertragPrint (Leihvertrag leihvertrag){
    
        System.out.println("Main.kundePrint()");
        System.out.println("Main.kundePrint()");
        System.out.println("Main.kundePrint()");
        System.out.println("Main.kundePrint()");
        System.out.println("Main.kundePrint()");
        System.out.println("Main.kundePrint()");
        System.out.println("Main.kundePrint()");
    
        
    }
    
}
