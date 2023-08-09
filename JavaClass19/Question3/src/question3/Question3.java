
package question3;

import vehicle.Vehicle;
import vehicle.Truck;


public class Question3 {


    public static void main(String[] args) {


        Vehicle vehicle = new Vehicle();
        vehicle.speed = 100;
        vehicle.regularPrice = 2000.0;
        vehicle.color = "Red";
        
        
        Truck truck = new Truck(); 
         
        truck.speed = 80;
        truck.regularPrice = 3000.0;
        truck.color = "Blue";
        truck.weight = 2500;

        System.out.println("Vehicle sale price: " + vehicle.getSalePrice());
        System.out.println("Truck sale price: " + truck.getSalePrice());
    }
}




