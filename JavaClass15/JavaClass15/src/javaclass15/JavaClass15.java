
package javaclass15;

import java.util.Arrays;
import java.util.Scanner;
import method.JavaClass15Method;


public class JavaClass15 {


    public static void main(String[] args) {
        JavaClass15Method method=new JavaClass15Method();
        Scanner sc=new Scanner(System.in);
        int input1=sc.nextInt();
        int input2=sc.nextInt();
        
        int [][] newArray=method.createArray(input1, input2);
        int  sum=method.dosum(newArray);
         
////        int [][] m=new int[3][5]; //for initialize value
//        int [][] n={{1,2,3,4},{1,2,3,4}};
//        int [][] n1={{1,2,3,4},{1,2,3}};
//        
//        
////        for random
//        int [][] random=new int[5][3];
//        for(int row=0;row<random.length;row++){
//            for(int col=0;col<random[row].length;col++){
//                random [row][col]=(int) (Math.random()*100);
////                System.out.println("in loop " +Arrays.toString(random));
//            }
//        }
//        
//        System.out.println("The sum of n "+ method.dosum(n));
//        System.out.println("The sum of n1 "+ method.dosum(n1));
////        for random
//        System.out.println(Arrays.deepToString(random)+" The sum of random "+method.dosum(random));
////        System.out.println(Arrays.toString(random)); //use deepToString insted of toString


        

         System.out.println(Arrays.deepToString(newArray));
         System.out.println("sum "+sum);
                
        
    }
    
}
