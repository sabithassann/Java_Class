
package javaclass_11;

import Methods.JavaClass_11methods;
import TestM.TestMethods;
import java.util.Scanner;


public class JavaClass_11 {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Pls enter number 1");
        int n1=sc.nextInt();
        System.out.println("Pls enter number 2");
        int n2=sc.nextInt();
        
        TestMethods test=new TestMethods();
        JavaClass_11methods dm=new JavaClass_11methods();
        
        System.out.println("multi "+test.doMulti(n1, n2));
        System.out.println("sum "+dm.doMulti2(n1, n2));
        
        
        
        
        
       
        
    }
    
}
