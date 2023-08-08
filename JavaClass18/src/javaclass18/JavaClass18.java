
package javaclass18;

import java.util.Scanner;
import price.Price;


public class JavaClass18 {

    
    public static void main(String[] args) {
        Price total= new Price();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter quantity");
        int input1=sc.nextInt();
        System.out.println("Please enter Double price");
        double input2=sc.nextDouble();
        
        total.setQuantity(input1);
        total.setUnitPrice(input2);
        
        
        
        
        total.calculateTotalPrice(input1,input2);
        

    }
    
}
