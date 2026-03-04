class VariableControlInForLoop {
	public static void main(String[] args) {
		int shifter = 0;
		for (int i = 1; i > 0; i = (1 << shifter)) {
			System.out.print(i + " ");
			shifter++;
		}
	}
}
