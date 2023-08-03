
package array;


public class Array {
    public  void fixedMinMaximum(int a,int [] myArray) { //method name start with camel case
        
        for(int val:myArray){
            if(val==a){
                System.out.println("Value Found");
                break;
            }
            else{
                System.out.println("Value not Found");
            }
        }
        
    }
    
}
