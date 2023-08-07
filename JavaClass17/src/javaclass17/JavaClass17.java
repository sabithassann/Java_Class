
package javaclass17;

import java.util.Scanner;


public class JavaClass17 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String number="+880-16-19192323";
        System.out.println(number.matches("[$+#]\\d{3}-\\d{2}-\\d{8}")); //return true or false
        
        
        String input=sc.next();
        if(input.matches("[$+#]\\d{3}-\\d{2}-\\d{8}")){
            System.out.println("Valid number");
        }
        else{
            System.out.println("Invalid number");
        }
        
        
        StringBuilder input1=new StringBuilder();
        input1.append("Hello ");
        input1.append("Java");
        System.out.println(input1);
        System.out.println(input1.reverse());
        
        
        
//        String format in java   (search online)
    }
    
}
