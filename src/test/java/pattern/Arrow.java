package pattern;

public class Arrow {

	public static void main(String[] args) {
		
		for (int i=1; i<=10 ; i++) {
			System.out.println();
		for (int j=1; j<=i; j++) {
			System.out.print("* ");
		}
		}

	for (int k=1; k<=10; k++) {
		System.out.println();
	for (int l = 10; l>=k; l--) {
		System.out.print("* ");
	}
	}
	}

}
