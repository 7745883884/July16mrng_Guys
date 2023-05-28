package constructor_uses;

public class ImportanceOfConstuctor {
    
    int emp_id ;
    static String name;
    ImportanceOfConstuctor(String name,int emp_id){  // parametrized constuctor
	
   
    	
    	
    	this.name=name;
    	this.emp_id=emp_id;
    }
    
    
    	 public static void main(String[]args) {
    
    		 System.out.println("name= "+name);
    	
    	ImportanceOfConstuctor e1=new ImportanceOfConstuctor("lokesh",786);
    	ImportanceOfConstuctor e2=new ImportanceOfConstuctor("lucky",143);
    
    }
    
}