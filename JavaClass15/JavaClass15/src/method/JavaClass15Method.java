
package method;


public class JavaClass15Method {
    
    public int[][] createArray(int row,int col){
        int[][] myArray=new int[row][col];
        
        for(int row1=0;row1<myArray.length;row1++){
            for(int col1=0;col1<myArray[row1].length;col1++){
                myArray [row1][col1]=(int) (Math.random()*100);
            }
        }
        return myArray;
        
        
    }
    
    public int dosum(int [][] myArray){
        int total=0;
        for(int row=0;row<myArray.length;row++){
            for(int col=0;col<myArray[row].length;col++){    //for get lenght of specific row
                
                total=total+myArray[row][col];
            }  
        }
        
        return total;
        
    
    
    }
    
}
