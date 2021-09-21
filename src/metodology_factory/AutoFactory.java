/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metodology_factory;

/**
 *
 * @author bolon
 */
public class AutoFactory {
     public drawn getDrawn(String tipovehi){
      if(tipovehi == null){
         return null;
      }		
      if(tipovehi.equalsIgnoreCase("Automovil")){
         return new automovil();
         
      } else if(tipovehi.equalsIgnoreCase("Motocicleta")){
         return new Motocicleta();
         
      } else if(tipovehi.equalsIgnoreCase("Helicoptero")){
         return new Helicoptero();
         
      } else if(tipovehi.equalsIgnoreCase("Lockheed SR-71")){
         return new Blackbird();
      }
      
      return null;
   }
}
