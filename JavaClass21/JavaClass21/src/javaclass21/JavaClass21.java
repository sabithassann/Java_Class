
package javaclass21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JavaClass21 {

   
    public static void main(String[] args) throws FileNotFoundException {
        Scanner read=new Scanner(new File("C:\\Users\\user\\Desktop\\mynewfile.txt"));//need to use throw for solve
//        File file=new File("C:\\Users\\user\\Desktop\\mynewfile.txt");//for better practice of 17 no line
//        Scanner read=new Scanner(file);
        
        PrintWriter pw=null;
        try {
            //        //The File Class  page 498
//new File("C:\\Users\\user\\Desktop\\mynewfile.txt"));//
//        File file =new File("C:\\Users\\user\\Desktop\\myfile.txt");
//        
//        System.out.println(file.canRead());
//        System.out.println(file.length());
//        System.out.println("is it in folder "+file.isDirectory());
//        System.out.println(new Date(file.lastModified()));


         pw =new PrintWriter("C:\\Users\\user\\Desktop\\mynewfile.txt");
         pw.print("Hello sabit");
         
         
         
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JavaClass21.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            pw.close();
        }
        
       // System.out.println(read.next());
        System.out.println(read.nextLine());
        
    }
    
}
