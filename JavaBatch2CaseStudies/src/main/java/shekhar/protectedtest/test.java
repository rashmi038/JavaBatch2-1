package shekhar.protectedtest;

public class test {

	public static void main(String... args) {
		ProtectedTest protectedTest = new ProtectedTest();
		System.out.println(protectedTest.message);
		protectedTest.printMesage();
	}
}
