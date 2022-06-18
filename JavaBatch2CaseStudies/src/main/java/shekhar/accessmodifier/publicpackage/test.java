package shekhar.accessmodifier.publicpackage;

public class test {

	public static void main(String[] args) {
		PublicTest publicTest = new PublicTest();
		System.out.println(publicTest.hello);
		publicTest.printMe("Vola!");
	}

}
