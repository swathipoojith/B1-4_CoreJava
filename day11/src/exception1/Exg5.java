package exception1;
import java.io.IOException
public class Exg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		void myMethod(int num)throws IOException, ClassNotFoundException
		{ 
	     if(num==1)
	        throw new IOException("IOException Occurred");
	     else
	        throw new ClassNotFoundException("ClassNotFoundException");
		} 


	  public static void main(String args[])
	  { 
	   try
	   { 
		   Exg5  obj=new Exg5 (); 
	        obj.myMethod(1); 
	    }
	    catch(Exception ex){
	     System.out.println(ex);
	    } 
	  }
	}