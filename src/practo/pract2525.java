package practo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class pract2525 {
	
	public static void main(String[] args) {
		
		Scanner s = new  Scanner(System.in);
		System.out.println("enter the path: ");
		String path = s.next();
		
		System.out.println("enter the file name: ");
		String filename = s.next();
		
		System.out.println("enter the data to be written in the file:");
		s.nextLine();
		String data = s.nextLine();
		
		try {
		     FileOutputStream f1 = new FileOutputStream(path+filename);
		
		     System.out.println("file created and opened successfully:");
		
		for (int i = 0; i < data.length(); i++) {
		
			try {
				
				f1.write(data.charAt(i));
			}
			catch (IOException e) {
				
				System.out.println("data could not be written sucessfully");
			}
		}
				
				System.out.println("data written succesfully");
				
				try {
					
					
					f1.close();
					System.out.println("file closed successfully");
					
				}
				catch (IOException e1) {
				System.out.println("file could not be closed");	
					
				}
					// TODO: handle exception
				}
			
			catch (FileNotFoundException H) {
				
				{
					System.out.println("please enter the correcy path and file name");
				}
				// TODO: handle exception
			}
				}
				// TODO: handle exception
			}
			
			
		
	




