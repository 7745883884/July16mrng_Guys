package marvels_Universe;

public class LokeshDreams {
public void  LokeshDreams() {
    System.out.println("Lokesh have lot of Dreams to complete"); // null or zero argument
    }
   public void  LokeshDreams(String car) {// in method signature we have arguments parameter
  System.out.println("Lokesh want to gift a car to his parents=" +car);// one argument present
    }
    public void LokeshDreams(int bhk,String houseRoom) {// we can give a different method name (LokeshD)as well..! no issue.
   System.out.println("Lokesh want to build House="+bhk+" houseRoom");// two argument present.
    }
    public static void main(String[]args) {
    	//Object RefVariable.MethodName with Argument value Signature followed by semicolon.
    	
    	
    	
    	LokeshDreams t=new LokeshDreams();
    	t.LokeshDreams();// argument values
    	t.LokeshDreams("bugati shiron");// how to call a method having an arguments
    	t.LokeshDreams(3,"BHK House");
    	  
    }
     // my method is going to be executed on the basis of arguments ,
      
   // whatever value i am providing by calling the method that will go inside the method and this method is executed then this 
    //Bugati shiron inters the car variable and then string getting activated or signature getting activated ,when signature getting
    // getting activated due to my method getting activated then the method body getting executed .
} 
