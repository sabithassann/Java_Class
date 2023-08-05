
package student;


public class Student {
    
    private int id;
    private String name;
    private String email;
    private String cell;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    
    
    
    
    public  void printStudentInfo(){
        System.out.println(id+" "+name+" "+email);
        
    }
    
}
