package Array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SerializingArrays {
    
    public static void main(String[] args) throws ClassNotFoundException {
        
        int[] numbers = {10, 20, 30, 40};
        String[] strings = {"John", "Susan", "Kim"};
        
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\user\\Desktop\\array.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            
            // Write the arrays
            objectOutputStream.writeObject(numbers);
            objectOutputStream.writeObject(strings);
            
            // Close 
            objectOutputStream.close();
            fileOutputStream.close();
            
            System.out.println("Arrays serialized and saved to array.dat");
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SerializingArrays.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e) {
            Logger.getLogger(SerializingArrays.class.getName()).log(Level.SEVERE, null, e);
        }
        
        
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\user\\Desktop\\array.dat");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            
            int[] newNumbers = (int[]) inputStream.readObject();
            String[] newStrings = (String[]) inputStream.readObject();
            
            // Close the stream
            inputStream.close();
            
            System.out.println("Deserialized Arrays:");
            for (int num : newNumbers) {
                System.out.println("Number: " + num);
            }
            
            for (String str : newStrings) {
                System.out.println("String: " + str);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}