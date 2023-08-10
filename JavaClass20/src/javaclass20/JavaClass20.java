
package javaclass20;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaClass20 {

    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
//        ArrayList< Integer> arrayList=new ArrayList<Integer>(); //Integer wrapper class you can not use primitive type like int in this
//        
//        arrayList.add(20);
//        System.out.println("Add "+arrayList); //in 456 page   The ArrayList Class



         Scanner sc=new Scanner(System.in);
         boolean stop=true;
         
         
         do {
             try {
                 System.out.println("Enter a intiger number");
                 int input=sc.nextInt();
                 System.out.println("The number is "+input);
                 //break;
                 stop=false;
             } catch (Exception e) {
                 System.out.println("Try again "+sc.nextLine());
                  String errorMessage = e.getMessage();
                 if(errorMessage != null && errorMessage.equals("sabit")   ){
                     System.out.println("try again sabit sdfdffd");
                 }
                 
        }  
         
        }
       while (stop);
        sc.close();
   
    
      }
}
