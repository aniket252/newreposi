package practo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class lol2 {
public static void main(String[] args)throws IOException {
	

       Scanner s = new Scanner(System.in);
       System.out.println("enter the the path:");
       
       String path = s.next();
       
       System.out.println("enter the file name");
       String filename = s.next();
       
       FileInputStream f2 =  new FileInputStream(path+filename);
       System.out.println("file has been found sucessfully");
       
       int data = f2.read();
       
       while(data!=-1)
       {
    	 
    	  System.out.print((char)data);
    	  
    	  data = f2.read();
       }
       
       f2.close();
      
}
}