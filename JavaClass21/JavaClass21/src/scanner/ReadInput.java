
package scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class ReadInput {
    public static void main(String[] args) throws FileNotFoundException  {
        
        File file=new File("C:\\Users\\user\\Desktop\\testscanner.txt");
        Scanner read=new Scanner(file);
//        PrintWriter pw=new PrintWriter(file);
        
//       pw.println("Hello java");
//      
//       pw.close();
       
//        while (read.hasNext()) {   
//            
//            String line=read.nextLine();
//            String[] words=line.split("\\s+");
            

        if(file.exists()){
            String tenWords="";
            int count=0;
            while(read.hasNext()){
                String word=read.next();
                tenWords =tenWords+word+" ";
                count++;
                
                if (count==10) {
                    System.out.println("line no "+count);
                    count=0;
                    tenWords="";
                }
               
            }
            
            
        }


        

     
       read.close();
            
            
            
//       if(file.exists()){
//            System.out.println(read.nextLine());
//      }else{
//          System.out.println("File is empty");
//       }  
//        }
//
//     
//       read.close();
       
    }
}


