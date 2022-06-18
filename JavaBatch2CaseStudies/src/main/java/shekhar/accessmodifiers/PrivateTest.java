package shekhar.accessmodifiers;

public class PrivateTest {

	private String hello = "hello";
	 
	
	public static void main(String[] args) {
		PrivateTest privateTest = new PrivateTest();
		privateTest.printHello();
	}


	private void printHello() {
		System.out.println(hello);
	}

}
