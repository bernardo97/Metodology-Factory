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
public class Metodology_Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("-------Bienvenido a la fabrica de Vehiculos-----\n");
        System.out.println("A sus ordenes: ");
        AutoFactory autoFactory = new AutoFactory();

      //get an object of Circle and call its draw method.
      drawn a1 = autoFactory.getDrawn("Automovil");
      drawn a2 = autoFactory.getDrawn("Motocicleta");
      
      drawn a3 = autoFactory.getDrawn("Helicoptero");

      //call draw method of Circle
      a1.draw();
      a2.draw();
      a3.draw();
    }
    
}
