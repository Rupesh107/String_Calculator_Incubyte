package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

	private StringCalculator stringCalculator = new StringCalculator();

	@Test
	void empty_string_should_return_0() {

		assertEquals(0, stringCalculator.add(""));
	}

	@Test
	void string_with_single_number_should_return_number_as_int() {

		assertEquals(1, stringCalculator.add("1"));
	}

	@Test
	void string_with_two_numbers_will_return_a_number_as_their_sum() {
		assertEquals(3, stringCalculator.add("1,2"));
	}

	@Test
	void string_with_unknown_amount_of_numbers_will_return_number_as_their_sum() {
		assertEquals(36, stringCalculator.add("1,2,3,4,5,6,7,8"));
	}

	@Test
	void string_with_new_line_between_numbers_will_return_a_number_as_their_sum() {
		assertEquals(6, stringCalculator.add("1\n2,3"));
	}

}
