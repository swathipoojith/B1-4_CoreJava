package exception1;

public class Exg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{  
	        int num=121/5;  
	        System.out.println(num); 
	        System.exit(0);
      }  
      catch(ArithmeticException e){
         System.out.println("Number should not be divided by zero");
      }  
      catch(NullPointerException e){
	         System.out.println("Null Pointer Exception");
	      } 
      finally{
	    System.out.println("This is finally block");
      }  
      System.out.println("Out of try-catch-finally");  
   }   
}