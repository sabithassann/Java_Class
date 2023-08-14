
package javaclass23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class JavaClass23 {


    public static void main(String[] args) {
        
        try {
            FileInputStream fis=new FileInputStream(" C:\\Users\\user\\Desktop\\text.dat");
        } catch (IOException e) {
        }
        
    }
    
}
