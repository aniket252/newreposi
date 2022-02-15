package practo;


public class Jake {

     String name;
     double price;
     String author_name;
     
     Jake()
     {
    	 
     }
     
     Jake(String name,String author_name,double price)
     {
    	 super();
    	 this.name=name;
    	 this.price=price;
    	 this.author_name=author_name;
     }

	public String toString()
	{
		return "name: " +name+ " price: " +price + " author_name: " +author_name;
		
	}
     
   
	/*public void display() {
    	 
    	 System.out.println(name);
    	 System.out.println(price);
    	 System.out.println(author_name);
		
	}**/
     
     

}
