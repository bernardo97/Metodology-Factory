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
         
      } /*else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
         
      } else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }*/
      
      return null;
   }
}
