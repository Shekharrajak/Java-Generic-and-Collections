
public class GenericMultiBound {
	
	public class GeneralDAO<T extends Entity> {
	 
	    public void save(T entity) {
	        // code to save entity details to database
	    }
	 
	    public T get(long id) {
	        // code to get details from database...
	        // ...and return a T object
	    }
	}
	

	/*
We can use the syntax <T extends X & Y & Z> to define a generic class whose type
 parameter can be sub types of multiple types. Here, X, Y, Z can be classes and
  interfaces. Remember if there is a class, the class must be the first in the list.
For example, the following generic class is designed works with only types that 
are sub types of Runnable and JFrame:


	*/
	public class WindowApp<T extends JFrame & Runnable> {
	    T theApp;
	 
	    public WindowApp(T app) {
	        theApp = app;
	    }
	}
	
	public static void main(String[] args){
		
	}	
}