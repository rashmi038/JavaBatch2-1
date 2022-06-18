package shekhar;

public class HourGlass {

	public static void main(String[] args) {
		int input = 7;
		int spaceCount = 0;
		for (int i = input; i != 0; i--) {
			spaceCount = printPattern(spaceCount, i, "INCREMENT");
		}
		for (int i = 2; i <= input; i++) {
			spaceCount = printPattern(spaceCount, i, "DECREMENT");
		}
	}

	private static int printPattern(int spaceCount, int rowLength, String stratergy) {
		if (rowLength % 2 == 0) {
			if (stratergy.equals("INCREMENT")) {
				spaceCount++;
			} else {
				spaceCount--;
			}
		} else {
			System.out.println();
			for (int j = 1; j <= spaceCount; j++ ) {
				System.out.print(" ");
			}
			for (int k=1; k <= rowLength; k++) {
				System.out.print("*");
			}
		}
		return spaceCount;
	}

}
