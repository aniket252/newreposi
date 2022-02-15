package practo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class lol {
	
	public static void main(String[] args)throws IOException {
		
	

    Scanner s = new Scanner(System.in);
    
    System.out.println("enter the path:");
    String path = s.next();
    
    System.out.println("enter the file name:");
    String filename= s.next();
    
    FileInputStream f1 = new FileInputStream(path+filename);
    
    int data= f1.read();
    
    while(data!=-1)
    {
    	System.out.print((char)data);
    	data=f1.read();
    }
    System.out.println();
    System.out.println("file has been read sucessfully");
    System.out.println();
    f1.close();
    System.out.println("file has been closed sucessfully");
    
    
	
}
}