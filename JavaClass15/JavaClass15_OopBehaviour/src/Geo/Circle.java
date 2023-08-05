
package Geo;


public class Circle {
    private double radius; //declare a variable //for getting value from main class //status//use public for main class 15 no line
                            //radius declare whole class
    
//    create default constructor
    public Circle() {                //unselect checkbox for create//class name and constructor name start with pascel case//default behaviour
        
    }
    
//    create argument constructor

    public Circle(double radius) {             //select checkbox//if you insert 5 in line 12 by doing this u add behaviour
        this.radius = radius;
    }

    
    
    
    
    public void setRadius(double r) {
        if(r>=1){
            this.radius = r;                              //for private
        }else{
            System.out.println("Please Enter a Positive Number ");
        }
        
        
    }
    
    
    public double getArea(){ //getArea Behaviour
        
        double area=Math.PI*radius*radius;
        return area;
    }
    
    public double getPerimeter(){
        double perimeter=2*Math.PI*radius;
        return perimeter;
    }
}
