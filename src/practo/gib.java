package practo;


import java.util.ArrayList;
public class gib {
	
	public static void main(String[] args) {
		
	

	ArrayList<Object> a1 = new ArrayList<>();
	
	a1.add(15);
	a1.add("Aniket");
	System.out.println(a1);
	System.out.println(a1.contains("Aniket"));
	System.out.println(a1.get(0));
	System.out.println(a1.indexOf("Aniket"));
	System.out.println(a1.size());
	System.out.println(a1.isEmpty());
	System.out.println(a1.get(1));
	a1.add("tale");
	System.out.println(a1);
	System.out.println(a1.clone());
	System.out.println(a1.iterator());
	System.out.println(a1.lastIndexOf("tale"));
	System.out.println(a1.remove(2));
	System.out.println(a1);
     a1.add(0, a1);
    System.out.println(a1.remove("Aniket"));
    System.out.println(a1.remove(1));
    

	}
}
