package calculator;

class StringCalculator {

	public int add(String input) {

		String[] numbers = input.split(",");

		if (input.isEmpty()) {
			return 0;
		} else if (input.length() == 1) {
			return Integer.parseInt(input);
		} else {

			return addNum(numbers);
		}
	}

	private int addNum(String[] numbers) {
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum = sum + Integer.parseInt(numbers[i]);
		}
		return sum;

	}
}