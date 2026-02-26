class CountSpacesUntilDot {
	public static void main(String[] args)
		throws java.io.IOException {
		int count = 0;
		for(char c = (char) System.in.read(); c != '.'; c = (char) System.in.read()) {
			if (c == ' ')
				count++;
		}
		
		System.out.println(count);
	}
}
