class InchesToMetersTable {
	public static void main(String[] args) {
		double inches, meters;
		int counter;

		counter = 0;
		for(inches = 1; inches <= 12 * 12 /* 12 Feet */; inches++) {
			meters = (1 / 39.37) * inches;
			System.out.println(inches + " inches is " + meters + " meters.");

			counter++;
			if(counter == 12) {
				System.out.println();
				counter = 0;
			}
		}
	}
}
