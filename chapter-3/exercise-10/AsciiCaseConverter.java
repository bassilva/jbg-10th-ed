class AsciiCaseConverter {
	public static void main(String[] args)
		throws java.io.IOException {
		char c;
		int count = 0;
		do {
			c = (char) System.in.read();
			boolean isLowerCase = (96 < c) & (c < 123);
			boolean isUpperCase = (64 < c) & (c < 91);

			if (isLowerCase) {
				c = (char) (c - 32);
				count++;
			}

			if (isUpperCase) {
				c = (char) (c + 32);
				count++;
			}

			System.out.print(c);
		} while(c != '.');

		System.out.println();
		System.out.println("Converted " + count + " characters.");
	}
}
