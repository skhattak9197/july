package conctructor;

public class Constructors_Practice {

	String Browser;
	int SlNo;
	String Name;
	int StudentID;
	
	// constructors are block like a method but not a method
	//public, private and protected access modifiers can be used in constructors but famous one is public 
	//constructors name should be same as a class
	//Constructors do not return any value even with a void 
	// how to invoke or execute a constructor? it's Automatically executed when we create an object
	// Types: Parameterized, default constructor ; user-defined constructor
	// We use constructors when we want to initialize an object
	
	public Constructors_Practice(String Browser, int SlNo, String Name, int StudentID ) {
	     this.Browser = Browser;
	     this.SlNo = SlNo;
	     this.Name = Name;
	     this.StudentID = StudentID;
	     		
	}
	public static void main(String[] args) {
		Constructors_Practice objref = new Constructors_Practice ("Chrome",123, "John", 786499);
		Constructors_Practice objref1 = new Constructors_Practice ("Firefox",178, "izzy", 798099);
		Constructors_Practice objref2 = new Constructors_Practice ("Edge",122, "Me", 998809);

	System.out.println(objref.Browser+ objref.SlNo+ objref.Name);
	System.out.println(objref1.Browser+ " " + objref1.SlNo+ " " + objref1.Name+ " ");
	System.out.println(objref2.Browser+ " " + objref2.SlNo+ " " + objref2.Name+ " ");
	}

}
