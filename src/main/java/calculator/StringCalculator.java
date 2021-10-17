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
		return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);

	}
}