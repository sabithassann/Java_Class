
package javaclass12;


public class JavaClass12 {


    public static void main(String[] args) {
        
        int i = 1;
        while (i <= 6) {
            method1(i, 2);
            i++;
        }
    }

    public static void method1(
            int i, int num) {
        for (int j = 1; j <= i; j++) {
            System.out.print(num + " ");
            num = num * 2;  //num=2 that calls in method1
        }
        System.out.println();



//        int max=0;
//        max(1, 2, max);
//        System.out.println(max);
//    }
//
//    public static int max(
//            int value1, int value2, int max) {
//        if (value1 > value2) {
//           return  max = value1;
//        } else {
//           return max = value2;
//        }

       


//        int times = 3;
//        System.out.println("Before the call,"
//                + " variable times is " + times);
//// Invoke nPrintln and display times
//        nPrintln("Welcome to Java!", times);
//        System.out.println("After the call,"
//                + " variable times is " + times);
//    }
//// Print the message n times
//
//    public static void nPrintln(
//            String message, int n) {
//        while (n > 0) {
//            System.out.println("n = " + n);
//            System.out.println(message);
//            n--;
//        }



//          out of box: use xpath


    }
    
}
