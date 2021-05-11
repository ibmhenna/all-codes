public class Math {

	public int add(int... numbers) {
		int result = 0;
		int counter = 0;
		while (counter < numbers.length) {
			result += numbers[counter++];

		}
		return result;
	}

	/**
	 * takes 2 number and multiply them
	 */
	int multiply(int... numbers) {
		int result = 1;
		int count = 0;
		while (count < numbers.length) {
			int currentNumber = numbers[count++];
			if (currentNumber < 0) {
				throw new IllegalArgumentException();
			}
			result *= currentNumber;
		}
		return result;
	}
}

//add should take any number of integers and return the result