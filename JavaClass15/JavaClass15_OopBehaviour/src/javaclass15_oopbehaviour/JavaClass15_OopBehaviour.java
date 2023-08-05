
package javaclass15_oopbehaviour;

import Geo.Circle;
import student.Student;


public class JavaClass15_OopBehaviour {


    public static void main(String[] args) {
        Circle c=new Circle();
//        Circle c=new Circle(5);  insert vale if you jodi control plus circle a click dan ata argument constructor a niye jabe
        
//        c.radius=5;//pass value in circle class radius//for private

         c.setRadius(5);//for private
         
         
         Student s=new Student(1,"sabit");
         
        
        System.out.println("Area: "+c.getArea());
        System.out.println("Perimeter: "+c.getPerimeter());
        
        s.printStudentInfo();//connect with line 20

    }
    
}
