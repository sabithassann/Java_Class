
package javaclass21scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JavaClass21Scanner {

   
    public static void main(String[] args) throws FileNotFoundException, MalformedURLException {
//        File file=new File("C:\\Users\\user\\Desktop\\testscanner.txt");
//        Scanner read=new Scanner(file);
//        PrintWriter pw=null;

        String url="http://google.com/";
        
        URL uri=new URL(url);
        
        try {
            Scanner read=new Scanner(uri.openStream());
            
            while (read.hasNext()) {                
                String line=read.nextLine();
                System.out.println(line);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(JavaClass21Scanner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
