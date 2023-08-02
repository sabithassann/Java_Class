
package javaclass13;

import java.util.Arrays;
import java.util.Random;


public class JavaClass13 {


    public static void main(String[] args) {
        
//        String [] studentNames=new String[10];
//        studentNames [0]="Rajib";
//        studentNames [1]="Limon";
//        studentNames [9]="Sabit";
//        studentNames [5]="Tameem";
//        
//        System.out.println(Arrays.toString(studentNames));
//        
//        
////        for each loop
//        int [] marks=new int[10];
//        marks[0]=20;
//        marks[1]=30;
//        marks[2]=40;
//        marks[3]=50;
//        
//        for(int j:marks){
//            System.out.println(j);
//        }
//        
//        for(int i=0;i<marks.length;i++){
//            System.out.println("The mark is "+marks[i]+"and the name is "+studentNames[i]);
//        }
//        
////        int k=1;
////        for(int i=0;i<studentNames.length;i++){
////            for(int j:marks){
////              k=j*1;
////              System.out.println("num "+k);
////        }
////           
////        }
//
//
//        String[] subjects={"jee","html","css","js"};
//        System.out.println(Arrays.toString(subjects));
        
        
        int[] test = new int[10];
        int max=0;int min=999;
        
        for (int i = 0; i < test.length; i++) {
            int random = (int) (Math.random() * 100);
            test[i] = random;
//            if(test[i]>max){
//                max=test[i];
//                
//            }
              max=(test[i]>max)?test[i]:max;
              min=(test[i]<min)?test[i]:min;
//            else if(test[i]<min){
//                min=test[i];
//            }

            System.out.println("random "+test[i]);
//            System.out.println("max "+ max);
 
        }
        System.out.println("max number "+max);
        System.out.println("The min number is " +min);
//        System.out.println("The minimum number is "+min);
    }   
    
}
