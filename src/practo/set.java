package practo;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.TreeSet;
public class set {

	       public static void main(String[]args)
	       {
	    	   ArrayList<String> h1 = new ArrayList<>();
	    	   h1.add("AKOLA");
	    	   h1.add("PUNE");
	    	   h1.add("WANI");
	    	   h1.add("AKOLA");
	    	   
	            System.out.println(h1);
	            
	            
	            
	            TreeSet<String> t1 = new TreeSet<>(h1);
	            
	            System.out.println(t1);
	       }


}
