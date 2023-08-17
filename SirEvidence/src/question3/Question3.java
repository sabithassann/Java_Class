
package question3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import student.Student;


public class Question3 {
     public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        student.Student student=new Student();
        
        Student[] students= {
         new Student("sabit", 26),
         new Student("Nahid", 27),
         new Student("Santo", 28),
         new Student("Hasan", 30),
         new Student("Tameem", 24),
     };
        
         FileOutputStream fileOutputStream=new FileOutputStream("students.dat");
         ObjectOutput objectOutput=new ObjectOutputStream(fileOutputStream);
         
         objectOutput.writeObject(students);
         
         FileInputStream fileInputStream=new FileInputStream("students.dat");
         ObjectInput objectInput=new ObjectInputStream(fileInputStream);
         
         Student[] read=(Student[]) objectInput.readObject();
         System.out.println("Details:\n"+Arrays.toString(read));
         
    }
    
}

