
package sirevidence;

import java.util.Arrays;
import java.util.Scanner;


public class SirEvidence {


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int i,inputIndexNumber,num;
        
        int myArray []=new int [100];
        
        for( i=0;i<myArray.length;i++){
            myArray[i]=(int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(myArray));
        
        System.out.println("Enter Index Number");
         inputIndexNumber=sc.nextInt();
        
         try {
        num=myArray[inputIndexNumber];
        
        System.out.println(num+" is located in "+inputIndexNumber+" no index");
        } catch (Exception e) {
             System.out.println("Out Of Bound");
        }
         
        
        
        
    }
    
}
