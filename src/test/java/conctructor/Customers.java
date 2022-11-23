package conctructor;

public class Customers {

	String Browser;
	String Name;
	int AccNo;
	
	
	public Customers (String Browser, String Name, int AccNo) {
		this.Browser = Browser;
		this.Name = Name; 
		this.AccNo = AccNo;
		
	}
	
	
	
	public static void main(String[] args) {
	Customers objref = new Customers ("Chrome", "Johnny", 9876543);
	Customers objref1 = new Customers ("Edge", "Smith", 6783457);
	Customers objref2 = new Customers ("Firefox", "Linda", 67838957);

     System.out.println(objref.Browser+ " " + objref.Name+ " " + objref.AccNo);
	System.out.println(objref1.Browser+ " " +objref1.Name+ " " +objref1.AccNo);
	System.out.println(objref2.Browser+ " " +objref2.Name+ " " +objref2.AccNo);

	}

}
