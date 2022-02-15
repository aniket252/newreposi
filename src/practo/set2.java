package practo;
import java.util.Scanner;
public class set2 {
	
	  public static void main(String[] args) {
		
try {	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the numerator");
	int num =  sc.nextInt();
	
	System.out.println("enter the denomenator");
	int dum = sc.nextInt();
	


	int res=num/dum;
       
    System.out.println(res);
	
}

catch (ArithmeticException e) {
	
	System.out.println("please enter denomenator other than 0");
}
}
}