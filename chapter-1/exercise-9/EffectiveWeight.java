class EffectiveWeight {
	public static void main(String[] args) {
		double earthGravity = 9.81; // m / s**2
		double myMass = 48.0; // Kilograms

		double myMoonWeight = 0.17 * myMass * earthGravity;

		System.out.println("My Weight on the Moon is: " +
				myMoonWeight + " N");
	}
}
