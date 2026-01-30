class EffectiveWeight {
	public static void main(String[] args) {
		double earthGravity = 9.81; // m / s**2
		double moonGravity = 0.17 * earthGravity;
		double myMass = 48.0; // Kilograms
		double myEarthWeight = myMass * earthGravity;

		double myMoonWeight = 0.17 * myMass;

		System.out.println("My Weight on the Moon is: " +
				myMoonWeight + " N");
	}
}
