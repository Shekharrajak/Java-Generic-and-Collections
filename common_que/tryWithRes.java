/*

The try-with-resources statement is a try statement that declares
 one or more resources. A resource is an object that must be closed after
the program is finished with it. 

The try-with-resources statement ensures that each resource is 
closed at the end of the statement. Any object that implements
 java.lang.AutoCloseable, which includes all objects which implement
 java.io.Closeable, can be used as a resource.

*/

import java.io.FileOutputStream; 

public class tryWithRes {    
	public static void main(String args[]){      
		        // Using try-with-resources  
		try(FileOutputStream fileOutputStream =new FileOutputStream("/src/abc.txt")){      
			String msg = "Welcome to javaTpoint!";      
			byte byteArray[] = msg.getBytes(); //converting string into byte array      
			fileOutputStream.write(byteArray);  
			System.out.println("Message written to file successfuly!");      
		}catch(Exception exception){  
		       System.out.println(exception);  
		}


		// using Using Multiple Resources

		try(    // Using multiple resources  
	        FileOutputStream fileOutputStream =new FileOutputStream("/java7-new-features/src/abc.txt");  
	        InputStream input = new FileInputStream("/java7-new-features/src/abc.txt")){  
	        // -----------------------------Code to write data into file--------------------------------------------//  
	        String msg = "Welcome to javaTpoint!";      
	        byte byteArray[] = msg.getBytes();  // Converting string into byte array      
	        fileOutputStream.write(byteArray);  // Writing  data into file  
	        System.out.println("------------Data written into file--------------");  
	        System.out.println(msg);  
	        // -----------------------------Code to read data from file---------------------------------------------//  
	        // Creating input stream instance  
	        DataInputStream inst = new DataInputStream(input);    
	        int data = input.available();    
	        // Returns an estimate of the number of bytes that can be read from this input stream.   
	        byte[] byteArray2 = new byte[data]; //    
	        inst.read(byteArray2);    
	        String str = new String(byteArray2); // passing byte array into String constructor  
	        System.out.println("------------Data read from file--------------");  
	        System.out.println(str); // display file data  
		}catch(Exception exception){  
		       System.out.println(exception);  
		}  

      
	}      
} 