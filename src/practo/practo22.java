package practo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class practo22 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the path:");
		String path = s.next();
		
		System.out.println("enter the file name:");
		String filename = s.next();
		
		System.out.println("enter the data u want to enter in the file");
		String data = s.next();
		 try {		 

			FileOutputStream f1 = new FileOutputStream(path+filename);
			System.out.println("file created and opened sucessfully");
			
			
	     	   for (int i = 0; i < data.length(); i++)
	     	   {
			try {   
		 	  f1.write(data.charAt(i));
		   
			  
	
			}
			
			catch (IOException e) {
				System.out.println("data can not be entred:");
			}
			
			  System.out.println("data entred successfully:");
          }
			
			try {
			f1.close();
			
			System.out.println("file has been closed  successfully:");
		   }
			catch (IOException e) {
				System.out.println("file can not closed");
			}
          }
          catch (FileNotFoundException e) {
			System.out.println("please enter correct info");
		}
		
          }
}
	
			
		
		
    
