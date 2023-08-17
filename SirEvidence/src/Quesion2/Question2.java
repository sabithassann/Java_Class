
package Quesion2;

import vehicle.Car;
import vehicle.Motorcycle;
import vehicle.Vehicle;


public class Question2 {
    public static void main(String[] args) {
        vehicle.Vehicle mycar=new Car();
        vehicle.Vehicle motorCycle=new Motorcycle();
        
        mycar.start();
        mycar.stop();
        
        
        System.out.println("");
        
        motorCycle.start();
        motorCycle.stop();
        

    }
}
