
package mainproject;

import DoMathPacake.DoMath;
import java.util.Scanner;


public class MainProject {

   
    public static void main(String[] args) {
        DoMath test= new DoMath();
        System.out.println("Pls enter the number");
        Scanner sc=new Scanner(System.in);
        int input1=sc.nextInt();
        
        System.out.println(input1+" is "+test.doMath(input1));
                
    }
    
}
