package strings;

public class Strings_Reverse {

	public static void main(String[] args) {

 String s1 = "AJNKDAJ!@#%%#hkhkda99999";
 
 s1 = s1.replaceAll("[^A-Z,0-9 , a-z, #]", " " );
System.out.println("the updated value :" + s1);

	}

}
